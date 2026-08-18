// Parent class - Bank ki info
class Bank {
    String bankName;
    String branch;
    String ifscCode;

    // Constructor
    Bank(String bankName, String branch, String ifscCode) {
        this.bankName = bankName;
        this.branch = branch;
        this.ifscCode = ifscCode;
    }

    // Bank ki info return karne wala method
    String getBankInfo() {
        return "Bank Name: " + bankName +
               "\nBranch: " + branch +
               "\nIFSC Code: " + ifscCode;
    }
}

// Child class - Customer ki info (Bank ko extend kar rahi hai)
class Customer extends Bank {
    String customerName;
    String accountNumber;
    double balance;

    // Constructor - parent (Bank) ka constructor call karega
    Customer(String bankName, String branch, String ifscCode,
             String customerName, String accountNumber, double balance) {
        super(bankName, branch, ifscCode);   // Parent class constructor call
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Customer ki info return karne wala method
    String getCustomerInfo() {
        return "Customer Name: " + customerName +
               "\nAccount Number: " + accountNumber +
               "\nBalance: " + balance;
    }

    // Dono (Bank + Customer) ki full info return karna
    String getFullInfo() {
        return getBankInfo() + "\n" + getCustomerInfo();
    }
}

// Main class
public class Passbook {
    public static void main(String[] args) {
        // Customer object banaya - isme Bank ka data bhi aa jayega
        Customer customer1 = new Customer(
            "State Bank of India", "Pune Branch", "SBIN0001234",
            "Rahul Sharma", "1234567890", 50000.75
        );

        // Full info (Bank + Customer) print karna
        String info = customer1.getFullInfo();
        System.out.println(info);
    }
}
