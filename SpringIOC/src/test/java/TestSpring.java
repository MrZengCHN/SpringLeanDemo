import com.springioc.SpringConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestSpring {
    @Test
    public void Test01() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

    }
}
