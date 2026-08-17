class Addition{
    public void item(double price){
        System.out.println("price of the item is =" + price);
    }

    public void item(int price , int quantity){
        int total = price * quantity;
        System.out.println("Total price of the item is =" + total);
    }
    public void item(int price2 , double gst){
        double total = price2 +  gst;
        System.out.println("Total price of the item is =" + total);
    }
}

public class Assignment {
    public static void main(String[] args) {
        System.out.println("Overloading");
        Addition obj = new Addition();
        obj.item(100.00);
        obj.item(100, 5);
        obj.item(100, 18.00);
    }
    
}
