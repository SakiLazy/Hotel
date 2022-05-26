package com.hziee.hotel.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @RequestMapping(value = "/GotoManageUsers")
    public String GotoManageUsers(){
        return "/Admin/ManageUsers";
    }

}
