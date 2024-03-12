package com.max.curso.springboot.webapp.springbootweb.controladores;

import java.util.Map;

import org.apache.catalina.util.ParameterMap;
//import org.springframework.stereotype.Controller;

//import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import com.max.curso.springboot.webapp.springbootweb.ClsUtil;

//Controller + ResponseBody equivale a RestController
//@Controller 

@RequestMapping("/api")

public class ClsControladorRestUsuario 
{
    //Esta llamada es casesensitive
    @GetMapping("/perfilapirest/json1")
    /*
    @RequestMapping(value = "/perfilapirest", method=RequestMethod.GET)
    public String requestMethodName(@RequestParam String param) {
        return new String();
    }
    */

    //@RequestMapping(value = "/perfilapirest",method=RequestMethod.GET)
    //@ResponseBody

    public Map<String,Object> Detalles()
    {
        //Map<String,Object> objMapBody=new HashMap<>();
        Map<String,Object> objMapBody=new ParameterMap<>();

        objMapBody.put(ClsUtil.cnstStrTítulo1Clave, ClsUtil.cnstStrTítulo1Valor);

        objMapBody.put(ClsUtil.cnstStrTítulo2Clave, ClsUtil.cnstStrTítulo2Valor);

        objMapBody.put(ClsUtil.cnstStrNombre1UsuarioClave, ClsUtil.cnstStrNombre1UsuarioValor);

        objMapBody.put(ClsUtil.cnstStrNombre2UsuarioClave, ClsUtil.cnstStrNombre2UsuarioValor);    
        
        objMapBody.put(ClsUtil.cnstStrApe1UsuarioClave, ClsUtil.cnstStrApe1UsuarioValor);    
        
        objMapBody.put(ClsUtil.cnstStrApe2UsuarioClave, ClsUtil.cnstStrApe2UsuarioValor); 
        
        //Se devuelve el objeto Map y se visualiza como json en el navegador, porque es un RestController
        return objMapBody;
    }
}
