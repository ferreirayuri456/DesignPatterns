package br.com.hcode.designpattern.abstractFactory.factories;

import br.com.hcode.designpattern.abstractFactory.aircraft.IAircraft;
import br.com.hcode.designpattern.abstractFactory.landVehicles.ILandVehicle;
import br.com.hcode.designpattern.abstractFactory.landVehicles.model.Car;
import br.com.hcode.designpattern.abstractFactory.aircraft.model.Airplane;

public class NineNineTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
