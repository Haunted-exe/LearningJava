public class writingMethods{
    static int sum(int a , int b){   // Here in order to make this function available to the static main function we need to make the sum function static too
        return a + b;
    }
    public static void main(String[] args){
       int ans = sum(10,10);
       System.out.print(ans);
    }
}
// Static methods can call only other static methods
//Another way the main method can call a non static method is by creating an object from our class and then calling the methods on that object