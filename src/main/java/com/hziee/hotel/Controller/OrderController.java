package com.hziee.hotel.Controller;

import com.hziee.hotel.Bean.Order;
import com.hziee.hotel.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

}
