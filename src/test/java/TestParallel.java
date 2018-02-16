import org.junit.Test;

import java.time.Instant;
import java.util.stream.DoubleStream;

/**
 * Created by se on 13.02.2018.
 */
public class TestParallel {
    @Test
    public void testSteps(){
        DoubleStream stream = DoubleStream.generate(Math::random);
        long l1 = Instant.now().toEpochMilli();
        stream.limit(10000000).parallel().min();
        long l2 = Instant.now().toEpochMilli();
        System.out.println("Serial stream: "+(l2-l1));
    }
}
