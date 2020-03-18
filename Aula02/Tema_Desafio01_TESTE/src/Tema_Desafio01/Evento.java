package Tema_Desafio01;

import java.time.LocalDateTime;

public class Evento {

    private LocalDateTime dataHora;
    private String descricao;

    public Evento(LocalDateTime dataHora, String descricao) {
        this.dataHora = dataHora;
        this.descricao = descricao;
    }
}
