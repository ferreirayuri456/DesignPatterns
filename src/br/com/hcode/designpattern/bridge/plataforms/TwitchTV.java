package br.com.hcode.designpattern.bridge.plataforms;

public class TwitchTV implements IPlataform{

    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV transmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Autorizado");
    }
}
