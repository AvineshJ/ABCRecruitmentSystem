import java.time.LocalDate;

public class Candidate implements Comparable<Candidate> {
    private String name;
    private LocalDate dateOfBirth;
    private String nationality;
    private boolean isFullTime;
    private int hscMarksPhysics;
    private int hscMarksChemistry;
    private int hscMarksMathematics;
    private int hscMarksBiology;
    private double ugCGPA;
    private double pgCGPA;
    private int numProjects;
    private int interviewMarks;

    public Candidate(String name, LocalDate dateOfBirth, String nationality, boolean isFullTime, int hscMarksPhysics,
            int hscMarksChemistry, int hscMarksMathematics, int hscMarksBiology, double ugCGPA, double pgCGPA,
            int numProjects, int interviewMarks) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.isFullTime = isFullTime;
        this.hscMarksPhysics = hscMarksPhysics;
        this.hscMarksChemistry = hscMarksChemistry;
        this.hscMarksMathematics = hscMarksMathematics;
        this.hscMarksBiology = hscMarksBiology;
        this.ugCGPA = ugCGPA;
        this.pgCGPA = pgCGPA;
        this.numProjects = numProjects;
        this.interviewMarks = interviewMarks;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public int getHscMarksPhysics() {
        return hscMarksPhysics;
    }

    public int getHscMarksChemistry() {
        return hscMarksChemistry;
    }

    public int getHscMarksMathematics() {
        return hscMarksMathematics;
    }

    public int getHscMarksBiology() {
        return hscMarksBiology;
    }

    public double getUgCGPA() {
        return ugCGPA;
    }

    public double getPgCGPA() {
        return pgCGPA;
    }

    public int getNumProjects() {
        return numProjects;
    }

    public int getInterviewMarks() {
        return interviewMarks;
    }

    public void setInterviewMarks(int interviewMarks) {
        this.interviewMarks = interviewMarks;
    }

    @Override
    public int compareTo(Candidate candidate) {
        return this.getInterviewMarks() - candidate.getInterviewMarks();
    }
}
