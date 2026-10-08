import java.util.Date;

/**
 * Analysis class.
 * Represents the specific laboratory test/analysis details performed on a sample.
 * Exact implementation of the provided UML Class Diagram.
 */
public class Analysis {

    // --- ATTRIBUTES (Private) ---
    private String labSection;
    private Date analysisDate;
    private int researcherID;
    private String reagents;
    private int deviceNo;
    private int rackNo;
    private String result;
    private String method;
    private Sample sample; // The core link back to the tracking ticket

    // --- OPERATIONS / METHODS (Public) ---

    // --- GETTERS ---
    public String getLabSection() {
        return labSection;
    }

    public Date getAnalysisDate() {
        return analysisDate;
    }

    public int getResearcherID() {
        return researcherID;
    }

    public String getReagents() {
        return reagents;
    }

    public int getDeviceNo() {
        return deviceNo;
    }

    public int getRackNo() {
        return rackNo;
    }

    public String getResult() {
        return result;
    }

    public String getMethod() {
        return method;
    }

    public Sample getSample() {
        return sample;
    }

    // --- SETTERS ---
    public void setLabSection(String labSection) {
        this.labSection = labSection;
    }

    public void setAnalysisDate(Date analysisDate) {
        this.analysisDate = analysisDate;
    }

    public void setResearcherID(int researcherID) {
        this.researcherID = researcherID;
    }

    public void setReagents(String reagents) {
        this.reagents = reagents;
    }

    public void setDeviceNo(int deviceNo) {
        this.deviceNo = deviceNo;
    }

    public void setRackNo(int rackNo) {
        this.rackNo = rackNo;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }
}