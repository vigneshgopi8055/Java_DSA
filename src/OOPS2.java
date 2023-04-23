package src;
//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
// First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle.
// Length and breadth of rectangle are entered through keyboard.
public class OOPS2 {
    public static void main(String[] args) {
        Area dimensions = new Area();
        dimensions.length = 5;
        dimensions.breadth = 6;
        dimensions.getArea();
        Area input = new Area(6,7);
        input.getArea();
    }
    static class Area{
        int length;
        int breadth;
         Area(int l , int b){
            this.length = l;
            this.breadth = b;
        }
        Area(){

        }
        void getArea(){
            System.out.println(length*breadth);
        }
    }
}
