package com.max.curso.springboot.webapp.springbootweb.controladores;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ClsControladorUsuario 
{
    @GetMapping("/Detalles1")
    public String Detalles(Model objModel,Map<String,Object> objMap)
    {
        objModel.addAttribute("título", 
        "¡Hola Mundo Spring Framework 6 y Spring Boot 3 \n (construcción de aplicaciones web pa tontos del PSOE)!");

        objModel.addAttribute("nombreUsuario", "Máximo");

        objModel.addAttribute("ape1Usuario", "Miralles");

        objMap.put("título2", "Este es el segundo Título");

        objMap.put("nombre2Usuario", "Carlos");

        objMap.put("ape2Usuario", "Manresa");

        return "Detalles";
    }
}
