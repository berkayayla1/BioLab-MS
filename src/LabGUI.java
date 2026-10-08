import javax.swing.*;
import java.awt.*;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Date;

/**
 * Graphical User Interface (GUI) for the Laboratory Management System.
 * Uses Java Swing to create a desktop window.
 */
public class LabGUI extends JFrame {

    private JTextArea consoleOutput;

    public LabGUI() {
        // 1. WINDOW SETUP
        setTitle("Laboratory Automation System - Control Panel");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); // Centers the window on screen

        // 2. CONSOLE OUTPUT AREA (The Black Screen)
        consoleOutput = new JTextArea();
        consoleOutput.setEditable(false);
        consoleOutput.setBackground(Color.BLACK);
        consoleOutput.setForeground(Color.GREEN); // Hacker/Terminal style
        consoleOutput.setFont(new Font("Monospaced", Font.PLAIN, 14));
        
        JScrollPane scrollPane = new JScrollPane(consoleOutput);
        scrollPane.setBorder(BorderFactory.createTitledBorder("System Monitor"));
        add(scrollPane, BorderLayout.CENTER);

        // 3. BUTTONS PANEL
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.DARK_GRAY);
        
        JButton btnRunSimulation = new JButton("▶ Run Full System Simulation");
        btnRunSimulation.setBackground(new Color(46, 204, 113)); // Green button
        btnRunSimulation.setForeground(Color.WHITE);
        btnRunSimulation.setFocusPainted(false);
        btnRunSimulation.setFont(new Font("Arial", Font.BOLD, 14));

        JButton btnClear = new JButton("Clear Monitor");
        btnClear.setBackground(new Color(231, 76, 60)); // Red button
        btnClear.setForeground(Color.WHITE);
        btnClear.setFocusPainted(false);

        buttonPanel.add(btnRunSimulation);
        buttonPanel.add(btnClear);
        add(buttonPanel, BorderLayout.SOUTH);

        // 4. REDIRECT SYSTEM.OUT TO TEXT AREA (The Magic Trick)
        redirectSystemStreams();

        // 5. BUTTON ACTIONS
        btnRunSimulation.addActionListener(e -> runSimulationWorkflow());
        btnClear.addActionListener(e -> consoleOutput.setText(""));
    }

    /**
     * This method intercepts System.out.println() and sends the text to the GUI.
     */
    private void redirectSystemStreams() {
        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) {
                // Update the text area on the GUI thread
                SwingUtilities.invokeLater(() -> {
                    consoleOutput.append(String.valueOf((char) b));
                    // Auto-scroll to the bottom
                    consoleOutput.setCaretPosition(consoleOutput.getDocument().getLength());
                });
            }
        };
        System.setOut(new PrintStream(out, true));
        System.setErr(new PrintStream(out, true)); // Redirect errors too
    }

    /**
     * The exact workflow from our previous Main.java.
     * When the button is clicked, this executes.
     */
    private void runSimulationWorkflow() {
        System.out.println("==================================================");
        System.out.println("     LABORATORY AUTOMATION SYSTEM INITIATED       ");
        System.out.println("==================================================\n");

        // Activating Actors
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

        // Workflow
        provider.register();
        provider.makePayment();
        System.out.println();

        System.out.println("--- SUBMITTING SAMPLES ---");
        for (int i = 1; i <= 3; i++) {
            Sample s = new Sample();
            s.setSampleID(100 + i);
            s.setSampleType("Blood Analysis");
            s.setCollectionDate(new Date());
            s.setProvider(provider);
            tech.addSample(s);
        }
        System.out.println();

        tech.processSample();
        System.out.println();

        officer.manageSampleList();
        officer.handleEmergency();
        System.out.println();

        Sample researchSample = new Sample();
        researchSample.setSampleID(501);
        researcher.addSample(researchSample);
        
        researcher.conductResearch();
        System.out.println();

        manager.manageDepartments();
        manager.superviseProcesses();
        manager.allocateResources();

        System.out.println("\n==================================================");
        System.out.println("               SIMULATION COMPLETE                ");
        System.out.println("==================================================\n");
    }

    public static void main(String[] args) {
        // ...
        // Start the GUI
        SwingUtilities.invokeLater(() -> {
            LabGUI gui = new LabGUI();
            gui.setVisible(true);
        });
    }
}