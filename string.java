public class StringExample {
    public static void main(String[] args) {
        char c[] = {'H' , 'E', 'L', 'L', 'O'};
        String str4 = new String(c);
        System.out.println(str4);
        
        String str1 = new String("java"); // Creates a new String object in the heap, but "java" is already present in the string pool.
        String str2 = new String("java"); // Creates another new String object in the heap, separate from str1.
        String str3 = new String("java"); // Creates yet another new String object in the heap.

        // Even though "java" exists in the string pool, str1, str2, and str3 are all separate objects in heap memory.
        // They do not share the same object reference.
        // However, all of them reference the same character sequence "java" internally.

        // If we used String literals like:
        // String str5 = "java";
        // String str6 = "java";
        // Then str5 == str6 would be true because both would reference the same object in the string pool.
    }
}

