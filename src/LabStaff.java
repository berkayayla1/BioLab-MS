import java.util.Date;
import java.awt.Image; // Added to support the Image data type

/**
 * Base class for all laboratory staff.
 * This class uses inheritance (Generalization) to share attributes 
 * with LabManager, LeadResearcher, LabTechnician, and BioSafetyOfficer.
 */
public class LabStaff {

    // --- ATTRIBUTES (Private for encapsulation) ---
    private int tcId;
    private String nameSurname;
    private Image photo; 
    private Date startWorking;
    private String address;
    private String unit;
    private int workingPhone;
    private int homePhone;
    private int mobilePhone;
    private String email;

    // --- OPERATIONS / METHODS (Public) ---

    public int getTcId() {
        return tcId;
    }

    public void setTcId(int tcId) {
        this.tcId = tcId;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    // Updated Getter and Setter for Image
    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    public Date getStartWorking() {
        return startWorking;
    }

    public void setStartWorking(Date startWorking) {
        this.startWorking = startWorking;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkingPhone() {
        return workingPhone;
    }

    public void setWorkingPhone(int workingPhone) {
        this.workingPhone = workingPhone;
    }

    public int getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(int homePhone) {
        this.homePhone = homePhone;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}