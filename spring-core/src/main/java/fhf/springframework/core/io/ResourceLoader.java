package fhf.springframework.core.io;

import fhf.springframework.lang.Nullable;
import fhf.springframework.util.ResourceUtils;

public interface ResourceLoader {
    String CLASSPATH_URL_PREFIX = ResourceUtils.CLASSPATH_URL_PREFIX;
    Resource getResource(String location);

    @Nullable
    ClassLoader getClassLoader();
}
