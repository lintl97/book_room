package com.yzx.service.admin.Impl;

import com.yzx.mapper.admin.RoomMapper;
import com.yzx.model.admin.Room;
import com.yzx.service.admin.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomMapper roomMapper;

    @Override
    public int addRoom(Room room) {
        return roomMapper.addRoom(room);
    }

    @Override
    public int eidtRoom(Room room) {
        return roomMapper.eidtRoom(room);
    }

    @Override
    public int deleteRoom(int id) {
        return roomMapper.deleteRoom(id);
    }

    @Override
    public int getTotal(Map<String, Object> map) {
        return roomMapper.getTotal(map);
    }

    @Override
    public List<Room> findList(Map<String, Object> map) {
        return roomMapper.findList(map);
    }

    @Override
    public Room findRoomById(int id) {
        return roomMapper.findRoomById(id);
    }

    @Override
    public List<Room> findRoomByTypeNameOrHightOrStatus(Map<String, Object> map) {
        return roomMapper.findRoomByTypeNameOrHightOrStatus(map);
    }

    @Override
    public List<Room> findRoomByTypeIdAndStatus(Integer roomTypeId, Integer status) {
        return roomMapper.findRoomByTypeIdAndStatus(roomTypeId,status);
    }
}
