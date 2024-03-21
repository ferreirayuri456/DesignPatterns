package br.com.hcode.designpattern.adapter.payonner;

import br.com.hcode.designpattern.adapter.utils.Token;

public class Payonner implements IPayonnerPayments{

    private Token token;

    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        this.token = getToken();
        System.out.println("Enviando pagamento com o Payonner");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamento via Payonner");
    }
}
