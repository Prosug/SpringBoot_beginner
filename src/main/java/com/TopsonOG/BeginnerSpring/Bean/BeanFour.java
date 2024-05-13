package com.TopsonOG.BeginnerSpring.Bean;

public class BeanFour implements ComponenteThree{

    private ComponenteTwo componenteTwo;

    public BeanFour(ComponenteTwo componenteTwo) {
        this.componenteTwo = componenteTwo;
    }

    @Override
    public void MostrarLaDependencia() {
        System.out.println("numero retornado "+componenteTwo.sum(4));
        System.out.println("Hola desde mi implementacion");
    }
}
