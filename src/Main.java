import java.lang.Math;

public class Main {
    public static void main(String[] args) {

    var testing =  new  Methods();
    
    //Q6 Q7
    testing.pizzazYo(7);
    testing.checkEvenOdd(9);
    testing.findTriangleArea(3, 6);
    testing.findParaArea(3, 6);
    testing.findTrapeArea(5, 9, 4);

        
    }
}


class Methods {
    //Q1
    public void pizzazYo(int num) {
        if (num % 7 == 0) {
            System.out.println("Pizzazz");
        }
        else {
            System.out.println(":-( A tragic number has been entered");

        }
    }

    //Q2
    public void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }

    //Q3
    public void findTriangleArea(double base, double height) {
        
        double area = 0.5 * base * height;

        System.out.println("The area of the triangle is " + area);
    }

    //Q4
    public void findParaArea(double base, double height) {
        double area = base * height;

        System.out.println("The area of the parallelogram is: " + area);
    }

     //Q5
    public void findTrapeArea(double a, double b, double height) {
        
        double area = (a * b)/2 * height;

        System.out.println("The area of the trapezium is " + area);
    }

    //Q8
    public double cylinderCSA(double radius, double height) {
        double CSA = 2 * Math.PI * radius * height;
        return CSA;
    }

     //Q9
    public double cylinderVolume(double radius, double height) {
        double volume = Math.PI * (radius * radius) * height;
        return volume;
    }

    //Q10
    public double coneCSA(double radius, double l) {
        double CSA = Math.PI * radius * l;
        return CSA;
    }

    public double coneVolume(double radius, double height) {
        double volume = Math.PI * (radius * radius) * height/3 ;
        return volume;
    }

    //Q11
    public double sphereSA(double radius) {
        double SA = 4 * Math.PI * (radius * radius);
        return SA;
    }

    public double sphereVolume(double radius) {
        double volume = 4/3 * Math.PI * (radius * radius * radius)  ;
        return volume;
    }

    //Q12

    public double degreeToRadian(double degrees) {
        double radians = degrees * (Math.PI / 180);
        return radians;
    }

    //Q13
    public double radianToDegree(double radians) {
        double degrees = radians * (180 / Math.PI);
        return degrees;
    }



    //Q14
    public double calHypotenuse(double a, double b) {
        double step = (a * a) + (b * b);

        double hypo = Math.sqrt(step);

        return hypo;
    }


}
