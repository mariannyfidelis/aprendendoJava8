package aprendendojava8;

import java.time.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TestandoDatas {

    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        
        LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);
        System.out.println(data);
        
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd / MM / yyyy");
        
        System.out.println(data.format(formatador));
        System.out.println(hoje.format(formatador));
        System.out.println(Period.between(data, hoje));  
    }
}
