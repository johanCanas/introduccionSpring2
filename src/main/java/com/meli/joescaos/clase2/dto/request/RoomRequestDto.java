package com.meli.joescaos.clase2.dto.request;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Validated
public class RoomRequestDto {
    @NotNull(message = "Room name Required")
    @NotBlank(message = "Not blank spaces")
    private String name;

    @NotNull(message = "Room width Required")
    @Min(message = "width must be greater than 0", value = 0)
    @Max(message = "width must be lesser than 100", value = 100)
    private Double width;

    @NotNull(message = "Room length Required")
    @Min(message = "length must be greater than 0", value = 0)
    @Max(message = "length must be lesser than 100", value = 100)
    private Double length;

    @Max(message = "area must be lesser than 10000", value = 10000)
    private Double area;

}
