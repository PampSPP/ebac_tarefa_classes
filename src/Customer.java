/**
 * @author PampSPP
 */
public class Customer {

    private String firstName;
    private String middleName;
    private String lastName;
    private int codeNumber;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the customer's full name
     * @return full name
     */
    public String getFullName() {
        String fullName = this.firstName;
        if (this.middleName != null) {
            fullName += " " + this.middleName;
        }
        if (this.lastName != null) {
            fullName += " " + this.lastName;
        }
        return fullName;
    }
}
