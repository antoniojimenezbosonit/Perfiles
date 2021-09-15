package com.bosonit.formacion.perfiles;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ConfigurationProperties("miconfiguracion.properties")
@ConfigurationProperties(prefix = "mic")
@PropertySource("miconfiguracion.properties")
public class Configuration {

    @Value("${valor1}")
    private String valor1;

    @Value("${valor2}")
    private String valor2;

    @GetMapping("miconfiguracion")
    public String parametros(){
        return "Valor1: " + valor1 + " valor2 : " + valor2;
    }

}
