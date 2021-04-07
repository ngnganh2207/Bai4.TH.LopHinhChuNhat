import java.util.Scanner;

class Ex14_1 {
    public static void main(String[] args) {
        //code below here
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the width:");
        int width = scanner.nextInt();
        System.out.print("Enter the height:");
        int height = scanner.nextInt();
        Rectangle rectangle= new Rectangle(15,10);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
