package com.example.model.me;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

// TODO: Auto-generated Javadoc
/**
 * Instantiates a new vehiculos req.
 */
@Data
@ApiModel(value = "VehiculosReq")
public class VehiculosReq {
    
    /** The fecha. */
    @JsonProperty("Fecha")
    @ApiModelProperty(value = "Fecha", example = "0000-00-00", position = 0)
    private String fecha;

    /** The id participante. */
    @ApiModelProperty(value = "IdParticipante", example = "0000", position = 1)
    @JsonProperty("IdParticipante")
    private String idParticipante;

    /** The vehiculo. */
    @JsonProperty("Vehiculo")
    @ApiModelProperty(value = "Vehiculo", example = "", position = 2)
    private Vehiculo vehiculo;
}
