package com.TopsonOG.BeginnerSpring.Component;

import org.springframework.stereotype.Component;

@Component
public class VersionDos implements Componente{

    @Override
    public void Saludar() {
        System.out.println("Hola desde la version Dos");
    }
}
