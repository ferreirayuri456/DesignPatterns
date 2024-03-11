package br.com.hcode.designpattern.factoryMethod.model;

import br.com.hcode.designpattern.factoryMethod.vehicle.IVehicle;
import br.com.hcode.designpattern.factoryMethod.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
