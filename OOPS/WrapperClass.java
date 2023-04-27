package src;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 45;  //primitive datatype
        Integer num = new Integer(45); // object
        System.out.println(num);

        //final -> we use final keyword because we cannot modify the variable
        final int example = 10;
        //example = 5; -> gives error
    }
    //diff b/w int and obj is , in int we do mot get in built functions but where as in object we get more functions
}
