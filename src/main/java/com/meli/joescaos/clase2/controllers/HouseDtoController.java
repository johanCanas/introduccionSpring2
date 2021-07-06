package com.meli.joescaos.clase2.controllers;

import com.meli.joescaos.clase2.dto.request.HouseRequestDto;
import com.meli.joescaos.clase2.dto.response.HouseResponseDto;
import com.meli.joescaos.clase2.handlers.HouseHandler;
import com.meli.joescaos.clase2.models.Room;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/house")
public class HouseDtoController {

    @PostMapping("/area")
    public ResponseEntity<HouseResponseDto> area(@Valid @RequestBody HouseRequestDto house){
        HouseResponseDto houseResponseDto = new HouseResponseDto(
                HouseHandler.validateHouse(),
                HouseHandler.findArea(house.getRooms()),
                HouseHandler.findBiggestRoom(house.getRooms()),
                HouseHandler.getPrice(house.getRooms()),
                house.getRooms()

        );

        return new ResponseEntity<>(houseResponseDto, HttpStatus.OK);

    }
}
