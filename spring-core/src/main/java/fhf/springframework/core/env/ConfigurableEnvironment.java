package fhf.springframework.core.env;

public interface ConfigurableEnvironment extends Environment {
    void merge(ConfigurableEnvironment parent);
}
