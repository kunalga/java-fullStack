package in.ineuron.bean;

public class Account {
    private String accNo;
    private String accHolderName;
    private String accType;

    // Constructor
    public Account(String accNo, String accHolderName, String accType) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accType = accType;
    }

    // Method to return account details
    public String getAccountDetails() {
        return "Account No: " + accNo + ", Holder Name: " + accHolderName + ", Type: " + accType;
    }

    public String getAccNo() {
        return accNo;
    }
}
