package br.com.hcode.desingpattern.abstractFactory.factories;

import br.com.hcode.desingpattern.abstractFactory.aircraft.IAircraft;
import br.com.hcode.desingpattern.abstractFactory.landVehicles.ILandVehicle;

public interface ITransportFactory {

    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();

}
