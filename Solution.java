import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    
    

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
         
         for (int i = 0; i < 10; i++){
            String s = reader.readLine();
            strings.add(i, s); 
             
            }
       
    
       
       for (int k = 0; k < strings.size();k++ ) {
             
            System.out.println(strings.get(k));
                    }
        
            
        
    
        }
       
}
