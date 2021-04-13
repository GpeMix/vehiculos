package com.example.service;

import com.example.client.FeignCliente;
import com.example.model.consume.CatalogoResp;
import com.example.model.consume.Elemento;
import com.example.model.consume.Elementos;
import com.example.model.consume.SolicitudCatalogo;
import com.example.model.me.Vehiculo;
import com.example.model.me.VehiculosReq;
import com.example.model.me.VehiculosResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class VehiculoService.
 */
@Api(tags = { "V" }, value = "/", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
@RestController
public class VehiculoService {
  //Recibir estructura json

  /** The feignc. */
  @Autowired
  private FeignCliente feignc;

  /**
  * Gets the inf vehiculo.
  *
  * @param vReq the v req
  * @return the inf vehiculo
  * @throws Exception the exception
  */
  @ApiOperation(value = "Request JSON consulta catálogo de Vehiculos", notes = "Información detallada")
  @PostMapping(path = "/vehiculos", consumes = {MediaType.APPLICATION_JSON}, produces = {MediaType.APPLICATION_JSON})
  public final VehiculosResp getInfVehiculo(@RequestBody final VehiculosReq vReq) throws Exception {
    //XMl Request
    SolicitudCatalogo scatalogo = new SolicitudCatalogo();
    scatalogo.setUsuario("USRWSP");
    scatalogo.setPassword("mexico.1");
    scatalogo.setTipoCatalogo("VEHICULO");
    
    final Vehiculo veh = vReq.getVehiculo();
    final Elemento eidPart = new Elemento();
    final Elemento etipVehiculo = new Elemento();
    final Elemento eArmadora = new Elemento();
    final Elemento eCarroceria = new Elemento();
    final List<Elemento> element = new ArrayList();

    eidPart.setValor(vReq.getIdParticipante());
    eidPart.setClave(vReq.getIdParticipante());
    eidPart.setNombre("ID_PARTICIPANTE");
    element.add(eidPart);

    etipVehiculo.setValor(veh.getTipo());
    etipVehiculo.setClave(veh.getTipo());
    etipVehiculo.setNombre("TIPO_VEHICULO");
    element.add(etipVehiculo);

    eArmadora.setValor(veh.getArmadora());
    eArmadora.setClave(veh.getArmadora());
    eArmadora.setNombre("ARMADORA");
    element.add(eArmadora);

    eCarroceria.setValor(veh.getCarroceria());
    eCarroceria.setClave(veh.getCarroceria());
    eCarroceria.setNombre("CARROCERIA");
    element.add(eCarroceria);

    Elementos obj = new Elementos();
    obj.setElemento(element); //Agrega la lista a sCatalogo
    scatalogo.setElementos(obj);
    try {
      CatalogoResp cat = feignc.getCatalogo(scatalogo); //Cosumo del servicio
      VehiculosResp vResp = new VehiculosResp();
      cat.getElementos().stream().forEach(
          e -> { 
            switch(e.getNombre()) {
              case "TIPO_VEHICULO" : vResp.setTipo(e.getValor()); break;
              case "ARMADORA" : vResp.setArmadora(e.getValor()); break;
              case "MODELO" : vResp.setModelo(e.getValor()); break;
              case "CARROCERIA" : vResp.setCarroceria(e.getValor()); break;
              case "VERSION" : vResp.setVersion(e.getValor()); break;
              case "CLAVEMARCA" : vResp.setClavemarca(e.getValor()); break;
              case "ALTOVALOR" : vResp.setAltovalor(e.getValor()); break;
              default: System.out.println("Error"); break;
            }
          });
      return vResp;
    } catch (Exception e) {
      System.out.println(e.getMessage());
      throw e;
    }
  }
}
