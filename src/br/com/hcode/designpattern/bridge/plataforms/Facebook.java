package br.com.hcode.designpattern.bridge.plataforms;

public class Facebook implements IPlataform{

    public Facebook() {
        configureRMTP();
        System.out.println("Facebook transmissão iniciada ");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizado");
    }
}
