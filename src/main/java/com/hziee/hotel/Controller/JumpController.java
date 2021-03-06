package com.hziee.hotel.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpController {

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

    @RequestMapping(value = "/GotoChangePage")
    public String GotoChangePage(){return "/Admin/ChangeUserInfo";}

    @RequestMapping(value = "/GotoChangeOrderPage")
    public String GotoChangeOrderPage(){return "/Admin/ChangeOrderDetails";}

    @RequestMapping(value = "/GotoChangeRoomPage")
    public String GotoChangeRoomInfo(){return "/Admin/ChangeRoomInfo";}

    @RequestMapping(value = "/GotoAddRoomPage")
    public String GotoAddRoomPage(){return "/Admin/AddRoom";}

}
