package com.meli.joescaos.clase2.handlers;

import com.meli.joescaos.clase2.models.Room;

import java.util.ArrayList;
import java.util.List;

public class HouseHandler {
    public static String validateHouse() {
        return "House Validated";
    }


    public static Double findArea(List<Room> rooms) {
        Double total = 0.0;
        for (Room room: rooms){
            total+= findRoomsAreaOut(room);
        }

        return total;
    }




    public static Double findRoomsAreaOut(Room room) {
        Double width = room.getWidth();
        Double length = room.getLength();

        room.setArea(width * length);

        return room.getArea();
    }

    public static Double getPrice(List<Room> rooms) {
        return 800 * findArea(rooms);
    }

    public static String findBiggestRoom(List<Room> rooms) {
        Room biggest = rooms.get(0);
        for (int i = 1; i < rooms.size(); i++) {
            if( findRoomsAreaOut(rooms.get(i)) > findRoomsAreaOut(biggest)){
                biggest = rooms.get(i);
            }
        }
        return "nombre: " + biggest.getName() + " area: " + biggest.getArea();
    }
}
