public class Percentage {
    public static void main(String[] args) {

        int total = 500;
        int math = 90;
        int science = 50;
        int hindi = 40;
        int marathi = 90;
        int social = 80;

        int obtained = math + science + hindi + marathi + social;

        double percentage = (obtained * 100.0) / total;

        System.out.println("Percentage = " + percentage + "%");
    }
}



