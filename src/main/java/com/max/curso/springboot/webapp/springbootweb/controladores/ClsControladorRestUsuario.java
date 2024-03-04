package com.max.curso.springboot.webapp.springbootweb.controladores;

import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.util.ParameterMap;

//import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClsControladorRestUsuario 
{
    @GetMapping("/Detalles2")
    public Map<String,Object> Detalles()
    {
        Map<String,Object> objMapBody=new HashMap<>();
        //Map<String,Object> objMapBody=new ParameterMap<>();

        objMapBody.put(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrTítulo1Clave,
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrTítulo1Valor);

        objMapBody.put(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrNombre1UsuarioClave,
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrNombre1UsuarioValor);

        //return "Detalles";
        return objMapBody;
    }
}
