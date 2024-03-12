package br.com.hcode.desingpattern.abstractFactory.factories;

import br.com.hcode.desingpattern.abstractFactory.vessels.model.Boat;
import br.com.hcode.desingpattern.abstractFactory.vessels.model.IVessels;

public class BoatTransport implements IWaterTransportFactory {

    @Override
    public IVessels createTransportVessels() {
        return new Boat();
    }
}
