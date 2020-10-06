/*52.	Input name of a person and count how many vowels it contains. 
 Use String class functions.  */
public class Q52 { 
         
   
    static boolean isVowel(char ch) 
    { 
        ch = Character.toUpperCase(ch); 
        return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'); 
    } 
       
  
    static int countVowels(String str) 
    { 
        int count = 0; 
        for (int i = 0; i < str.length(); i++) 
            if (isVowel(str.charAt(i))) 
                ++count; 
        return count; 
    } 
       
    
    public static void main(String args[]) 
    { 
       
        String str = "abc de"; 
       
         
        System.out.println(countVowels(str)); 
    } 
} 
