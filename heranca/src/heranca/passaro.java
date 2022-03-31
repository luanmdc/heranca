package heranca;

import polimorfismo.AnimalInterface;

public class passaro extends animal implements AnimalInterface {
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
