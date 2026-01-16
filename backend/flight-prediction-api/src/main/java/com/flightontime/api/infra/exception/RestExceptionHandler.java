package com.flightontime.api.infra.exception;

import com.flightontime.api.infra.ValidatorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class RestExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ExceptionHandler(ValidatorException.class)
    public ResponseEntity<ValidationError> handleValidationExceptions(ValidatorException ex) {
        var error = new ValidationError(ex.getField(), ex.getMessage());
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ValidationError>> handleBeanValidation(MethodArgumentNotValidException ex) {
        var errors = ex.getFieldErrors().stream()
            .map(err -> new ValidationError(
                err.getField(),
                err.getDefaultMessage()
            )).collect(Collectors.toList());
        return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ValidationError> error404(ResourceNotFoundException ex) {
        var error = new ValidationError("not_found", "Conteúdo não encontrado");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ValidationError> error500(Exception ex) {
        log.error("Erro inesperado", ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ValidationError(
            "internal_error",
            "Ocorreu um erro inesperado"
        ));
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ValidationError> jsonError(HttpMessageNotReadableException ex) {
        var error = new ValidationError("invalid_json", "JSON malformado ou com tipos inválidos");
        return ResponseEntity.badRequest().body(error);
    }

    private record ValidationError(String field, String message) {
        public ValidationError(FieldError error) {
            this(error.getField(), error.getDefaultMessage());
        }
    }
}
