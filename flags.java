public class flags{
    public static void main(String[] args){
        int a = 10;
        int b = -10;
        System.out.printf("%10d \n",a); // widht of 10 is given to 10
        System.out.printf("%010d \n",a); // the '0' flag fills the empty spaces with 0s  
        System.out.printf("%(d \n",b); // if the variable has a negative sign it will be displayed within a  bracket
        System.out.printf("%+d \n",b); // '+' shows the sign of the number 
    }
} 