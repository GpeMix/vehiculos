package com.example.service;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.ArgumentMatchers;

import com.example.client.FeignCliente;
import com.example.model.consume.CatalogoResp;
import com.example.model.consume.Elemento;
import com.example.model.consume.ElementoReq;
import com.example.model.consume.Elementos;
import com.example.model.consume.SolicitudCatalogo;
import com.example.model.me.Vehiculo;
import com.example.model.me.VehiculosReq;
import com.example.model.me.VehiculosResp;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

@ExtendWith(MockitoExtension.class)
class VehiculoServiceTest {
	
	@InjectMocks
    private VehiculoService vehDomain;

    @Mock
    private FeignCliente domain;
    
	@SuppressWarnings("deprecation")
	@BeforeEach
    public void initMocks() {
        vehDomain = new VehiculoService();
        MockitoAnnotations.initMocks(this);
    }
    //VehiculosResp getInfVehiculo
    @Test
    public void getInfoVehiculo() throws Exception{
    	/*final Gson gson = new Gson();
    	final InputStream is = VehiculoServiceTest.class.getClassLoader().getResourceAsStream("vReqJson.txt");
    	final BufferedReader bR = new BufferedReader(new InputStreamReader(is));
    	final VehiculosReq vReq = gson.fromJson(bR, VehiculosReq.class);*/

    	VehiculosReq vReq = new VehiculosReq();
    	
    	vReq.setFecha("2021-01-10");
    	vReq.setIdParticipante("3456");
    	
    	Vehiculo v = new Vehiculo();
    	
    	v.setTipo("AUTOMOVIL");
        v.setArmadora("VW");
        v.setCarroceria("12");  
        vReq.setVehiculo(v);
        
        CatalogoResp cResp = new CatalogoResp();
        when(domain.getCatalogo(ArgumentMatchers.any())).thenReturn(cResp);
      
        List<ElementoReq> elemento = new ArrayList();
        ElementoReq eReq = new ElementoReq();
        
        eReq = AgregarElemento("N","TIPO_VEHICULO","N");
        elemento.add(eReq);
        eReq= AgregarElemento("N","ARMADORA","N");
        elemento.add(eReq);
        eReq= AgregarElemento("N","MODELO","N");
        elemento.add(eReq);
        eReq= AgregarElemento("N","CARROCERIA","N");
        elemento.add(eReq);
        eReq= AgregarElemento("N","VERSION","N");
        elemento.add(eReq);
        eReq= AgregarElemento("N","CLAVEMARCA","N");
        elemento.add(eReq);
        eReq= AgregarElemento("N","ALTOVALOR","N");
        elemento.add(eReq);
        eReq= AgregarElemento("N","","N");
        elemento.add(eReq);
        cResp.setElementos(elemento);
                   
        VehiculosResp actual = vehDomain.getInfVehiculo(vReq);
        assertNotNull(cResp);
        
    }
    
    @Test
    public void getVehiculoExc()throws Exception {
    	
    	VehiculosReq vReq = new VehiculosReq();
    	
    	vReq.setFecha("2021-01-10");
    	vReq.setIdParticipante("3456");
    	
    	Vehiculo v = new Vehiculo();
    	
    	v.setTipo("AUTOMOVIL");
        v.setArmadora("VW");
        v.setCarroceria("12");  
        vReq.setVehiculo(v);
    	
    	when(domain.getCatalogo(ArgumentMatchers.any())).thenReturn(null);
    	
		assertThrows(NullPointerException.class, () -> {
            vehDomain.getInfVehiculo(vReq);
        });
    }
    
    public ElementoReq AgregarElemento(String clave, String nombre, String valor) {
        ElementoReq eReq = new ElementoReq();http:
        eReq.setClave(clave);
        eReq.setNombre(nombre);
        eReq.setValor(valor);
    	
        return eReq;
    	
    }

}
