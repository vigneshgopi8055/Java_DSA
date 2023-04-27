package src;

public class Polymorphism {
    static public void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes triangle = new Triangle();
        shape.Area();
        circle.Area();
        square.Area();
        triangle.Area();
    }
    static class Shapes{
        void Area(){
            System.out.println("am in shapes");
        }
    }
    static class Circle extends Shapes{
        void Area(){
            System.out.println("pi * r * r");
        }
    }
    static class Square extends Shapes{
        void Area(){
            System.out.println("side * side");
        }
    }
    static class Triangle extends Shapes{
        void Area(){
            System.out.println("0.5 * base * height");
        }
    }
}
