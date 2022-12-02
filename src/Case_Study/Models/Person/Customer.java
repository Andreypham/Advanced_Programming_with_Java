package Case_Study.Models.Person;

public class Customer extends Person{
    private String customerID;
    private String customerType;
    private String address;

    public Customer(){
    }
    public Customer(String customerID, String customerType, String address) {
        this.customerID = customerID;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String fullName, String dateOfBirth, boolean gender, String identityCard, String phoneNumber, String email, String customerID, String customerType, String address) {
        super(fullName, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.customerID = customerID;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String displayMainInfo() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", customerType='" + customerType + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", identityCard='" + getIdentityCard() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                '}';
    }
}
