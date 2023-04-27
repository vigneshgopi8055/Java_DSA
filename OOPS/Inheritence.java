package src;

public class Inheritence {
    public static void main(String[] args) {
        box b1 = new box(3,4,5);
        box b2 = new box(3);
        boxWeight b3 = new boxWeight(3,4,5,6);
    }
   public static class box{
        int length ;
        int breadth;
        int height;

        box(){
            this.length = -1;
            this.breadth = -1;
            this.height = -1;
        }
        //cube
        box(int side){
            this.length = side;
            this.breadth = side;
            this.height = side;
        }
        //cuboid
         box(int l,int b,int h){
            this.length = l;
            this.breadth = b;
            this.height = h;
        }
        //copying constructor
        box(box old){
            this.length = old.length;
            this.breadth = old.breadth;
            this.height = old.height;
        }
        public void PrintArea(){
            System.out.println("the area  is " + " "+length*breadth*height);
        }
    }
    public static class boxWeight extends box{
        int weight;
        boxWeight(){
            this.weight = -1;
        }
        boxWeight(int length , int breadth , int height ,int weight){
            super(length,breadth,height); //calls the parent class constructor.used to initialize values in parent class
            this.weight = weight;
        }
    }
}
