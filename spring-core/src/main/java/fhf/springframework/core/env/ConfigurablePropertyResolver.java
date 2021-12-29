package fhf.springframework.core.env;

import fhf.springframework.lang.Nullable;

public class ConfigurablePropertyResolver {
    private final PropertySources propertySources;

    public ConfigurablePropertyResolver(PropertySources propertySources) {
        this.propertySources = propertySources;
    }
}
