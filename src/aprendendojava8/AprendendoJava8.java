package aprendendojava8;

import java.util.ArrayList;
import java.util.List;


public class AprendendoJava8 {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("olá");
        lista.add("olá1");
        lista.add("olá2");
        lista.add("JAVA8");
        lista.add("vamos começar !");
        
        
        lista.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
                
        lista.forEach(s -> System.err.println(s));
            
        }
 
     
}
