// In a program, input the side of a square. You have to output the area of the square

import java.util.*;

public class areaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side of square");
        float side = sc.nextInt();
        double area  =  side*side;

        System.out.println("area of the square is: "+ area);
    }
}
