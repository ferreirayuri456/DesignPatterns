package br.com.hcode.designpattern.adapter.mercadoPago;

import br.com.hcode.designpattern.adapter.utils.Token;

public interface IMercadoPagoPayments {

    Token getToken();
    void sendPaymentMercadoPago();
    void recievePaymentMercadoPago();
}
