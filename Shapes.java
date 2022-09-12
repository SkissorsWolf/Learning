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

/* class Circle extends Shape {
    int width;
    int y;
    void area(int y) {
        double area = Math.PI * (double) y * (double) y;
        System.out.println(area);
    }
} */


/* 

javac /tmp/JpOCIZ5PGc/Shapes.java
/tmp/JpOCIZ5PGc/Program.java:24: error: Square is not abstract and does not override abstract method area() in Shape
class Square extends Shape {
^
/tmp/JpOCIZ5PGc/Shapes.java:26: error: method does not override or implement a method from a supertype
    @Override public void area(int x) {
    ^
2 errors

*/
