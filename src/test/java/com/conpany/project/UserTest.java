package com.conpany.project;

import com.company.project.Application;
import com.company.project.core.AbstractService;
import com.company.project.model.User;
import com.company.project.service.UserService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserTest {

    @Resource
    private UserService userService;

    public void testFindUserById() {
        User user = userService.findById(1);
        System.out.println(user);
    }

}
