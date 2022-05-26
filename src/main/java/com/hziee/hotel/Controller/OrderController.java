package com.hziee.hotel.Controller;

import com.hziee.hotel.Bean.Order;
import com.hziee.hotel.Mapper.OrderMapper;
import com.hziee.hotel.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    OrderMapper orderMapper;

    @RequestMapping("/CreateOrder")
    public String CreateOrder(String user_name, String type, String price, Date in_date, Date out_date){
        return "/OrderPage";
    }

    @RequestMapping(value = "/GotoManageOrder")
    public String GotoManageOrderPage(Model model){
        List<Order> order = orderMapper.findAllOrder();
        model.addAttribute("allorder",order);
        return "/Admin/ManageOrder";
    }

}
