package fhf.springframework.context.support;

import fhf.springframework.context.ApplicationContext;
import fhf.springframework.lang.Nullable;

public class AbstractRefreshableConfigApplicationContext extends AbstractRefreshableApplicationContext {
    public AbstractRefreshableConfigApplicationContext() {
    }

    public AbstractRefreshableConfigApplicationContext(@Nullable ApplicationContext parent) {
        super(parent);
    }

}
