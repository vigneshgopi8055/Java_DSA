package src;

public class Getters_Setters {
    public static void main(String[] args) {
        Name name1 = new Name();
        name1.setName("harsha");
        System.out.println(name1.name);
    }
    private static class Name{
        String name = "vignesh";

        public String Getname(){
            return name;
        }
        public void setName(String naam){
            this.name = naam;
        }
    }
}
