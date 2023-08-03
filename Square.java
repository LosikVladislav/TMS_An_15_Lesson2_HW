import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a figure + \n 1. Square  \n 2. Rectangle \n 3. Circle" );
        int nameFig = in.nextInt();
        switch (nameFig){
            case(1):
                System.out.println("Enter the length of the side of the square");
                int sideSq = in.nextInt();
                int areaS = sideSq * sideSq;
                System.out.print("Area of the square = " + areaS);
                break;
            case(2):
                System.out.println("Enter the length of the side of the rectangle");
                int lenRec = in.nextInt();
                System.out.println("Enter the width of the side of the rectangle");
                int widthRec = in.nextInt();
                int areaR = widthRec * lenRec;
                System.out.print("Area of the rectangle = " + areaR);
                break;
            case(3):
                System.out.print("Enter the radius of the circle");
                int radCir = in.nextInt();
                double pi = 3.14;
                double areaC = radCir*radCir*pi;
                System.out.print("Area of the circle = " + areaC);
                break;
        }
    }
}
