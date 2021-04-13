package com.example.model.me;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Instantiates a new vehiculo.
 */
@Data
public class Vehiculo {

    /** The tipo. */
    @JsonProperty("Tipo")
    @ApiModelProperty(value = "tipo", example = "AUTOMOVIL", position = 0)
    private String tipo;

    /** The armadora. */
    @JsonProperty("Armadora")
    @ApiModelProperty(value = "armadora", example = "VW", position = 1)
    private String armadora;

    /** The carroceria. */
    @JsonProperty("Carroceria")
    @ApiModelProperty(value = "carroceria", example = "12", position = 2)
    private String carroceria;

}
