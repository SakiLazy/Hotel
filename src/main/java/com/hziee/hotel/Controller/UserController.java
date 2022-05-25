package com.hziee.hotel.Controller;

import com.hziee.hotel.Bean.User;
import com.hziee.hotel.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public String login(String name, String password, Model model) {
        User user = userService.LoginIn(name, password);
        model.addAttribute("user_name", name);
        if (user != null) {
            return "Index";
        } else {
            return "error";
        }
    }

    @RequestMapping(value = "/GotoLoginPage")
    public String GotoLoginPage() {
        return "/Login";
    }

    @RequestMapping(value = "/GotoRegisterPage")
    public String GotoRegisterPage() {
        return "/Register";
    }

    @RequestMapping(value = "/Register", method = RequestMethod.POST)
    public String signUp(String name, String password, String phone, String email, Model model) {
        userService.Insert(name, password, phone, email);
        model.addAttribute("user_name", name);
        return "/Index";
    }

}
