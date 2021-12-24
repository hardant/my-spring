package fhf.springframework.core.env;

import java.util.function.Predicate;

public interface Profiles {

    boolean matches(Predicate<String> activeProfiles);

    static Profiles of(String... profiles) {
        return ProfilesParser.parse(profiles);
    }
}
