class Vehicles {
    String Brand;
    String Model;
    int price;

    void displayVehicle() {
        System.out.println("Brand : " + Brand);
        System.out.println("Model : " + Model);
        System.out.println("Price : " + price);
    }
}

class Car extends Vehicles {
    int numDoors;
    int numPassengers;

    void displayCar() {
        System.out.println("Number of doors : " + numDoors);
        System.out.println("Number of passengers : " + numPassengers);
    }

}

class Bike extends Vehicles {
    int numGears;
    int numWheels;

    void displayVehicle() {
        System.out.println("Number of gears : " + numGears);
        System.out.println("Number of wheels : " + numWheels);
    }

}

public class showroom {    public static void main(String[] args) {
        Vehicles obj = new Vehicles();
        obj.Brand = "BMW";
        obj.Model = "M5";
        obj.price = 2000000;
        obj.displayVehicle();

        Car obj2 = new Car();
        obj2.Brand = "BMW";
        obj2.Model = "M2";
        obj2.price = 2000000;
        obj2.numDoors = 4;
        obj2.numPassengers = 5;
        obj2.displayVehicle();
        obj2.displayCar();

        Bike obj3 = new Bike();
        obj3.Brand = "BMW";
        obj3.Model = "M5";
        obj3.price = 200000;
        obj3.numGears = 5;
        obj3.numWheels = 2;
        obj3.displayVehicle();
        obj3.displayVehicle();

    }
}


