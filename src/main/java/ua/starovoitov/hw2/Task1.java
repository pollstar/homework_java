package ua.starovoitov.hw2;

public class Task1 {
    public static void main(String[] args) {
        int x1 = 5, y1 = 10;
        int x2 = 8, y2 = 15;
        int x3 = -5, y3 = 1;

        System.out.println("area of a triangle with coordinates: ");
        System.out.println("x1="+x1 + " y1="+ y1 +" x2="+x2 + " y2="+ y2 +" x3="+x3 + " y3="+ y3);
        System.out.println("Equal: "+ areaTriangle(x1,y1,x2,y2,x3,y3));

        x1 = 135; y1 = -234;
        x2 = 75; y2 = 0;
        x3 = -345; y3 = 134;

        System.out.println("area of a triangle with coordinates: ");
        System.out.println("x1="+x1 + " y1="+ y1 +" x2="+x2 + " y2="+ y2 +" x3="+x3 + " y3="+ y3);
        System.out.println("Equal: "+ areaTriangle(x1,y1,x2,y2,x3,y3));
    }

    public static double areaTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double c = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
