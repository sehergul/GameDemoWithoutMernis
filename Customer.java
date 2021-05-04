
public class Customer {
    private String firstName;
    private String lastName;
    private String nationalityId;
    private int dateOfBirth;

    public Customer(){}

    public Customer(String firstName, String lastName, String nationalityId, int dateOfBirth) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
