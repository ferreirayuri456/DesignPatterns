package br.com.hcode.designpattern.factoryMethod.model;

import br.com.hcode.designpattern.factoryMethod.vehicle.IVehicle;

public abstract class Transport {

    void startTransport(){
        IVehicle iVehicle = createTransport();
        iVehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
