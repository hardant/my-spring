package fhf.springframework.core.env;

//import org.junit.Test;

import org.junit.jupiter.api.Test;

import java.util.StringTokenizer;

public class ProfilesTests {

    @Test
    public void test01() {
        StringTokenizer stringTokenizer = new StringTokenizer("a!aa, bbb, cccc", ", !", false);

        int i = stringTokenizer.countTokens();
        System.out.println(String.format("i = %d", i));
        String token;
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
