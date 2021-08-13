public class User {
    private String firstName, lastName;
    private String phoneNum;
    private String address;
    private int id;

    User(String firstName,
         String lastName,
         String address,
         String phoneNum,
         int id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNum = phoneNum;
        this.id = id;

    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getFirstName() {
        return firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String getLastName() {
        return lastName;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getAddress() {
        return address;
    }

    void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    String getPhoneNum() {
        return phoneNum;
    }

}
