package br.com.hcode.designpattern.bridge.plataforms;

public class Youtube implements IPlataform{
    public Youtube() {
        configureRMTP();
        System.out.println("Youtube transmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Youtube: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Youtube: Autorizado");
    }
}
