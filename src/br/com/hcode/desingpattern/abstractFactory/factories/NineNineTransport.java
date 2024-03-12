package br.com.hcode.desingpattern.abstractFactory.factories;

import br.com.hcode.desingpattern.abstractFactory.aircraft.IAircraft;
import br.com.hcode.desingpattern.abstractFactory.aircraft.model.Airplane;
import br.com.hcode.desingpattern.abstractFactory.landVehicles.ILandVehicle;
import br.com.hcode.desingpattern.abstractFactory.landVehicles.model.Car;
import br.com.hcode.desingpattern.abstractFactory.vessels.model.Boat;
import br.com.hcode.desingpattern.abstractFactory.vessels.model.IVessels;

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
