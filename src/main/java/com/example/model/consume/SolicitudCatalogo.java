package com.example.model.consume;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// TODO: Auto-generated Javadoc
/**
 * Instantiates a new solicitud catalogo.
 */
@Data
@XmlRootElement(name = "SOLICITUD_CATALOGO")
@XmlAccessorType(XmlAccessType.FIELD)
public class SolicitudCatalogo {
    
    /** The usuario. */
    @XmlElement(name = "USUARIO")
    private String usuario;

    /** The password. */
    @XmlElement(name = "PASSWORD")
    private String password;

    /** The tipo catalogo. */
    @XmlElement(name = "TIPO_CATALOGO")
    private String tipoCatalogo;

    /** The elementos. */
    @XmlElement(name = "ELEMENTOS")
    private Elementos elementos;
}
