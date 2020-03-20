package Tema_Desafio04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {

   public Evento() {
            }

    public void agora (){
        String dataFormatada = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSS"));
        System.out.println("["+dataFormatada+"]");
    }
}

