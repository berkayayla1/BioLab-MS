import java.util.ArrayList;
import java.util.List;

/**
 * Lab Technician class.
 * Handles a maximum of 10 samples at a time.
 * Once processed, the rack is cleared for new samples.
 */
public class LabTechnician extends LabStaff {

    // --- ATTRIBUTES ---
    private String technicalLevel;
    
    private List<Sample> samples = new ArrayList<>();
    
    private final int MAX_CAPACITY = 10;

    // --- OPERATIONS / METHODS ---
    
    public String getTechnicalLevel() {
        return technicalLevel;
    }

    public void setTechnicalLevel(String technicalLevel) {
        this.technicalLevel = technicalLevel;
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
            System.out.println("Sample successfully added. Current rack capacity: " 
                               + samples.size() + "/" + MAX_CAPACITY);
        } else {
            // Raf dolduysa sistem hata mesajı verir ve numuneyi reddeder
            System.out.println("ERROR: Technician's rack is FULL! (Max 10). " 
                               + "Please process existing samples before adding new ones.");
        }
    }

    public void editSample(Sample sample) {
        System.out.println("Sample details updated.");
    }

    public void collectFee() {
        System.out.println("Analysis fee collected from provider.");
    }

    public void processSample() {
        if (samples.isEmpty()) {
            System.out.println("No samples to process. The rack is empty.");
            return;
        }

        System.out.println("Processing " + samples.size() + " samples one by one in the microscope...");
        
        samples.clear(); 
        
        System.out.println("SUCCESS: All samples processed and disposed! The rack is now EMPTY and ready for new samples.");
    }
}