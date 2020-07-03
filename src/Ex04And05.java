import java.util.Scanner;

public class Ex04And05 {

    //////////////////////////////////////Exercise 4 and 5//////////////////////////////////////

    public static void AreaAndperimeter (double side) {
        double area = side*side;
        double perimeter = side * 4;
        System.out.println("Area of square is: "+ area);
        System.out.println("Perimeter of square is: "+ perimeter);

    }





    //////////////////////////////////////MAIN///////////////////////////////////////////
    public static void main(String[] args) {
        AreaAndperimeter(7);
        AreaAndperimeter(5);
        AreaAndperimeter(3);

    }


}
