package com.meli.joescaos.clase2.handlers;

import com.meli.joescaos.clase2.dto.request.RoomRequestDto;

import java.util.ArrayList;
import java.util.List;

public class HouseHandler {
    public static String validateHouse() {
        return "House Validated";
    }


    public static Double findArea(List<RoomRequestDto> rooms) {
        Double total = 0.0;
        for (RoomRequestDto room: rooms){
            total+= findRoomsAreaOut(room);
        }

        return total;
    }




    public static Double findRoomsAreaOut(RoomRequestDto room) {
        Double width = room.getWidth();
        Double length = room.getLength();

        room.setArea(width * length);

        return room.getArea();
    }

    public static Double getPrice(List<RoomRequestDto> rooms) {
        return 800 * findArea(rooms);
    }

    public static String findBiggestRoom(List<RoomRequestDto> rooms) {
        RoomRequestDto biggest = rooms.get(0);
        for (int i = 1; i < rooms.size(); i++) {
            if( findRoomsAreaOut(rooms.get(i)) > findRoomsAreaOut(biggest)){
                biggest = rooms.get(i);
            }
        }
        return "nombre: " + biggest.getName() + " area: " + biggest.getArea();
    }
}
