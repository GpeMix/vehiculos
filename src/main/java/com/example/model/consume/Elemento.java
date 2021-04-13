package com.example.model.consume;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Instantiates a new elemento.
 */
@Data
@XmlRootElement(name = "ELEMENTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class Elemento {

    /** The valor. */
    @XmlElement(name = "VALOR")
    private String valor;

    /** The clave. */
    @XmlElement(name = "CLAVE")
    private String clave;

    /** The nombre. */
    @XmlElement(name = "NOMBRE")
    private String nombre;

}
