package br.com.hcode.desingpattern.abstractFactory.factories;

import br.com.hcode.desingpattern.abstractFactory.aircraft.IAircraft;
import br.com.hcode.desingpattern.abstractFactory.aircraft.model.Helicopter;
import br.com.hcode.desingpattern.abstractFactory.landVehicles.ILandVehicle;
import br.com.hcode.desingpattern.abstractFactory.landVehicles.model.Motorcycle;

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
