/**
 * BioSafety Officer class.
 * Inherits from LabStaff.
 * Responsible for monitoring safety levels, handling emergencies, 
 * and managing specific samples for safety audits.
 * Exact implementation of the provided UML Class Diagram.
 */
public class BioSafetyOfficer extends LabStaff {

    // --- ATTRIBUTES (Private) ---
    private int safetyLevel;
    private Sample sample; // Added strictly as per the UML diagram

    // --- OPERATIONS / METHODS (Public) ---

    // --- GETTERS ---
    public int getSafetyLevel() {
        return safetyLevel;
    }

    public Sample getSample() {
        return sample;
    }

    // --- SETTERS ---
    public void setSafetyLevel(int safetyLevel) {
        this.safetyLevel = safetyLevel;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    // --- WORKFLOW METHODS ---

    /**
     * Audits and manages the sample lists in the laboratory.
     * @return An array of samples that have been inspected.
     */
    public Sample[] manageSampleList() {
        System.out.println("BioSafety Officer is managing and inspecting the sample list.");
        
        // Returning an empty array for now to satisfy the method signature
        // In a real system, this would return the actual inspected samples
        return new Sample[0]; 
    }

    /**
     * Activates emergency protocols if a critical safety breach occurs.
     */
    public void handleEmergency() {
        System.out.println("ALERT: Emergency protocols activated by the BioSafety Officer!");
    }

    /**
     * Reports any bio-hazard contamination to the facility.
     */
    public void reportContamination() {
        System.out.println("CRITICAL: Contamination reported to the facility by the BioSafety Officer.");
    }
}