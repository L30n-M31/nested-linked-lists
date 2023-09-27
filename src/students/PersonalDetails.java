package students;

public class PersonalDetails extends Student {
    private String gender;
    private String birthday;
    private int contactNumber;
    private String address;

    public PersonalDetails() {
        super();
        setGender(null);
        setBirthday(null);
        setContactNumber(0);
        setAddress(null);
    } // end of default constructor

    public PersonalDetails(String gender, String birthday, int contactNumber, String address) {
        super();
        setGender(gender);
        setBirthday(birthday);
        setContactNumber(contactNumber);
        setAddress(address);
    } // end of constructor

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Gender: " + gender + "\n" +
                "Birthday: " + birthday + "\n" +
                "Contact Number: " + contactNumber + "\n" +
                "Address: " + address + "\n";
    } // end of toString method
} // end of PersonalDetails
