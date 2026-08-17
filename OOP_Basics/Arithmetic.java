import java.lang.*;

class MathematicalOperation {
    int no1;
    int no2;

    MathematicalOperation() {
        System.out.print("inside Default Constructer");
        this.no1 = 10;
        this.no2 = 20;
    }

    MathematicalOperation(int x, int y) {
        System.out.println("inside parameterised constructor");
        this.no1 = x;
        this.no2 = y;



        
    }
    public int addition() {
        return this.no1 + this.no2;
    }

    public int subraction(){
        return this.no1 - this.no2;
    }
        
    public int multiplication(){
        return this.no1 * this.no2;
    }
    public float devide(){
        return this.no1 / this.no2;
    }

    long getLong() {
        return 1000L;
    }

    double getDouble() {
        return 10.11;
    }
    byte getByte() {
        return 100;
    }
    char getChar() {
        return 'A';
    }

}

              class Arithmetic {
    public static void main(String[] args) {
        System.out.println("inside main function");
        MathematicalOperation obj1 = new MathematicalOperation();
        MathematicalOperation obj2 = new MathematicalOperation(40, 50);

        
        int ret = 0 ;    
        float rett = 0;

        ret = obj2.addition();
        System.out.println("Addition of obj2 is : " + ret);

        ret = obj2.subraction();
        System.out.println("subraction foobj2 is :" + ret);

         ret = obj1.addition();
        System.out.println("Addition of obj1 is : " + ret);

        ret = obj1.subraction();
        System.out.println("subraction fo obj1 is :" + ret);

        ret = obj1.multiplication();
        System.out.println("multiplication of obj1" + ret);

        ret = obj2.multiplication();
        System.out.println("multiplication of obj2" + ret);

        rett = obj1.devide();
        System.out.println("devide of obj1" + rett);

        for(int i = 0; i <= 10; i++) {
            System.out.println("value of i is : " + i);
        }
                                                    
                 





    }
}


