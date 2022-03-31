package heranca;

import polimorfismo.BebidaInterface;

public class suco extends bebida implements BebidaInterface {
    @Override
    public void setFlavor(String flavor) {
        super.setFlavor(flavor);
    }

    @Override
    public void abrirRecipiente() {

    }

    @Override
    public void reciclar() {

    }
}
