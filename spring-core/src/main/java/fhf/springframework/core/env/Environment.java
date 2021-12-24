package fhf.springframework.core.env;

public interface Environment extends PropertyResolver {

    String[] getActiveProfiles();

    String[] getDefaultProfiles();

    boolean acceptsProfiles(String... profiles);

    boolean acceptsProfiles(Profiles profiles);
}
