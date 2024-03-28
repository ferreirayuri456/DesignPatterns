package br.com.hcode.designpattern.bridge.transmissions;

import br.com.hcode.designpattern.bridge.plataforms.IPlataform;
import jdk.swing.interop.LightweightContentWrapper;

public class AdvancedLive extends Live {

    public AdvancedLive(IPlataform plataform) {
        super(plataform);
    }

    public void subtitles(){
        System.out.println("Legendas ativadas na transmissão");
    }

    public void comments(){
        System.out.println("Comentários liberados na transmissão");
    }
}
