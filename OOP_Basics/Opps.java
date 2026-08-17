import java.lang.*;

public class Opps {
public static void main(String[]args){
 Addition(){
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
        Addition obj = new Addition();
        obj.Addition();
    }
}