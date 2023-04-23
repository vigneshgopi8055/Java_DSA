package src;

//CLASSES AND OBJECTS
public class OOPS1 {
    public static void main(String[] args) {
        car car1 = new car();  //car()->constructor
        car1.name = "audi";    //car -> class
        car1.color = "black";  //name,price,color -> properties of class
        car1.price = 4000000;  //car1,car2->objects of class
        car car2 = new car();
        car2.name = "benz";
        car2.color = "red";
        car2.price = 5000000;
        car1.printPrice();
        car2.printName();
        car1.Printcolor();
        System.out.println(car1);
        car1.ChangeName("bmw");
        car1.printName();
        car car3 = new car("benz","black",600000);
        car3.Printcolor();
    }
    static class car{
        String name;
        String color;
        int price;

        void printName(){
            System.out.println(this.name);
        }
        void printPrice(){
            System.out.println(this.price);
        }
        void Printcolor(){
            System.out.println(this.color);
        }
        void ChangeName(String newname){
             this.name = newname;
        }
         car(String brand ,  String colour , int on_road){
            this.name = brand;
            this.color = colour;
            this.price = on_road;
        }
        car(){

        }
    }
}
