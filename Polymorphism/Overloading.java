class Demo{
   Demo(){       

    // demo() is defualt consdturctor 
    System.out.println("inside defiault constructor");
   }
    public void addition(int x , int y ){
        int sum = x+y;
        System.out.println("Addition of two numbers: " + (sum));


    }
    public void addition(float x , float y , float z  ){
        float sum = x + y + z;
        System.out.println("Addition of two numbers: " + (sum));

        

    }
}



class Overloading {
    public static void main(String[]args){
        System.out.println("Overloading");
        Demo obj = new Demo();
        obj.addition(10, 20);
        obj.addition(20f, 20.220f , 50.33f);
    }
}