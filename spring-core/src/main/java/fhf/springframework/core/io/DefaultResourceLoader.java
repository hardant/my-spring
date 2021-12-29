package fhf.springframework.core.io;

import fhf.springframework.lang.Nullable;
import fhf.springframework.util.Assert;
import fhf.springframework.util.ClassUtils;

public class DefaultResourceLoader implements ResourceLoader {
    @Nullable
    private ClassLoader classLoader;

    @Override
    public Resource getResource(String location) {
        Assert.notNull(location, "Location must not be null");


        return null;
    }

    @Override
    @Nullable
    public ClassLoader getClassLoader() {
        return (this.classLoader != null ? this.classLoader : ClassUtils.getDefaultClassLoader());
    }
}
