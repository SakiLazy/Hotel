package com.hziee.hotel.Controller;

import com.hziee.hotel.Bean.Room;
import com.hziee.hotel.Mapper.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RoomController {

    @Autowired
    RoomMapper roomMapper;

    @RequestMapping(value = "/GotoManageRoom")
    public String GotoManageRoom(Model model){
        List<Room> room = roomMapper.findAllRoom();
        model.addAttribute("allroom",room);
        return "/Admin/ManageRoom";
    }
}
