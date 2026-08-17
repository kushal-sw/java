class employee{
    String name;
    int salary;
    public void displayemployee(){
        System.out.println("Employee name is : " + name);
        System.out.println("Employee salary is : " + salary);
}}


class manager{
    
    String department;
    public void displaymanager(){
        System.out.println("Manager department is : " + department);
    }

}













public class Office {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        employee obj = new employee();
        obj.name = "kushal";
        obj.salary = 50000;
        obj.displayemployee();

        manager obj1 = new manager();
        obj1.department = "engeneering";
        obj1.displaymanager();}
    }
    
