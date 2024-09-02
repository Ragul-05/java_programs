
import java.util.*;
public class anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] ch = a.toCharArray();
        char[] ch1= b.toCharArray();
        
        Arrays.sort(ch);
        Arrays.sort(ch1);
        
        for(int i = 0;i<ch.length-1;i++){
            if(ch[i]==ch1[i]){
                continue;
            }
            else{
                return false;
            }
              
        }
        return true; 
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}