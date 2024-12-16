import com.springioc.SpringConfiguration;
import com.springioc.controller.UserController;
import com.springioc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Arrays;

@SpringJUnitConfig(classes = SpringConfiguration.class)
public class TestSpring {
    @Autowired
    private UserController userController;

    @Test
    public void Test01(){
        String str = "123||123";
        String[] split = str.split("\\|\\|");
        System.out.println(Arrays.toString(split));
    }
}
