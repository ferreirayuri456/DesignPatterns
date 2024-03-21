package br.com.hcode.designpattern.adapter.payonner;

import br.com.hcode.designpattern.adapter.utils.Token;

public interface IPayonnerPayments {

    Token getToken();
    void sendPayment();
    void receivePayment();
}
