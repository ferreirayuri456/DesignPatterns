package br.com.hcode.designpattern.adapter.paypal;

import br.com.hcode.designpattern.adapter.utils.Token;

public class Paypal implements IPaypalPayments{

    private Token token;

    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = getToken();
        System.out.println("Enviando pagamentos com o Paypal");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamentos via Paypal");
    }
}
