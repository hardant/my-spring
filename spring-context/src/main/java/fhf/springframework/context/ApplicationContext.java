package fhf.springframework.context;

import fhf.springframework.beans.factory.config.AutowireCapableBeanFactory;
import fhf.springframework.core.env.EnvironmentCapable;

public interface ApplicationContext extends EnvironmentCapable {
    AutowireCapableBeanFactory getAutowireCapableBeanFactory() throws IllegalStateException;
}
