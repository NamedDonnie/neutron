package pers.donnie;

import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.donnie.model.User;
import pers.donnie.service.UserService;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NeutronWebApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {

        PageInfo<User> allUser= userService.getAllUser(new HashMap<>());
        allUser.getList().forEach(user -> System.out.println(user.getName()));

    }

}
