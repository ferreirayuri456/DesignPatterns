package br.com.hcode.designpattern.bridge.transmissions;

import br.com.hcode.designpattern.bridge.plataforms.IPlataform;

public class RecordLive extends Live{

    public RecordLive(IPlataform plataform) {
        super(plataform);
    }

    public void recordLive(){
        System.out.println("Gravando a sua transmissão");
    }
}
