package exercises;
import java.util.Scanner;

public class AreaOfARectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of your rectangle?");
        Double rectangleLength = input.nextDouble();

        System.out.println("What is the width of your rectangle?");
        Double rectangleWidth = input.nextDouble();

        double rectangleArea = rectangleLength * rectangleWidth;
        System.out.println("Your rectangle has an area of " + rectangleArea);

    }
}
