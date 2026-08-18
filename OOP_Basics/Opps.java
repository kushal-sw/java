

public class Opps {
    int a;
    int b;
    
    public Opps(){
        this.a = 10;
        this.b = 20;
    }

    public void Addition(){
        int c = a + b;
        System.out.println("Addition of two numbers is : " + c);
    }
}


class second{
    public static void main(String[]args){
        Opps obj = new Opps();
        obj.Addition();
    }
}