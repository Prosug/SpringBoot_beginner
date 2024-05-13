package com.TopsonOG.BeginnerSpring;

import com.TopsonOG.BeginnerSpring.Bean.ComponenteBean;
import com.TopsonOG.BeginnerSpring.Bean.ComponenteThree;
import com.TopsonOG.BeginnerSpring.Component.Componente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Implementamos ComandLineRunner lo que ejecuta la aplicacion todo lo que queramos mostrar.
@SpringBootApplication
public class BeginnerSpringApplication  implements CommandLineRunner {

	//Inyectamos la interfaz/dependencia
	private Componente componente;
	private ComponenteBean componenteBean;

	private ComponenteThree componenteThree;

	public BeginnerSpringApplication(@Qualifier("versionDos") Componente componente,ComponenteBean componenteBean,ComponenteThree componenteThree){
		this.componente=componente;
		this.componenteBean=componenteBean;
		this.componenteThree=componenteThree;
	}

	public static void main(String[] args) {
		SpringApplication.run(BeginnerSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.componente.Saludar();
		this.componenteBean.Saludar();
		this.componenteThree.MostrarLaDependencia();
	}
}
