import java.util.Date;

/**
 * Sample class.
 * Acts as the central tracking entity in the laboratory system.
 * It holds references to the provider, the assigned technician, the researcher, and the analysis type.
 */
public class Sample {

    // --- ATTRIBUTES ---
    private int sampleID;
    private String sampleType;
    private Date collectionDate;
    private String storageCondition;
    private String status;
    private double volume;
    
    // Relational Attributes (Connections to other classes)
    private SampleProvider provider;
    private LeadResearcher researcher;
    private LabTechnician technician;
    private Analysis analysis;

    // --- GETTERS ---
    public int getSampleID() {
        return sampleID;
    }

    public String getSampleType() {
        return sampleType;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public String getStorageCondition() {
        return storageCondition;
    }

    public String getStatus() {
        return status;
    }

    public double getVolume() {
        return volume;
    }

    public SampleProvider getProvider() {
        return provider;
    }

    public LeadResearcher getResearcher() {
        return researcher;
    }

    public LabTechnician getTechnician() {
        return technician;
    }

    public Analysis getAnalysis() {
        return analysis;
    }

    // --- SETTERS ---
    public void setSampleID(int sampleID) {
        this.sampleID = sampleID;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public void setStorageCondition(String storageCondition) {
        this.storageCondition = storageCondition;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setProvider(SampleProvider provider) {
        this.provider = provider;
    }

    public void setResearcher(LeadResearcher researcher) {
        this.researcher = researcher;
    }

    public void setTechnician(LabTechnician technician) {
        this.technician = technician;
    }

    public void setAnalysis(Analysis analysis) {
        this.analysis = analysis;
    }
}