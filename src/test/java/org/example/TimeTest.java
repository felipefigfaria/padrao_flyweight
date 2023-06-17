package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void deveRetornarJogadores() {
        Time time = new Time();
        time.contratar("Vini Jr", "Ponta Esquerda", "Ataque");
        time.contratar("Rodrygo", "Ponta Direita", "Ataque");
        time.contratar("Benzema", "Centroavante", "Ataque");
        time.contratar("Alaba", "Zagueiro", "Defesa");

        List<String> saida = Arrays.asList(
                "Jogador{nome='Vini Jr', posicao='Ponta Esquerda', areaAtuacao='Ataque'}",
                "Jogador{nome='Rodrygo', posicao='Ponta Direita', areaAtuacao='Ataque'}",
                "Jogador{nome='Benzema', posicao='Centroavante', areaAtuacao='Ataque'}",
                "Jogador{nome='Alaba', posicao='Zagueiro', areaAtuacao='Defesa'}");

        assertEquals(saida, time.obterJogadores());
    }

    @Test
    void deveRetornarTotalPosicoes() {
        Time time = new Time();
        time.contratar("Vini Jr", "Ponta Esquerda", "Ataque");
        time.contratar("Rodrygo", "Ponta Direita", "Ataque");
        time.contratar("Benzema", "Centroavante", "Ataque");
        time.contratar("Alaba", "Zagueiro", "Defesa");

        assertEquals(4, PosicaoFactory.getTotalPosicoes());
    }
}