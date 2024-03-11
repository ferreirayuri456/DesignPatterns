package br.com.hcode.designpattern.factoryMethod.model;

import br.com.hcode.designpattern.factoryMethod.vehicle.Bike;
import br.com.hcode.designpattern.factoryMethod.vehicle.IVehicle;

public class BikeTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
