package com.max.curso.springboot.webapp.springbootweb.controladores;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.max.curso.springboot.webapp.springbootweb.ClsUtil;

@Controller

@RequestMapping("/api")

public class ClsControladorUsuario 
{
    //Esta llamada es casesensitive
    @GetMapping("/perfilhtml/html1")

    public String Detalles(Model objModel,Map<String,Object> objMap)
    {
        objModel.addAttribute(ClsUtil.cnstStrTítulo1Clave, ClsUtil.cnstStrTítulo1Valor);

        objModel.addAttribute(ClsUtil.cnstStrNombre1UsuarioClave, ClsUtil.cnstStrNombre1UsuarioValor);

        objModel.addAttribute(ClsUtil.cnstStrNombre2UsuarioClave, ClsUtil.cnstStrNombre2UsuarioValor);

        objModel.addAttribute(ClsUtil.cnstStrApe1UsuarioClave, ClsUtil.cnstStrApe1UsuarioValor);

        objModel.addAttribute(ClsUtil.cnstStrTítulo2Clave, ClsUtil.cnstStrTítulo2Valor);

        objModel.addAttribute(ClsUtil.cnstStrApe2UsuarioClave, ClsUtil.cnstStrApe2UsuarioValor);

        //Se devuelve el nombre del archivo html sin extensión situado en plantillas (templates)
        //esta llamada no es casesensitive
        return "html1";
    }
}
