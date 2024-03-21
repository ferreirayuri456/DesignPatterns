package br.com.hcode.designpattern.adapter.adapters;

import br.com.hcode.designpattern.adapter.payonner.Payonner;
import br.com.hcode.designpattern.adapter.paypal.IPaypalPayments;
import br.com.hcode.designpattern.adapter.utils.Token;

public class PayonnerAdapter implements IPaypalPayments {

    private Token token;
    private Payonner payonner;

    public PayonnerAdapter(Payonner payonner) {
        this.payonner = payonner;
        System.out.println("Adaptando Payonner utilizando os métodos do Paypal");
    }

    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payonner.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payonner.receivePayment();
    }
}
