package fhf.springframework.core;

import fhf.springframework.lang.Nullable;

public class NestedRuntimeException extends RuntimeException {
    public NestedRuntimeException(String msg) {
        super(msg);
    }

    public NestedRuntimeException(@Nullable String msg, @Nullable Throwable cause) {
        super(msg, cause);
    }
}
