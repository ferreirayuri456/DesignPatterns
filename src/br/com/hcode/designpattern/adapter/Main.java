package br.com.hcode.designpattern.adapter;

import br.com.hcode.designpattern.adapter.adapters.MercadoPagoAdapter;
import br.com.hcode.designpattern.adapter.mercadoPago.MercadoPago;
import br.com.hcode.designpattern.adapter.paypal.IPaypalPayments;

public class Main {

    public static void main(String[] args) {
        IPaypalPayments payments = new MercadoPagoAdapter(new MercadoPago());
        payments.paypalPayment();
        payments.paypalReceive();
    }
}
