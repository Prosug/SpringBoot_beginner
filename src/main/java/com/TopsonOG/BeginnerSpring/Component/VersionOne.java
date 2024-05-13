package com.TopsonOG.BeginnerSpring.Component;

import org.springframework.stereotype.Component;


@Component
public class VersionOne implements Componente{

    @Override
    public void Saludar() {
        System.out.println("Saludando desde mi componente :)");
    }
}
