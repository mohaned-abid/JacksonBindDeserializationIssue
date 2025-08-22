package com.test;

import com.example.common.error.ErrorType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.junit.jupiter.api.Test;

class ErrorTypeTest {

    @Test
    void OneArgConstructorDeserializationFailsWithMismatchedInputExceptionOnJacksonBind2_18() throws Exception {
        String json = "\"record_not_found\"";
        ObjectMapper mapper = JsonMapper.builder()
                .addModule(new ParameterNamesModule())
                .build();

        ErrorType.Wrapper wrapper = mapper.readValue(json, ErrorType.Wrapper.class);
    }
}
