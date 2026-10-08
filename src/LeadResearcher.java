import java.util.ArrayList;
import java.util.List;

/**
 * Lead Researcher class.
 * Inherits from LabStaff.
 * Handles advanced research on a batch of samples (Max Capacity limit applied).
 */
public class LeadResearcher extends LabStaff {

    // --- ATTRIBUTES ---
    private String speciality; // e.g., Genetics, Pathology
    
    private List<Sample> samples = new ArrayList<>();
    
    private final int MAX_CAPACITY = 10;

    // --- OPERATIONS / METHODS ---

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<Sample> getSamples() {
        return samples;
    }

    public void setSamples(List<Sample> samples) {
        this.samples = samples;
    }

    // --- WORKFLOW METHODS ---

    public void addSample(Sample sample) {
        if (samples.size() < MAX_CAPACITY) {
            samples.add(sample);
            System.out.println("Sample added to Researcher's rack. Capacity: " 
                               + samples.size() + "/" + MAX_CAPACITY);
        } else {
            System.out.println("ERROR: Researcher's rack is FULL! (Max " + MAX_CAPACITY + ").");
        }
    }

    public void conductResearch() {
        if (samples.isEmpty()) {
            System.out.println("No samples to research. The researcher's rack is empty.");
            return;
        }

        System.out.println("Lead Researcher is conducting advanced analysis on " 
                           + samples.size() + " samples...");
        
        samples.clear();
        
        System.out.println("SUCCESS: Research completed. Reports generated and rack is now EMPTY.");
    }
}