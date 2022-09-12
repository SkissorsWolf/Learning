import java.util.Scanner;

public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square();
        // Circle b = new Circle(y);
        a.area(x);
        // b.area();
    }
}

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here
class Square extends Shape {
    int x;
    @Override public void area(int x) {
        int area = x * x;
        System.out.println(area);
    }
}

/* class Circle implements Shape {
    int width;
    int y;
    void area(int y) {
        double area = Math.PI * (double) y * (double) y;
        System.out.println(area);
    }
} */
