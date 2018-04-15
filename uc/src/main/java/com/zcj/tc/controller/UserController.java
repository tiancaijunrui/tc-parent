package com.zcj.tc.controller;

import com.zcj.tc.model.User;
import com.zcj.tc.repository.UserRepository;
import com.zcj.tc.util.ParseMD5Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.ipc.netty.http.server.HttpServerRequest;

import javax.annotation.Resource;

@Controller
@RequestMapping("/uc")
public class UserController {
    @Resource
    private UserRepository userRepository;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "uc/login";
    }

    @RequestMapping("/login")
    public String login(@RequestParam String loginName, @RequestParam String password, HttpServerRequest request) {
        User user = userRepository.findUserByLoginName(loginName);
        if (user == null) {
            return "uc/register";
        }
        String exPassword = ParseMD5Utils.parseStrToMd5U32(user.getPassword());
        if (!password.equals(password)) {

        }
        return null;
    }

    @RequestMapping("/test")
    @ResponseBody
    public JsonResult test() {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setStatus(JsonStatus.SUCCESS);
        return jsonResult;
    }
}
