package com.bosonit.formacion.perfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@Profile("perfil1")
public class perfil1 implements Perfiles{

    @Value("${perfil}")
    private String perfil;


    @Override
    public void miFuncion() {
        System.out.println("Este es el perfil 1");
    }

    @GetMapping("perfil")
    public String miPerfil(){
        return "Estoy en el perfil: " + perfil;
    }
}
