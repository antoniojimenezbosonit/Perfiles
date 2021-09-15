package com.bosonit.formacion.perfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @Value("${url}")
    private String url;

    @Value("${password}")
    private String password;

    @GetMapping("parametros")
    public String parametros(){
        return "Valor de url: " + url + " valor de password: " + password;
    }


}
