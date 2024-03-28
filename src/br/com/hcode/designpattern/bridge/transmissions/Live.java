package br.com.hcode.designpattern.bridge.transmissions;

import br.com.hcode.designpattern.bridge.plataforms.IPlataform;

public class Live implements ITransmission{

    protected IPlataform plataform;

    public Live() {
    }

    public Live(IPlataform plataform){
        this.plataform = plataform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Inicinado a transmissao");
    }

    @Override
    public void result() {
        System.out.println("No ar");
    }
}
