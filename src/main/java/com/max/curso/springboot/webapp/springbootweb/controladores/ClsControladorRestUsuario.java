package com.max.curso.springboot.webapp.springbootweb.controladores;

import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.util.ParameterMap;
import org.springframework.stereotype.Controller;

//import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

//Controller + ResponseBody equivale a RestController
//@Controller 

@RequestMapping("/api")

public class ClsControladorRestUsuario 
{
    @GetMapping("/perfilapirest")
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

        objMapBody.put(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrTítulo1Clave,
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrTítulo1Valor);

        objMapBody.put(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrTítulo2Clave,
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrTítulo2Valor);

        objMapBody.put(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrNombre1UsuarioClave,
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrNombre1UsuarioValor);

        objMapBody.put(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrNombre2UsuarioClave,
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrNombre2UsuarioValor);

        objMapBody.put(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrApe1UsuarioClave,
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrApe1UsuarioValor);

        objMapBody.put(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrApe2UsuarioClave,
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrApe2UsuarioValor);

        //Se devuelve el objeto Map y se visualiza como json en el navegador, porque es un RestController
        return objMapBody;
    }
}
