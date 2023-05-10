import java.time.LocalDate;
import java.util.*;
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter candidate name: ");
                String name = scanner.nextLine();
                System.out.print("Enter candidate date of birth (yyyy-mm-dd): ");
                LocalDate dob = LocalDate.parse(scanner.nextLine());
                System.out.print("Enter candidate nationality: ");
                String nationality = scanner.nextLine();
                System.out.print("Enter if the candidate has studied fulltime (true/false): ");
                boolean fullTime = Boolean.parseBoolean(scanner.nextLine());
                System.out.print("Enter candidate's marks in Physics: ");
                int phyMarks = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter candidate's marks in Chemistry: ");
                int cheMarks = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter candidate's marks in Maths: ");
                int  mathMarks= Integer.parseInt(scanner.nextLine());
                System.out.print("Enter candidate's marks in Biology: ");
                int bioMarks = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter candidate's CGPA in Bachelor's degree: ");
                double cgpa = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter candidate's CGPA in Master's degree: ");
                double cgpaMasters = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter number of projects done: ");
                int projectsDone = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter the Interview marks: ");
                int interviewMarks = Integer.parseInt(scanner.nextLine());

                Candidate candidate = new Candidate(name, dob, nationality, fullTime, phyMarks, cheMarks,
                        mathMarks, bioMarks, cgpa, cgpaMasters, projectsDone, interviewMarks);

                RecruitingTeam team = new RecruitingTeam();
                team.conductInterview(candidate);

                scanner.close();
                
            

        

    }
}
