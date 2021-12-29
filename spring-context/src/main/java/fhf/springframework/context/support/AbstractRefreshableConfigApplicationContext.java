package fhf.springframework.context.support;

import fhf.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import fhf.springframework.context.ApplicationContext;
import fhf.springframework.lang.Nullable;

public abstract class AbstractRefreshableConfigApplicationContext extends AbstractRefreshableApplicationContext {

    @Nullable
    private volatile DefaultListableBeanFactory beanFactory;

    public AbstractRefreshableConfigApplicationContext() {
    }

    public AbstractRefreshableConfigApplicationContext(@Nullable ApplicationContext parent) {
        super(parent);
    }

    @Override
    public final ConfigurableListableBeanFactory getBeanFactory() {
        DefaultListableBeanFactory beanFactory = this.beanFactory;
        if (beanFactory == null) {
            throw new IllegalStateException("BeanFactory not initialized or already closed - " +
                    "call 'refresh' before accessing beans via the ApplicationContext");
        }
        return beanFactory;
    }
}
