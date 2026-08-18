//Overridng - Runtime Polymorphism
class Base {
    void fun() {
        System.out.println("Inside Base fun");
    }

    void gun() {
        System.out.println("Inside gun");
    }
}

class Derived extends Base {
    void fun() {
        System.out.println("Inside Derived fun");
    }
}

public class Override {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.fun();
        Base obj1 = new Base();
        obj1.fun();
        Base obj2 = new Derived();
        obj2.fun();

    }
}