package br.com.hcode.designpattern.factoryMethod.model;

import br.com.hcode.designpattern.factoryMethod.vehicle.Car;
import br.com.hcode.designpattern.factoryMethod.vehicle.IVehicle;

public class CarTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
