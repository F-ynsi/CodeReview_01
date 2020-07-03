public class Ex03And05 {
    //////////////////////////////////////Exercise 03 and 05//////////////////////////////////////

    public static double calculateRectArea (double length, double width) {
        double area = length * width;
        return area;
    }





    ///////////////////////////////////////////MAIN////////////////////////////////////////
    public static void main(String[] args) {
        calculateRectArea(40,50);
        double areaOne = calculateRectArea(40,50);
        double areaTwo = calculateRectArea(20,30);
        double areaThree = calculateRectArea(30,60);
        System.out.println("The area one is " + areaOne);
        System.out.println("The area two is " + areaTwo);
        System.out.println("The area three is " + areaThree);


    }
}
