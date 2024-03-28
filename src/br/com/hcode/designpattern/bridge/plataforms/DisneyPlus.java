package br.com.hcode.designpattern.bridge.plataforms;

public class DisneyPlus implements IPlataform{

    public DisneyPlus() {
        configureRMTP();
        System.out.println("Disney Plus tranmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        System.out.println("Disney Plus: Configurando RMTP");
        authToken();
    }

    @Override
    public void authToken() {
        System.out.println("Disney Plus: Autorizada");
    }
}
