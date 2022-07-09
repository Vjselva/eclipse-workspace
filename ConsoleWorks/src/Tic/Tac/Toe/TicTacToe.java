package Tic.Tac.Toe;

import java.util.Scanner;

class Game {
	static String board[][] = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
	static String player1, player2;

	void start() {
		char ch;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Player-X Name ");
			player1 = sc.nextLine();
			System.out.print("Enter Player-O Name ");
			player2 = sc.nextLine();
			display();
			play();
			System.out.print("\n If you want to Play Again Press Y");
			ch = sc.next().charAt(0);

		} while (ch == 'Y');
	}

	void display() {
		System.out.println("\n Tic Tac Toe BOARD \n");
		System.out.println("|---|---|---|");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("| " + board[i][j] + " ");
			}
			System.out.print("|\n------------\n");

		}

	}

	void play() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--Choose your character X or O--");
		boolean win = false;
		for (int i = 0; i < 9; i++) {

			if (i % 2 == 0) {
				System.out.println("\nIts X turn");
				String Xvalue = sc.nextLine();
				if (chageBoardValue(Xvalue, "X")) {
					if (checkWinnners("X")) {
						System.out.println("\n*** " + player1 + "-X Wins ***\n");
						win = true;
						break;
					}
				} else {
					i--;
				}
			} else {
				System.out.println("\nIts O turn");
				String Xvalue = sc.nextLine();
				if (chageBoardValue(Xvalue, "O")) {
					if (checkWinnners("O")) {

						System.out.println("\n*** " + player2 + "-sO Wins ***\n");
						win = true;
						break;

					}
				} else {
					i--;
				}
			}
			display();

		}
		if (!win) {
			System.out.println("\n ____  MATCH DRAW ____");
		}

	}

	boolean checkWinnners(String player) {
		player = player + player + player;
		if ((board[0][0] + board[0][1] + board[0][2]).equals(player)
				|| (board[1][0] + board[1][1] + board[1][2]).equals(player)
				|| (board[2][0] + board[2][1] + board[2][2]).equals(player)
				|| (board[0][0] + board[1][0] + board[2][0]).equals(player)
				|| (board[0][1] + board[1][1] + board[2][1]).equals(player)
				|| (board[0][2] + board[1][2] + board[2][2]).equals(player)
				|| (board[0][0] + board[1][1] + board[2][2]).equals(player)
				|| (board[2][0] + board[1][1] + board[0][2]).equals(player))

		{
			return true;
		}
		return false;

	}

	boolean chageBoardValue(String value, String player) {
		boolean flag = false;
		outerloop: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (value.equals(board[i][j])) {
					board[i][j] = player;
					flag = true;
					break outerloop;
				}
			}

		}
		if (!flag) {
			System.out.println("---Its Not Valid Please choose another---");
		}
		return flag;
	}
}

public class TicTacToe {
	public static void main(String[] args) {
		new Game().start();

	}

}
