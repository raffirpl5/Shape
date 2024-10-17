import java.util.Scanner;
    
    public class driverClass {
    
        public static void main(String[] args) {
            Shape shape = new Shape();
    
            Scanner input = new Scanner(System.in);
            System.out.println("Choose one : ");
            System.out.println("1. Rectangle \n2. Circle");
            String pilihan = input.nextLine();
            if (pilihan.equals("1")) {
                System.out.println("1. Rectangle\n2. Cube");
                String pilih = input.nextLine();
                if (pilih.equals("1")) {
                    // Rectangle rectangle = new Rectangle();
                    System.out.println("Rectangle details : ");
                    System.out.println("Legth : ");
                    int length = input.nextInt();
                    System.out.println("Width : ");
                    int width = input.nextInt();
                    Rectangle rectangle = new Rectangle("Rectangle", "red", length, width);
                } else if (pilih.equals("2")) {
                    // Cube cube = new Cube();
                    System.out.println("Cube details : ");
                    System.out.println("Legth : ");
                    int length = input.nextInt();
                    System.out.println("Width : ");
                    int width = input.nextInt();
                    System.out.println("Height : ");
                    int height = input.nextInt();
                    Cube cube = new Cube("Cube", "red", length, width, height);
                }
            } else if (pilihan.equals("2")) {
                Circle circle = new Circle();
                System.out.println("Circle details : ");
                System.out.println("Radius : ");
                int radius = input.nextInt();
                
                Circle cp = new Circle("Circle", "red", radius);

                circle.print();
                cp.print();
            }
    }
}

