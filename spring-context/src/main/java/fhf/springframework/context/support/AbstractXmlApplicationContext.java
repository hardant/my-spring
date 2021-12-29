package fhf.springframework.context.support;

import fhf.springframework.context.ApplicationContext;
import fhf.springframework.lang.Nullable;

public class AbstractXmlApplicationContext extends AbstractRefreshableConfigApplicationContext {
    private boolean validating = true;

    public AbstractXmlApplicationContext() {
    }

    public AbstractXmlApplicationContext(@Nullable ApplicationContext parent) {
        super(parent);
    }
}
