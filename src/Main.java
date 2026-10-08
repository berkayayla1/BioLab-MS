import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- LABORATORY AUTOMATION SYSTEM STARTING ---\n");

        // 1. INITIALIZING ACTORS
        SampleProvider provider = new SampleProvider();
        provider.setNameSurname("Berkay Clinical Services");
        provider.setTcID(123456789);

        LabTechnician tech = new LabTechnician();
        tech.setNameSurname("John Doe"); 
        tech.setTechnicalLevel("Senior");

        LeadResearcher researcher = new LeadResearcher();
        researcher.setNameSurname("Dr. Alice Smith"); 
        researcher.setSpeciality("Molecular Biology");

        BioSafetyOfficer officer = new BioSafetyOfficer();
        officer.setNameSurname("Officer Bob"); 
        officer.setSafetyLevel(4);

        LabManager manager = new LabManager();
        manager.setNameSurname("Director Charlie"); 

        // 2. WORKFLOW START: Provider Registration
        provider.register();
        provider.requestAnalysis();
        provider.makePayment();
        System.out.println();

        // 3. SAMPLE SUBMISSION
        System.out.println("--- SUBMITTING SAMPLES TO TECHNICIAN ---");
        for (int i = 1; i <= 3; i++) {
            Sample s = new Sample();
            s.setSampleID(100 + i);
            s.setSampleType("Blood Analysis");
            s.setCollectionDate(new Date());
            s.setProvider(provider);
            
            tech.addSample(s);
        }
        System.out.println();

        // 4. LABORATORY PROCESSING
        tech.processSample();
        System.out.println();

        // 5. SAFETY AUDIT
        officer.manageSampleList();
        officer.handleEmergency(); 
        System.out.println();

        // 6. RESEARCH STAGE
        Sample researchSample = new Sample();
        researchSample.setSampleID(501);
        researcher.addSample(researchSample);
        researcher.conductResearch();
        System.out.println();

        // 7. MANAGEMENT ROUTINE
        manager.manageDepartments();
        manager.superviseProcesses();
        manager.allocateResources();

        System.out.println("\n--- SYSTEM SIMULATION COMPLETED SUCCESSFULLY ---");
    }
}