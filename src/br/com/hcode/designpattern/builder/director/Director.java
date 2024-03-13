package br.com.hcode.designpattern.builder.director;

import br.com.hcode.designpattern.builder.builders.IBuilder;
import br.com.hcode.designpattern.builder.builders.ISportCarBuilder;
import br.com.hcode.designpattern.builder.components.CarType;
import br.com.hcode.designpattern.builder.components.Color;
import br.com.hcode.designpattern.builder.components.Engine;
import br.com.hcode.designpattern.builder.components.Transmission;

public class Director {

    public void createSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void createTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(3);
        builder.setTransmission(Transmission.MANUAL);
        builder.setEngine(new Engine(3600));
    }

    public void createSportCar(ISportCarBuilder builder){
        builder.setCarType(CarType.SPORTCAR);
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(3000));
        builder.setColor(Color.YELLOW);

    }
}
