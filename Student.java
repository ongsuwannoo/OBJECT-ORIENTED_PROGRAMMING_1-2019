import java.util.*;
public class Student {
    public String name;
    public double midtermScroe;
    public double finalScore;

    double score;

    public void showGrade () {
        score = (this.midtermScroe*0.4) + (this.finalScore*0.4) + 20;
        System.out.println("------------------");
        char grade = 'E';
        if (score >= 80)
            grade = 'A';
        else if (score >= 70)
            grade = 'B';
        else if (score >= 60)
            grade = 'C';
        else if (score >= 50)
            grade = 'D';
        else if (score >= 0)
            grade = 'F';
        else
            System.out.println("Score Error");
        if (grade != 'E'){
            System.out.println("Student name : "+name);
            System.out.println("Score : "+score);
            System.out.println("Grade : "+grade);
        }
    }
    public static void main(String[] args) {

        Student s1 = new Student();

        Scanner input = new Scanner(System.in);

        System.out.print("Student 1 name = ");
        s1.name = input.nextLine();
        System.out.print("MidtermScroe = ");
        s1.midtermScroe = input.nextDouble();
        System.out.print("FinalScroe = ");
        s1.finalScore = input.nextDouble();
        s1.showGrade();
    }
}