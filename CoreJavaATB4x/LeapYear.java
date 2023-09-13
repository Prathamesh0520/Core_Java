public class LeapYear {
    public static void main(String[] args) {
        int year=2025;
        boolean isLeapYear= false;

        if ((year%4==0 && year%100!=0)||(year%400==0)){
             isLeapYear=true;
        }
        if (isLeapYear){
            System.out.println(year+ " is a Leap Year");
        }else {
            System.out.println(year+" is not a Leap Year");
        }
    }
}
