package com.example.common.error;

public enum ErrorType {
    RECORD_NOT_FOUND("record_not_found"),
    UNKNOWN_ERROR("unknown_error"),
    SERVICE_UNAVAILABLE("service_unavailable");

    private final String code;

    ErrorType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public Wrapper wrapper() {
        return new Wrapper(code);
    }

    public static class Wrapper {
        private final String value;

        public Wrapper(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
