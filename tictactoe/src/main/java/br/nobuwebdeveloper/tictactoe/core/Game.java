package br.nobuwebdeveloper.tictactoe.core;

import br.nobuwebdeveloper.tictactoe.Constants;
import br.nobuwebdeveloper.tictactoe.UI;

public class Game {

	private Board board = new Board();
	private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];

	public void play() {

		UI.printGameTitle();

		board.clear();
		board.print();

		// UI.readInput("Nome do Jogador:");
	}
}
