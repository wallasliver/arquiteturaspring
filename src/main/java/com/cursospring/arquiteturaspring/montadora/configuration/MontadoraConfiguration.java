package com.cursospring.arquiteturaspring.montadora.configuration;

import com.cursospring.arquiteturaspring.montadora.Motor;
import com.cursospring.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// A Classe Configuration tem o objetivo é registrar alguns Beans do Container,
// de InjenÇÃO de dependencias do Spring // Definições de Beans
@Configuration
public class MontadoraConfiguration {

    private Motor motor;

    /** Quando não se usa o @Qualify para especificar qual Bean chamar,
     o @Primary serve para indicar qual será insejado por padrão **/
    @Bean(name = "motorAspirado")
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico") // O Bean tem uma propriedade name
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setModelo("WWW");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    @Primary
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
    @Bean(name = "motorFerrari")
    public Motor motorFerrari(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.FERRARI);
        return motor;
    }

}
