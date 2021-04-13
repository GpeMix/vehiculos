package com.example.model.me;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

// TODO: Auto-generated Javadoc
/**
 * Instantiates a new vehiculos resp.
 */

/**
 * Instantiates a new vehiculos resp.
 */
@Data
@ApiModel(value = "VehiculosResp")
public class VehiculosResp {
    
    /** The tipo. */
    @JsonProperty("Tipo")
    @ApiModelProperty(value = "Tipo", example = "AUTOMOVIL", position = 0)
    private String tipo;

    /** The armadora. */
    @JsonProperty("Armadora")
    @ApiModelProperty(value = "Armadora", example = "VOLKSWAGEN", position = 1)
    private String armadora;

    /** The modelo. */
    @JsonProperty("Modelo")
    @ApiModelProperty(value = "Modelo", example = "2000", position = 2)
    private String modelo;

    /** The carroceria. */
    @JsonProperty("Carroceria")
    @ApiModelProperty(value = "Carroceria", example = "DERBY", position = 3)
    private String carroceria;

    /** The version. */
    @JsonProperty("Version")
    @ApiModelProperty(value = "Version", example = "DERBY BASE STD.", position = 4)
    private String version;

    /** The clavemarca. */
    @JsonProperty("ClaveMarca")
    @ApiModelProperty(value = "ClaveMarca", example = "AUT2000", position = 5)
    private String clavemarca;

    /** The altovalor. */
    @JsonProperty("AltoValor")
    @ApiModelProperty(value = "AltoValor", example = "1", position = 6)
    private String altovalor;

}
