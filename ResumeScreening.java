
import java.util.ArrayList;
import java.util.List;

// Abstract class for Job Roles
abstract class JobRole {
    private String title;

    public JobRole(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void processResume();
}

// Job Role Implementations
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public void processResume() {
        System.out.println("Processing Resume for Software Engineer");
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public void processResume() {
        System.out.println("Processing Resume for Data Scientist");
    }
}

// Generic Resume class
class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void screenResume() {
        jobRole.processResume();
    }

    // Wildcard method
    public static void processAllResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            role.processResume();
        }
    }
}

// Main class
public class ResumeScreening {
    public static void main(String[] args) {
        List<JobRole> jobRoles = new ArrayList<>();
        jobRoles.add(new SoftwareEngineer());
        jobRoles.add(new DataScientist());

        Resume.processAllResumes(jobRoles);
    }
}




