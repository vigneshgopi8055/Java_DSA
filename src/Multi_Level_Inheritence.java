package src;

public class Multi_Level_Inheritence {
    public static void main(String[] args) {
        boxPrice box2 = new boxPrice(3,4,5,70,100);
        System.out.println(box2.price);
        boxWeight box1 = new boxWeight(6,4,5,80);
        System.out.println(box1.weight);
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
        box(Inheritence.box old){
            this.length = old.length;
            this.breadth = old.breadth;
            this.height = old.height;
        }
        public void PrintArea(){
            System.out.println("the area  is " + " "+length*breadth*height);
        }
    }
    public static class boxWeight extends Inheritence.box {
        int weight;

        boxWeight() {
            this.weight = -1;
        }

        boxWeight(int length, int breadth, int height, int weight) {
            super(length, breadth, height); //calls the parent class constructor.used to initialize values in parent class
            this.weight = weight;
        }
    }
    public static class boxPrice extends boxWeight{
        int price = 100;
        boxPrice(int length , int breadth , int height , int weight , int price){
            super(length,breadth,height,weight);
            this.price = price;
        }
    }
}
