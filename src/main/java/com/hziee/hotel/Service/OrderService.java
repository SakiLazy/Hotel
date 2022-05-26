package com.hziee.hotel.Service;

import com.hziee.hotel.Mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderService {

    @Autowired
    OrderMapper orderMapper;

    public void createOrder(String user_name, String type, String price, Date in_date, Date out_date){
        orderMapper.createOrder(user_name, type, price, in_date, out_date);
    }
}
