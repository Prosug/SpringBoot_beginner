package com.TopsonOG.BeginnerSpring.Configuration;

import com.TopsonOG.BeginnerSpring.Bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Esta Anotacion le dira al framework que aqui tenemos algunas configuracion propias.
public class ConfigurationBeans {
    @Bean
    public ComponenteBean BeanOperation(){
        return new BeanTwo();
    }

    @Bean
    public ComponenteTwo OperacionSuma(){
        return new BeanThree();
    }
    @Bean
    public ComponenteThree ConImplementacion(ComponenteTwo componenteTwo){
        return new BeanFour(componenteTwo);
    }
}
