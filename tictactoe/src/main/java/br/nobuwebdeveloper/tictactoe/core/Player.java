package br.nobuwebdeveloper.tictactoe.core;

import java.util.Scanner;

import br.nobuwebdeveloper.tictactoe.UI;

public class Player {

	private String name;
	private Board boad;
	private char symbol;
	Scanner scanner = new Scanner(System.in);

	public Player(String name, Board boad, char symbol) {
		this.name = name;
		this.boad = boad;
		this.symbol = symbol;
	}

	private Move inputMove() throws InvalidMoveException {
		String moveStr = UI.readInput("Jogador '" + name + "' =>");
		return new Move(moveStr);

	}

	public boolean play() throws InvalidMoveException {
		Move move = inputMove();
		return boad.play(this, move);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Board getBoad() {
		return boad;
	}

	public void setBoad(Board boad) {
		this.boad = boad;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
}
