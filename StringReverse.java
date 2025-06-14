public class StringReverse {
    public static void main(String[] args) {
        /*        
        String original = "Kunal Garg";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        */
        String original = "Kunal Garg";
        //Striing str2 = "";

        String[] start = original.split(" ");
        System.out.println(start[0]);
        System.out.println(start[1]);   
        for(String str : start) {
            String reversed = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }
            System.out.println("Original: " + str);
            System.out.println("Reversed: " + reversed);
    
        }
        for(int i = start.length - 1; i >= 0; i--) {
            String reversed = "";
            for (int j = start[i].length() - 1; j >= 0; j--) {
                reversed += start[i].charAt(j);
            }
            System.out.println("Original: " + start[i]);
            System.out.println("Reversed: " + reversed);
        }
    }

}
