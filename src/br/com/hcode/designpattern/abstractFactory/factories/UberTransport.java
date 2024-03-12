package br.com.hcode.designpattern.abstractFactory.factories;

import br.com.hcode.designpattern.abstractFactory.aircraft.IAircraft;
import br.com.hcode.designpattern.abstractFactory.landVehicles.ILandVehicle;
import br.com.hcode.designpattern.abstractFactory.landVehicles.model.Motorcycle;
import br.com.hcode.designpattern.abstractFactory.aircraft.model.Helicopter;

public class UberTransport implements ITransportFactory{

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

}
