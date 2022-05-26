package com.hziee.hotel.Controller;

import com.hziee.hotel.Bean.Admin;
import com.hziee.hotel.Bean.User;
import com.hziee.hotel.Mapper.UserMapper;
import com.hziee.hotel.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

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

    @RequestMapping(value = "/AdminloginIn", method = RequestMethod.POST)
    public String Adminlogin(String name, String password, Model model) {
        Admin admin = userService.AdminLogin(name, password);
        model.addAttribute("user_name", name);
        if (admin != null) {
            return "/Admin/AdminIndex";
        } else {
            return "error";
        }
    }

    @RequestMapping(value = "/GotoAdminLoginPage")
    public String GotoAdminLoginPage(){
        return "/AdminLogin";
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
    public String Register(String name, String password, String phone, String email, Model model) {
        userService.Insert(name, password, phone, email);
        model.addAttribute("user_name", name);
        return "/Index";
    }

    //管理用户
    @RequestMapping(value = "/GotoManageUsers")
    public String GotoManageUser(Model model){
        List<User> user = userMapper.findAllUser();
        model.addAttribute("alluser",user);
        return "/Admin/ManageUsers";
    }


}
