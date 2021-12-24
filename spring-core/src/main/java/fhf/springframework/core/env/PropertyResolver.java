package fhf.springframework.core.env;

import fhf.springframework.lang.Nullable;

public interface PropertyResolver {
    boolean containsProperty(String key);

    @Nullable
    String getProperty(String key);

    String getProperty(String key, String defaultValue);

    <T> T getProperty(String key,Class<T> targetType);

    <T> T getProperty(String key,Class<T> targetType, T defaultValue);

    <T> T getRequiredProperty(String key, Class<T> targetType) throws IllegalStateException;

    String resolvePlaceholders(String text);

    String resolveRequiredPlaceholders(String text) throws  IllegalStateException;
}
