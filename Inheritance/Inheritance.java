 class second { 
  int a = 10;
  int b = 20;
 void fun(){
    System.out.println("This is base class");
 }

}


class base{
  void gun (){
    System.out.println("This is base class");


  }
}
 public class Inheritance{
    public static void main(String[] args) {
        System.out.println("Inheritance");

        second obj = new second();
        obj.fun();
        // obj.fun();
        base obj1 = new base  ();
        obj1.gun();


      
  

    }
}


// create a parent class called employee with attrubutes name , name , salary and display emoloye()
//  create a child class caled manager with attributes department and display manger()

