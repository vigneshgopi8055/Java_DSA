package src;
 public class Swap_nums {
        int a;
        int b;

         protected Swap_nums(int a , int b){
            this.a = a;
            this.b = b;
        }
         Swap_nums(){

        }
        public void Swap(int a , int b){
             int temp = a;
             a = b;
             b = temp;
        }

}
