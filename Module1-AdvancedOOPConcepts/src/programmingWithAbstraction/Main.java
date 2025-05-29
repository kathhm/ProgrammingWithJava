package programmingWithAbstraction;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Calculating Area of Rectangle: ");
        System.out.print("Enter Width:");
        float w = keyBoard.nextFloat();
        System.out.print("Enter height: ");
        float h = keyBoard.nextFloat();
        keyBoard.nextLine();
        System.out.print("Enter line color: ");
        String color = keyBoard.nextLine();


        Rectangle rct = new Rectangle(w, h);
        rct.draw();
        rct.lineColor(color);
        System.out.println("Area: " + rct.calculateArea());
        System.out.println("Perimeter: "+ rct.calculatePerimeter());

        System.out.println("Calculating Area of Circle: ");
        System.out.print("Enter radius:");
        float r = keyBoard.nextFloat();
        keyBoard.nextLine();
        System.out.print("Enter line color: ");
        color = keyBoard.nextLine();

        Circle cr = new Circle(r);
        cr.draw();
        cr.lineColor(color);
        System.out.println("Area: "+cr.calculateArea());
        System.out.println("Perimeter: "+ cr.calculatePerimeter());
    }
}
