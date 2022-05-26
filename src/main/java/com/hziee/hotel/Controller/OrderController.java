package com.hziee.hotel.Controller;

import com.hziee.hotel.Bean.Order;
import com.hziee.hotel.Mapper.OrderMapper;
import com.hziee.hotel.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    OrderMapper orderMapper;

    @RequestMapping("/CreateOrder")
    public void CreateOrder(String user_name, String type, String price, String in_date, String out_date) {
    }

    @RequestMapping(value = "/GotoManageOrder")
    public String GotoManageOrder(Model model) {
        List<Order> orders = orderMapper.findAllOrder();
        model.addAttribute("all_order", orders);
        return "/Admin/ManageOrder";
    }

}
