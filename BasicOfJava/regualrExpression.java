class refEx{
    public static void main(String[] args){
        //All of them return boolean
        // . means any character but single char only
        // [abc] Exactly given char abc . one of a b or c and only sigle char string can be checked
        //[abc][vz] Either first or second set
        //[^abc] except abc
        // [a-z1-7] a-z or 1-7
        //A|B A or B
        // XZ exactly XZ
        String str1 = "z";
        System.out.println(str1.matches(".")); //gives true
        System.out.println(str1.matches("[abc]")); // gives false
        System.out.println(str1.matches("[^abc]")); //true
        System.out.println(str1.matches("[a-z0-9]"));

        

    }
}