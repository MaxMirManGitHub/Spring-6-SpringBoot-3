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
        //Map<String,Object> objMapBody=new HashMap<>();
        Map<String,Object> objMapBody=new ParameterMap<>();

        objMapBody.put("título", 
        "¡Hola Mundo Spring Framework 6 y Spring Boot 3 \n (construcción de aplicaciones web pa tontos del PSOE)!");

        objMapBody.put("nombreUsuario", "Máximo");

        objMapBody.put("ape1Usuario", "Miralles");

        objMapBody.put("título2", "Este es el segundo Título");

        objMapBody.put("nombre2Usuario", "Carlos");

        objMapBody.put("ape2Usuario", "Manresa");

        //return "Detalles";
        return objMapBody;
    }
}
