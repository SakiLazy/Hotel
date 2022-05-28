package com.hziee.hotel.Controller;

import com.hziee.hotel.Bean.Room;
import com.hziee.hotel.Mapper.RoomMapper;
import org.apache.ibatis.annotations.Param;
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
    public String GotoManageRoom(Model model) {
        List<Room> room = roomMapper.findAllRoom();
        model.addAttribute("allroom", room);
        return "/Admin/ManageRoom";
    }

    //更改房间信息
    @RequestMapping(value = "/ChangeRoomInfo")
    public String ChangeRoomInfo(@Param("type") String type,
                                 @Param("price") String price,
                                 @Param("stock") String stock) {
        roomMapper.changeRoomInfo(type, price, stock);
        return "redirect:/GotoManageRoom";
    }

    //增加房间类型
    @RequestMapping(value = "/AddRoom")
    public String AddRoom(@Param("type") String type,
                          @Param("price") String price,
                          @Param("stock") String stock) {
        roomMapper.addRoomInfo(type, price, stock);
        return "redirect:/GotoManageRoom";
    }
//
//    @RequestMapping("/changeRoomById")
//    public String changeRoomById(@Param("id")int id,
//                                 @Param("type")String type,
//                                 @Param("price")String price,
//                                 @Param("status")int status){
//        roomService.changeRoomById(id,type,price,status);
//        return "redirect:";//更改房间信息页面
//    }
//
//    @PostMapping("/roomStatus")
//    public String changeStatusById(@Param("id")int id){
//        roomService.changeStatusById(id);
//        return " ";//更改房间状态
//    }

}
