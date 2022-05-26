package com.hziee.hotel.Controller;

import com.hziee.hotel.Bean.Order;
import com.hziee.hotel.Mapper.OrderMapper;
import com.hziee.hotel.Service.OrderService;
import org.apache.ibatis.annotations.Param;
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

    @RequestMapping(value = "/GotoManageOrder")
    public String GotoManageOrder(Model model) {
        List<Order> orders = orderMapper.findAllOrder();
        model.addAttribute("all_order", orders);
        return "/Admin/ManageOrder";
    }

    @RequestMapping(value = "/DeleteOrder")
    public String DeleteOrder(@Param("id")int id){
        orderMapper.deleteOrder(id);
        return "redirect:/GotoManageOrder";
    }

    @RequestMapping(value = "/CreateOrder")
    public String CreateOrder(@Param("user_name")String user_name,
                              @Param("type")String type,
                              @Param("price")String price,
                              @Param("in_date")String in_date,
                              @Param("out_date")String out_date,
                              Model model){
        orderService.createOrder(user_name, type, price, in_date, out_date);
        return "/success";
    }

    @RequestMapping(value = "/ChangeOrderInfo")
    public String ChangeOrderInfo(@Param("user_name")String user_name,
                                  @Param("type")String type,
                                  @Param("price")String price,
                                  @Param("in_date")String in_date,
                                  @Param("out_date")String out_date,
                                  @Param("id")int id){
        orderMapper.changeOrder(user_name, type, price, in_date, out_date,id);
        return "redirect:/GotoManageOrder";
    }

    @RequestMapping(value = "/GotoDetails")
    public String GotoDetails(@Param("type")String type,
                              @Param("price")String price,
                              Model model){
        orderService.ShowOrder(type, price);
        model.addAttribute("type",type);
        model.addAttribute("price",price);
        return "/Details";
    }
}
