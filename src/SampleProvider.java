import java.awt.Image;

/**
 * Sample Provider class.
 * Represents the customer providing the biological sample.
 */
public class SampleProvider {

    // --- ATTRIBUTES ---
    private int tcID;
    private String nameSurname;
    private Image photo;
    private String address;
    private int workingPhone;
    private int homePhone;
    private int mobilePhone;
    private String email;

    // --- GETTERS ---
    public int getTcID() {
        return tcID;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public Image getPhoto() {
        return photo;
    }

    public String getAddress() {
        return address;
    }

    public int getWorkingPhone() {
        return workingPhone;
    }

    public int getHomePhone() {
        return homePhone;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    // --- SETTERS ---
    public void setTcID(int tcID) {
        this.tcID = tcID;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWorkingPhone(int workingPhone) {
        this.workingPhone = workingPhone;
    }

    public void setHomePhone(int homePhone) {
        this.homePhone = homePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // --- WORKFLOW METHODS ---
    public void register() {
        System.out.println("Sample Provider has been successfully registered to the laboratory system.");
    }

    public void makePayment() {
        System.out.println("Payment transaction has been completed by the Sample Provider.");
    }

    public void requestAnalysis() {
        System.out.println("A new analysis request has been created by the Sample Provider.");
    }
}