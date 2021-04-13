package com.example.model.consume;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;
import lombok.Data;

/**
 * Instantiates a new catalogo resp.
 */
@Data
@XmlRootElement(name = "CATALOGO")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogoResp", propOrder = {"elementos"})
public class CatalogoResp {
	
	/** The elementos. */
	private List<ElementoReq> elementos;
	
}
