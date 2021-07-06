package com.meli.joescaos.clase2.dto.response;


import com.meli.joescaos.clase2.models.Room;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class HouseResponseDto {
    private String validated;
    private Double foundArea;
    private String foundBiggestRoom;
    private Double price;
    private List<Room> roomsArea;
}
