package com.meli.joescaos.clase2.dto.request;

import lombok.Getter;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Validated
public class HouseRequestDto {
    @NotNull(message = "Address Required")
    private String address;

    @NotNull(message = "Name Required")
    private String name;

    @NotEmpty(message = "Must have at least 1 room")
    @NotNull(message = "This list must not be empty")
    @Valid
    private List<RoomRequestDto> rooms;


}
