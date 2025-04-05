class variableArgs{
    static void show(int...x){
        for(int a:x){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        show(arr);
    }
}