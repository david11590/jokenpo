package br.com.jokenpo.jokenpo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RequestInput {
    @JsonProperty("jogador")
    String player;
    @JsonProperty("jogada")
    String move;

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }
}
