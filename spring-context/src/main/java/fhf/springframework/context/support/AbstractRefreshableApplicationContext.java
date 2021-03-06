package fhf.springframework.context.support;

import fhf.springframework.context.ApplicationContext;
import fhf.springframework.lang.Nullable;

public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {
    public AbstractRefreshableApplicationContext() {
    }
    public AbstractRefreshableApplicationContext(@Nullable ApplicationContext parent) {
        super(parent);
    }
}
