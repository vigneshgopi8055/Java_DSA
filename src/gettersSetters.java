package src;

public class gettersSetters {
    public static void main(String[] args) {
        Name name1 = new Name();
        name1.setName("harsha");
        System.out.println(name1.name);
    }
     static class Name{
        private String name = "vignesh";

        public String Getname(){
            return name;
        }
        public void setName(String naam){
            this.name = naam;
        }
    }
}
