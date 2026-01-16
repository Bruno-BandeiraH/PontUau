package com.flightontime.api.infra.validations;


import com.flightontime.api.dto.PredictionRequestDTO;

public interface RepositoryValidator {
    void validator(PredictionRequestDTO data);

}
