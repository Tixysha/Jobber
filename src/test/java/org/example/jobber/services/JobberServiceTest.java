
package org.example.jobber.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JobberServiceTest {
    @Test

    public void test1() {
        JobberService service = new JobberService();

        int expected = 3;
        int actual = service.calculate( 10000, 3000, 20000);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void test2() {
        JobberService service = new JobberService();

        int expected = 2;
        int actual = service.calculate( 100000, 60000, 150000);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }
}
