package com.example.model.consume;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ELEMENTO")
@ApiModel(value = "ELEMENTO")
@SuppressWarnings("all")

/**
 * Instantiates a new elemento req.
 */

/**
 * Instantiates a new elemento req.
 */
@RequiredArgsConstructor

/**
 * Instantiates a new elemento req.
 *
 * @param clave the clave
 * @param nombre the nombre
 * @param valor the valor
 */

/**
 * Instantiates a new elemento req.
 *
 * @param clave the clave
 * @param nombre the nombre
 * @param valor the valor
 */

/**
 * Instantiates a new elemento req.
 *
 * @param clave the clave
 * @param nombre the nombre
 * @param valor the valor
 */
@AllArgsConstructor
public class ElementoReq {

    /** The clave. */
    @XmlElement(name = "CLAVE")
    @JsonProperty(value = "CLAVE")
    @ApiModelProperty(value = "Clave", example = "clave", position = 0)
    private String clave;

    /** The nombre. */
    @XmlElement(name = "NOMBRE")
    @JsonProperty(value = "NOMBRE")
    @ApiModelProperty(value = "Nombre", example = "nombre", position = 1)
    private String nombre;

    /** The valor. */
    @XmlElement(name = "VALOR")
    @JsonProperty(value = "VALOR")
    @ApiModelProperty(value = "VALOR", example = "valor", position = 2)
    private String valor;
}
