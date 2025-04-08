// In java two or more funcitions can hvae the same name if they the parameters of the functions are different (in data types or in number)
class methodOverloadingInJava{
   static int max(int a , int b){
    return Math.max(a,b);
   }
   static int max(int a , int b ,int c){
    return Math.max(a,Math.max(b,c));
   }
   static float max(float a ,float b){
    return Math.max(a ,b);
   }
    public static void main(String[] args) {
       System.out.println(max(20,50));  
       System.out.println(max(20,50 , 100));
       System.out.println(max(20.1f,50.1f));    
    } 
}