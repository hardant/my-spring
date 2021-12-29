package fhf.springframework.core.io.support;

import fhf.springframework.core.io.Resource;
import fhf.springframework.core.io.ResourceLoader;

import java.io.IOException;

public interface ResourcePatternResolver extends ResourceLoader {
    String CLASSPATH_ALL_URL_PREFIX = "classpath*:";

    Resource[] getResources(String locationPattern) throws IOException;
}
