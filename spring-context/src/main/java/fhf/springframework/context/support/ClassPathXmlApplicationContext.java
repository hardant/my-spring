package fhf.springframework.context.support;

import fhf.springframework.core.io.Resource;
import fhf.springframework.lang.Nullable;

public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {
    @Nullable
    private Resource configResources;

    public ClassPathXmlApplicationContext() {
    }


}
