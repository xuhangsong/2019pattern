package com.pattern;

/**
 * @author xuhan  build  2019/3/14
 */
public enum VehicleType {
    Bike(new Bike(),"bike"),Car(new Car(),"car"),Train(new Train(),"train");

    public String name;
    public Vehicle vehicle;

    VehicleType(Vehicle v,String name){
        this.name = name;
        this.vehicle = v;
    }

    public static Vehicle getVehicle(String name){
        for (VehicleType e : VehicleType.values()) {
            if(e.name.equals(name)){
                return e.vehicle;
            }
        }
        return VehicleType.values()[0].vehicle;
    }
    public static String getName(String name){
        for (VehicleType e : VehicleType.values()) {
            if(e.name.equals(name)){
                return name;
            }
        }
        return VehicleType.values()[0].name;
    }

}
