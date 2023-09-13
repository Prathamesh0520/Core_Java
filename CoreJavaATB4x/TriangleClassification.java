public class TriangleClassification {
    public static void main(String[] args) {
        int side1=5, side2=10, side3=19;

        if (side1==side2 && side2==side3){
            System.out.println("This is Equilateral Tringle");
        } else if (side1==side2 || side2==side3 || side1==side3) {
            System.out.println("This is Isosceles Triangle");
        } else {
            System.out.println("This is Scalene Triangle");
        }
    }
}
