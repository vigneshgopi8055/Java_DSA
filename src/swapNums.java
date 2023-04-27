package src;
 public class swapNums {
        int a;
        int b;

         protected swapNums(int a , int b){
            this.a = a;
            this.b = b;
        }
         swapNums(){

        }
        public void Swap(int a , int b){
             int temp = a;
             a = b;
             b = temp;
        }

}
