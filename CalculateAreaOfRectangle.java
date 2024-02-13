//task-1 : create a java program that calculates the area fo a rectangle.

import java.util.Scanner;

public class CalculateAreaOfRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Rectangle Length : ");

        double length = sc.nextDouble();

        System.out.print("Enter the Rectangle width : ");

        double width = sc.nextDouble();

        // calculate the area of rectangle

        double area = length * width;

        // display the calculated area

        System.out.println("The area of rectangle is: " + area);

        sc.close();
    }

}