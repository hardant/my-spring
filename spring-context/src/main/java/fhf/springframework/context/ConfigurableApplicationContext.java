package fhf.springframework.context;

import fhf.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import fhf.springframework.core.env.ConfigurableEnvironment;
import fhf.springframework.beans.BeansException;

import java.io.Closeable;

public interface ConfigurableApplicationContext extends ApplicationContext, Lifecycle, Closeable {

    void refresh() throws BeansException, IllegalStateException;
    @Override
    ConfigurableEnvironment getEnvironment();

    ConfigurableListableBeanFactory getBeanFactory() throws IllegalStateException;
}
