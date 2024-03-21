package br.com.hcode.designpattern.adapter.adapters;

import br.com.hcode.designpattern.adapter.mercadoPago.IMercadoPagoPayments;
import br.com.hcode.designpattern.adapter.mercadoPago.MercadoPago;
import br.com.hcode.designpattern.adapter.payonner.Payonner;
import br.com.hcode.designpattern.adapter.paypal.IPaypalPayments;
import br.com.hcode.designpattern.adapter.utils.Token;

public class MercadoPagoAdapter implements IPaypalPayments {

    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando Mercado Pago utilizando métodos do Paypal");
    }

    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.sendPaymentMercadoPago();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.recievePaymentMercadoPago();
    }
}
