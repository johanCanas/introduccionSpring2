package com.meli.joescaos.clase2.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoomResponseDto {
    private String name;
    private Double width;
    private Double length;
}
