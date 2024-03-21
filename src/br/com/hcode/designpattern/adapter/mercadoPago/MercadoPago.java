package br.com.hcode.designpattern.adapter.mercadoPago;

import br.com.hcode.designpattern.adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPayments{


    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void sendPaymentMercadoPago() {
        this.getToken();
        System.out.println("Enviando pagamentos com o Mercado Pago");
    }

    @Override
    public void recievePaymentMercadoPago() {
        System.out.println("Recebendo pagamentos via Mercado Pago");
    }
}
