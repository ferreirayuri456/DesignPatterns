package br.com.hcode.designpattern.abstractFactory.landVehicles.model;

import br.com.hcode.designpattern.abstractFactory.landVehicles.ILandVehicle;

public class Motorcycle implements ILandVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega");
        System.out.println(" ");
    }

    @Override
    public void getCargo() {
        System.out.println("Ja pegamos a encomenda");
    }
}
