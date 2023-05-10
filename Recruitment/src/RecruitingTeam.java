import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecruitingTeam {
    private List<Candidate> candidates;

    public RecruitingTeam() {
    	
        candidates = new ArrayList<Candidate>();
    }
   
    public void conductInterview(Candidate candidate) {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(candidate.getDateOfBirth(), currentDate);
        int years = age.getYears();
        int month=candidate.getDateOfBirth().getMonthValue();
        String nationality=candidate.getNationality();
        boolean fullTime=candidate.isFullTime();
         if(fullTime==true&&nationality.equals("Indian")) {
        	 
         
        if (years < 18) {
            System.out.println(candidate.getName() + " is not selected - under 18 years old.");
        } 
        else if (month>7) {
        	
        	int percentPass=0;
        	if(years >= 18 && years <= 23) {
            if(candidate.getHscMarksPhysics()>=60 && candidate.getHscMarksChemistry() >=60 &&
                    candidate.getHscMarksMathematics()>=60 && candidate.getHscMarksBiology()>=60) {
            	percentPass=1;
            }
            
            else {percentPass=0;}
            if (percentPass == 1 && candidate.getUgCGPA() >= 8.0 && candidate.getInterviewMarks()>=35 &&candidate.getPgCGPA() >= 8.0 && candidate.getNumProjects() >= 2) {
                System.out.println(candidate.getName() + " is selected!");
        
            } else {
                System.out.println(candidate.getName() + " is not selected.");
            }
            
            }
        	else{System.out.println(candidate.getName() + " is not selected - should born after July 1999.");}
        } 
        else {
            System.out.println(candidate.getName() + " is not selected - should born after after July 1999.");
        }
        
         }
         else {System.out.println("not eligible since not fulltime or nationality is not India");}
        
    }
}

