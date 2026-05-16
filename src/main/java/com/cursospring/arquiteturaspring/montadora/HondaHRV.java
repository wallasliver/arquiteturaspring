package com.cursospring.arquiteturaspring.montadora;

import java.awt.*;

public class HondaHRV extends Carro{

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("CIVIC");
        setCor(Color.RED);
        setMontadora(Montadora.HONDA);
    }


}
