package src;

public class Abstract_class {
    public static void main(String[] args) {
        son Son1 = new son();
        Son1.salary(50);
        Son1.career("engineer");
    }
    public abstract static class parent{
        abstract void career(String name);
        abstract void salary(int num);
    }
    public static class son extends parent{

        @Override
        void career(String name) {
            System.out.println("i am an " + name);
        }

        @Override
        void salary(int num) {
            System.out.println("my package is " + num + "LPA");
        }
    }
}
