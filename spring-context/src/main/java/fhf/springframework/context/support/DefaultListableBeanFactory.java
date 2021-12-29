package fhf.springframework.context.support;

import fhf.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.io.Serializable;

public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory
        implements ConfigurableListableBeanFactory, BeanDefinitionRegistry, Serializable {
    private static final long serialVersionUID = 7025948566386424861L;
}
