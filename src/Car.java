
import UserDefineUtil.*;
import UserDefineUtil.Helper;

import java.util.Scanner;

abstract class Test {

    abstract String rating();

    protected String helloWorld() {
        return "Hello World";
    }
}

public class Car extends Test {

    public String color;
    public String brand;
    public String model;
    private static int TOTAL_CARS;
    public int price = 10;
    private int CarKeyIdentity;

    Car(String brand, String model, String color) {
        super();
        this.brand = brand;
        this.model = model;
        this.color = color;
        TOTAL_CARS += 1;
        helloWorld();
    }


    static int getTotalCars() {
        return TOTAL_CARS;
    }


    @Override
    public String rating() {
        return "";
    }

    public int getCarKeyIdentity() {
        return CarKeyIdentity;
    }

    public void setCarKeyIdentity(int carKeyIdentity) {
        CarKeyIdentity = carKeyIdentity;
    }
    public void Test(){
    }
}



