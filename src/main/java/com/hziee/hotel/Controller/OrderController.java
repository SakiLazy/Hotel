package com.hziee.hotel.Controller;

import com.hziee.hotel.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/CreateOrder")
    public String CreateOrder(String user_name, String type, String price, Date in_date, Date out_date){
        return "/OrderPage";
    }

}
