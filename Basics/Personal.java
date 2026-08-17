import java.util.Scanner;

public class Personal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        float percentage = scanner.nextFloat();
        String number = scanner.nextLine();
        char division = scanner.nextLine().charAt(0);
        scanner.close();

        System.out.println(name);
         System.out.println(age);
           System.out.println(percentage);
            System.out.println(number);
             System.out.println(division);

        




        
    }   
}
