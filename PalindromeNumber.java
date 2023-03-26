public class PalindromeNumber {

        public static void main(String [] args) {
            System.out.println(isPalindrome(23));
        }

        public static String reverse(String s) {
            String r = "";
            char ch[]= s.toCharArray();  
            for(int i = ch.length-1; i>=0 ;i--){  
                r += ch[i];  
            }
    
            return r;
        }
        public static boolean isPalindrome(int x) {
    
            if (x < 0)
                return false;
            
            String sx = Integer.toString(x);
            String reversedSx = reverse(sx);
    
            if(sx.equals(reversedSx))
                return true;
    
            return false;
        }
}
