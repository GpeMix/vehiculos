package com.example.client;

import com.example.model.consume.CatalogoResp;
import com.example.model.consume.SolicitudCatalogo;
import javax.ws.rs.core.MediaType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * The Interface FeignCliente.
 */
@FeignClient(name = "CatalogoResp", url = "https://api-qa.oscp.gnp.com.mx/autos/wsp/catalogos/catalogo")
public interface FeignCliente {
    
  /**
  * Gets the catalogo.
  *
  * @param req the req
  * @return the catalogo
  */
  //interface para consumir el servicio
  @PostMapping(consumes = {MediaType.APPLICATION_XML}, produces = {MediaType.APPLICATION_XML})
  CatalogoResp getCatalogo(@RequestBody SolicitudCatalogo req);
}
