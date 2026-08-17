public class Odd {
    // static int Num1 = 6;
    public static void main(String[] args) {
        int Num1 = 6;
        if(Num1 % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        for(int i = 0 ; i <=10 ; i++){
            if(i % 2 == 0) {
                System.out.println("Even number is : " + i);
            } else {
                System.out.println("Odd number is : " + i);
            }
        }
    }
}

