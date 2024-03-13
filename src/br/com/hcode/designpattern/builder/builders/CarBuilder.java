package br.com.hcode.designpattern.builder.builders;

import br.com.hcode.designpattern.builder.components.CarType;
import br.com.hcode.designpattern.builder.components.Color;
import br.com.hcode.designpattern.builder.components.Engine;
import br.com.hcode.designpattern.builder.components.Transmission;
import br.com.hcode.designpattern.builder.model.Car;

public class CarBuilder implements IBuilder{


    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public br.com.hcode.designpattern.builder.model.Car getResult(){
        return new Car(carType, seats, engine,transmission);
    }
}
