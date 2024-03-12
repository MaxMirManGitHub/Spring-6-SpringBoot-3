package com.max.curso.springboot.webapp.springbootweb.controladores;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/api")

public class ClsControladorUsuario 
{
    //Esta llamada es casesensitive
    @GetMapping("/perfilthymeleaf")

    public String Detalles(Model objModel,Map<String,Object> objMap)
    {
        objModel.addAttribute(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrTítulo1Clave, 
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrTítulo1Valor);

        objModel.addAttribute(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrNombre1UsuarioClave, 
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrNombre1UsuarioValor);

        objModel.addAttribute(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrNombre2UsuarioClave, 
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrNombre2UsuarioValor);

        objModel.addAttribute(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrApe1UsuarioClave, 
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrApe1UsuarioValor);

        objModel.addAttribute(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrTítulo2Clave, 
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrTítulo2Valor);

        objModel.addAttribute(com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrApe2UsuarioClave, 
        com.max.curso.springboot.webapp.springbootweb.ClsUtil.cnstStrApe2UsuarioValor);

        //Se devuelve el nombre del archivo html sin extensión situado en plantillas (templates)
        //esta llamada no es casesensitive
        return "perfil";
    }
}
