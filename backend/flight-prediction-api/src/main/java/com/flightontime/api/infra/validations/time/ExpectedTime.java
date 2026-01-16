package com.flightontime.api.infra.validations.time;

import com.flightontime.api.dto.PredictionRequestDTO;
import com.flightontime.api.infra.ValidatorException;
import com.flightontime.api.infra.validations.RepositoryValidator;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ExpectedTime implements RepositoryValidator {
    @Override
    public void validator(PredictionRequestDTO data) {
        if (data.expectedTime().isAfter(LocalDateTime.now().plusYears(1))) {
            throw new ValidatorException("partida_prevista", "A data não pode ser superior a 1 ano");
        }
    }
}
