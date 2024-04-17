package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void include(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto " +
                    " e preferido por todos");
        } else {
            System.out.println("Forever também é um dos que todo mundo está curtindo");
        }
    }

}
