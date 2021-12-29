package fhf.springframework.context.support;

import fhf.springframework.beans.factory.config.AutowireCapableBeanFactory;
import fhf.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import fhf.springframework.context.ApplicationContext;
import fhf.springframework.context.ConfigurableApplicationContext;
import fhf.springframework.core.env.ConfigurableEnvironment;
import fhf.springframework.core.env.Environment;
import fhf.springframework.core.env.StandardEnvironment;
import fhf.springframework.core.io.DefaultResourceLoader;
import fhf.springframework.core.io.support.PathMatchingResourcePatternResolver;
import fhf.springframework.core.io.support.ResourcePatternResolver;
import fhf.springframework.lang.Nullable;
import fhf.springframework.beans.BeansException;

import java.io.IOException;

public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {
    private ResourcePatternResolver resourcePatternResolver;

    private ApplicationContext parent;
    @Nullable
    private ConfigurableEnvironment environment;

    public AbstractApplicationContext() {
        this.resourcePatternResolver = getResourcePatternResolver();
    }

    public AbstractApplicationContext(ApplicationContext parent) {
        this();
        setParent(parent);
    }

    private void setParent(ApplicationContext parent) {
        this.parent = parent;
        if (parent != null) {
            Environment parentEnvironment = parent.getEnvironment();
            if (parentEnvironment instanceof ConfigurableEnvironment) {
                getEnvironment().merge((ConfigurableEnvironment) parentEnvironment);
            }
        }
    }

    @Override
    public ConfigurableEnvironment getEnvironment() {
        if (this.environment == null) {
            this.environment = createEnvironment();
        }
        return this.environment;
    }

    private ConfigurableEnvironment createEnvironment() {
        return new StandardEnvironment();
    }

    protected ResourcePatternResolver getResourcePatternResolver() {
        return new PathMatchingResourcePatternResolver(this);
    }

    @Override
    public void refresh() throws BeansException, IllegalStateException {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public AutowireCapableBeanFactory getAutowireCapableBeanFactory() throws IllegalStateException {
        return getBeanFactory();
    }

    public abstract ConfigurableListableBeanFactory getBeanFactory() throws IllegalStateException;
}
