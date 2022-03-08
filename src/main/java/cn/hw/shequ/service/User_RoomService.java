package cn.hw.shequ.service;

import cn.hw.shequ.bean.User_Room;
import cn.hw.shequ.dao.User_RoomDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_RoomService {
    @Autowired
    User_RoomDao dao;
    public int getRoomRecordCount(int id) {
        return dao.getRoomRecordCount(id);
    }

    public List<User_Room> findRoomRecordById(int id, int page, int limit) {
        return dao.findRoomRecordById(id,page,limit);
    }

    public int findRoom(Integer user_id) {
        return dao.findRoom(user_id);
    }

    public void outRoom(Integer user_id) {
        dao.outRoom(user_id);
    }

    public int fenpei(Integer user_id, Integer room_id) {
        return dao.fenpei(user_id,room_id);
    }

    public int stopRoomByUserId(int id) {
        return dao.stopRoomByUserId(id);
    }
}
