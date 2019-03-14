package com.pattern;

/**
 * @author xuhan  build  2019/3/14
 */
public class StrategyTest {
    public static void main(String[] args) {
        People people = new People();
        people.use(VehicleType.Train);
        people.use(VehicleType.Bike);
        people.use(VehicleType.Car);
        people.use("train");
        people.use("bike");
        people.use("car");
        people.use("carXXXX");
    }

}
