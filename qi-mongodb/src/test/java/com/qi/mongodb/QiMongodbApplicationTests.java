package com.qi.mongodb;

import com.qi.mongodb.pojo.User;
import com.qi.mongodb.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QiMongodbApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void testSaveUser() throws Exception {
        User user = new User();
        user.setId(2l);
        user.setUserName("小明");
        user.setPassWord("fffooo123");
        userService.saveUser(user);
    }

    @Test
    public void findUserByUserName() {
        User user = userService.findUserByUserName("小明");
        System.out.println("user is " + user);
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(2l);
        user.setUserName("天空");
        user.setPassWord("fffxxxx");
        userService.updateUser(user);
    }

    @Test
    public void deleteUserById() {
        userService.deleteUserById(1l);
    }

}
