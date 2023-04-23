package src;

public class OOPS3 {
    public static void main(String[] args) {
        box2D box1 = new box2D(3,4);
        box3D box2 = new box3D(3,4,5);
        box2.PrintArea();
        box1.PrintArea();
    }
    public static class box2D{
        int length;
        int breadth;
        box2D(int length , int breadth){
            this.length = length;
            this.breadth = breadth;
        }
        box2D(){
        }
        void PrintArea(){
            System.out.println(this.length*this.breadth);
        }
    }
    public static class box3D extends box2D{
        int height;
        box3D(int length ,int breadth , int height){
            super(length,breadth);
            this.height = height;
        }
        void PrintArea(){
            System.out.println(this.length*this.breadth*this.height);
        }
    }
}
