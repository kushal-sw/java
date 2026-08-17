class person{
 String name = "kushal";
}

class student extends person{
  String name = "kushallll";
    public void display(){
        System.out.println(this.name);


    }}
public class Super {
public static void main(String[] args) {

        student obj = new student();
        obj.display();
    }

  
}
