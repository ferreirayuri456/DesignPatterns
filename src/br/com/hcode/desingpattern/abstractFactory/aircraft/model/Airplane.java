package br.com.hcode.desingpattern.abstractFactory.aircraft.model;

import br.com.hcode.desingpattern.abstractFactory.aircraft.IAircraft;

public class Airplane implements IAircraft {

    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo. Decolagem autorizada.");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 55km/h, ventos favoraveis");
    }
}
