# BioLab Management System (BioLab-MS)

This project is a laboratory management system designed to standardize workflows in a laboratory environment, ensure secure data access based on hierarchical roles, and enhance traceability.

## 📌 Project Overview

BioLab-MS is an automation system where laboratory personnel are authorized according to their job descriptions, sample processes are meticulously tracked, and biosafety protocols are strictly enforced. The system consists of a Java-based backend and HTML-based interface and reporting screens.

## 👥 User Roles and Permissions

The system includes the following roles based on a hierarchical structure and security protocols:

* **Lead Researcher:** Manages research processes and is authorized to report potential contamination risks.

* **Bio-Safety Officer:** Reviews and investigates risks reported by the lead researcher, creating transparent risk reports.

* **Lab Technician:** Executes physical isolation and sample processing operations. (Due to the security hierarchy, direct hazard reporting authority is restricted for this role).

* **Lab Manager:** Provides overall supervision of all laboratory processes and manages day-to-day operations.

* **Admin / System:** Manages overall access permissions, personnel data, and system security.

## 🛠️ Technologies Used

* **Backend & Logic:** Java (`LabGUI`, `LabStaff`, `Sample`, etc.)

* **Frontend & Reporting:** HTML (`index.html`, `manager.html`, `biosafety-report.html`, etc.)

## 📂 Project Directory Structure

Once you clone the project, you will see the following organized directory structure:

```
BioLab-MS/
├── src/                      # Java source codes
│   ├── Main.java             # Application entry point
│   ├── LabGUI.java           # User interface management
│   ├── LabStaff.java         # Base personnel class
│   ├── LeadResearcher.java   # Researcher role
│   ├── BioSafetyOfficer.java # Safety officer role
│   ├── LabTechnician.java    # Technician role
│   ├── LabManager.java       # Manager role
│   ├── Sample.java           # Sample data model
│   ├── SampleProvider.java   # Sample provider service
│   └── Analysis.java         # Analysis engine
├── web/                      # HTML interfaces and reporting files
│   ├── index.html            # Main entry page
│   ├── manager.html          # Manager dashboard
│   ├── technician.html       # Technician dashboard
│   ├── biosafety-report.html # Biosafety reports
│   └── ... (other html files)
└── README.md                 # Project documentation

```

## 🚀 Installation and Usage

1. Clone the repository to your local machine:

   ```
   git clone https://github.com/YOUR_USERNAME/BioLab-MS.git
   
   ```

2. **Java Application:** Open the Java files located in the `src` folder with your preferred IDE (IntelliJ IDEA, Eclipse, etc.) and run the application via `Main.java`.

3. **Interfaces:** You can view the user interfaces by opening the HTML files located under the `web` folder in any modern web browser.