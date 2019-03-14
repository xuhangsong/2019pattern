package com.pattern;

/**
 * @author xuhan  build  2019/3/14
 */
public class People {

    public void use(String vehicle){
        System.out.println("人选择了 " +VehicleType.getName(vehicle));
        VehicleType.getVehicle(vehicle).run();
    }
    public void use(VehicleType vehicle){
        System.out.println("人选择了 "+vehicle.name);
        vehicle.vehicle.run();
    }
}
