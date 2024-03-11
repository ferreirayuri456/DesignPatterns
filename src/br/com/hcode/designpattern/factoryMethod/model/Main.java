package br.com.hcode.designpattern.factoryMethod.model;

import java.util.Objects;

public class Main {

    private static Transport transport;

    public static void main(String[] args) {

        configure(args[0]);
        if (Objects.nonNull(transport)){
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        if ("uber".equals(type)) {
            transport = new CarTransport();
        } else if ("log".equals(type)) {
            transport = new MotorcycleTransport();
        } else if ("eats".equals(type)){
            transport = new BikeTransport();
        } else {
            System.out.println("selecione o tipo de entrega");
        }
    }
}
