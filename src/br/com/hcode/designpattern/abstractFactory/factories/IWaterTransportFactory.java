package br.com.hcode.designpattern.abstractFactory.factories;

import br.com.hcode.designpattern.abstractFactory.vessels.model.IVessels;

public interface IWaterTransportFactory {

    IVessels createTransportVessels();
}
