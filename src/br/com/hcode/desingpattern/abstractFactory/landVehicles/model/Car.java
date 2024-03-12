package br.com.hcode.desingpattern.abstractFactory.landVehicles.model;

import br.com.hcode.desingpattern.abstractFactory.landVehicles.ILandVehicle;

public class Car implements ILandVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros. Estamos prontos");
    }
}
