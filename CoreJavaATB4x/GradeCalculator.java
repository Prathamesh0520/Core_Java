public class GradeCalculator {
    public static void main(String[] args) {
        int marks = 80;
        if (marks>=90 && marks==100){
            System.out.println("You Achieved A Grade");
        } else if (marks>=80 && marks<90) {
            System.out.println("You Achieved B Grade");
        }else if (marks>=70 && marks<80) {
            System.out.println("You Achieved C Grade");
        }else if (marks>=60 && marks<70) {
            System.out.println("You Achieved D Grade");
        } else{
            System.out.println("You Achieved F Grade");
        }
    }
}
