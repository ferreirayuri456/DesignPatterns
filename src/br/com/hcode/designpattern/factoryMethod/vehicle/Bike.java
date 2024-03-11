package br.com.hcode.designpattern.factoryMethod.vehicle;

public class Bike implements IVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Inciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Ja buscamos a comida");
    }
}
