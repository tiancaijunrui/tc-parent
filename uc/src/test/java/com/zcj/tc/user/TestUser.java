package com.zcj.tc.user;

import com.zcj.tc.model.uc.User;
import com.zcj.tc.repository.UserRepository;
import com.zcj.tc.util.ParseMD5Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestUser {
    @Resource
    private UserRepository userRepository;

    @Test
    public void testSave() {
        User user = new User();
        user.setLoginName("admin");
        user.setPassword(ParseMD5Utils.parseStrToMd5U32("admin"));
        user.setCreateBy("default");
        user.setUpdateBy("default");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user = userRepository.save(user);
        System.out.println(user.getUserId());
    }
}
