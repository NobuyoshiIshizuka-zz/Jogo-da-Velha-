package br.nobuwebdeveloper.tictactoe.core;

import br.nobuwebdeveloper.tictactoe.Constants;
import br.nobuwebdeveloper.tictactoe.UI;

public class Game {

	Board board = new Board();
	Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	public void play() {
		
		UI.printGameTitle();
		
		UI.readInput("Nome do Jogador:");
	}
}
