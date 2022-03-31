package heranca;

import polimorfismo.AnimalImplementacao;
import polimorfismo.AnimalInterface;

import javax.swing.*;

public class cavalo extends animal implements AnimalInterface {


    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);


    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void locomover() {

    }
}
