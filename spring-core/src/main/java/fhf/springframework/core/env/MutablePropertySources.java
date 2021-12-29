package fhf.springframework.core.env;

import java.util.Iterator;

public class MutablePropertySources implements PropertySources {

    @Override
    public boolean contains(String name) {
        return false;
    }

    @Override
    public PropertySource<?> get(String name) {
        return null;
    }

    @Override
    public Iterator<PropertySource<?>> iterator() {
        return null;
    }
}
