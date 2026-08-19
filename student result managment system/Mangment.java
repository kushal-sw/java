class StudentResult {

    // Method to calculate total marks
    public int calculateTotal(int[] marks) {
        int total = 0;

        for (int mark : marks) {
            total = total + mark;
        }

        return total;
    }
    public double calculateAverage(int total) {
        return total / 5.0;
    }
    public int findHighest(int[] marks) {
        int highest = marks[0];

        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }

        return highest;
    }

 public int findLowest(int[] marks) {
        int lowest = marks[0];

        for (int mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }

        return lowest;
    }

    public void displayResult(String[] subjects, int[] marks,int total, double average,int highest, int lowest) {
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }

    public static void main(String[] args) {

        StudentResult student = new StudentResult();

        String[] subjects = {
            "Java",
            "Database",
            "Computer Network",
            "Operating System",
            "Mathematics"
        };
        int[] marks = {20, 30, 40, 50, 60};

        int total = student.calculateTotal(marks);
        double average = student.calculateAverage(total);
        int highest = student.findHighest(marks);
        int lowest = student.findLowest(marks);

        student.displayResult(
            subjects,
            marks,
            total,
            average,
            highest,
            lowest
        );
    }
}