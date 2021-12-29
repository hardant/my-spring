package fhf.springframework.context.support;

import fhf.springframework.context.ApplicationContext;
import fhf.springframework.core.io.Resource;
import fhf.springframework.lang.Nullable;

public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {
    @Nullable
    private Resource configResources;

    public ClassPathXmlApplicationContext() {
    }

    public ClassPathXmlApplicationContext(String configLocation) {
        this(new String[] {configLocation}, true, null);
    }

    public ClassPathXmlApplicationContext(
            String[] configLocations, boolean refresh, @Nullable ApplicationContext parent){
        super(parent);
        if (refresh) {
            refresh();
        }
    }




}
