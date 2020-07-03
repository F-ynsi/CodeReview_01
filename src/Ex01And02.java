import java.util.Scanner;
public class Ex01And02 {
    //////////////////////////////////////1 and 2/////////////////////////////////////////////

    public static void myRectangle () {
        double length = 5.0;
        double width = 3.0;
        System.out.println("Area of rectangle is: " + length * width + ".");
    }
    /////////////////////////////////////OR//////////////////////////////////////////////////

    public static void rArea () {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length");
        double length = in.nextDouble();
        System.out.println("Enter the width");
        double width = in.nextDouble();
        double area = length * width;
        System.out.println("Area of rectangle is: " + area);

    }



    ///////////////////////////////////////MAIN/////////////////////////////////////////////
    public static void main(String[] args) {
        myRectangle();
    }
}
