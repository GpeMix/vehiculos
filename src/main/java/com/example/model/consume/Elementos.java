package com.example.model.consume;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * Instantiates a new elementos.
 */
@Data
@XmlRootElement(name = "ELEMENTOS")
@XmlAccessorType(XmlAccessType.FIELD)
public class Elementos {
    
    /** The elemento. */
    @XmlElement(name = "ELEMENTO")
    private List<Elemento> elemento;
}
