package com.TopsonOG.BeginnerSpring.Bean;

public class BeanOne implements  ComponenteBean{

    @Override
    public void Saludar() {
        System.out.println("Hola desde mi Bean One");
    }
}
