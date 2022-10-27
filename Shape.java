com.javapro;
import java.util.Scanner;
class Shape {
    int b, h, s;
    double r;

    //triangle method
    void area(int base, int height) {
        int triArea = (base * height)/2;
        System.out.println("Area of Triangle = " + triArea);
    }

    //square method
    void area(int side) {
        int sqrArea = side * side;
        System.out.println("Area of Square = " + sqrArea);
    }

    //circle method
    void area(double radius) {
        double cirArea = Math.PI * radius * radius;
        System.out.println("Area of circle = " + cirArea);
    }
}

public class Area {
    public static void main(String[] args) {
        class Triangle extends Shape{
            void takeInput(){
                Scanner cin = new Scanner(System.in);
                System.out.println("Enter base of Triangle: ");
                this.b = cin.nextInt();

                System.out.println("Enter height of Triangle: ");
                this.h = cin.nextInt();
                area(b, h);
            }
        }

        class Square extends Shape{
            void takeInput(){
                Scanner cin = new Scanner(System.in);
                System.out.println("Enter side of Square: ");
                this.s = cin.nextInt();
                area(s);
            }
        }

        class Circle extends Shape{
            void takeInput(){
                Scanner cin = new Scanner(System.in);
                System.out.print("Enter radius of Circle: ");
                this.r = cin.nextDouble();
                area(r);
            }
        }
    }
}