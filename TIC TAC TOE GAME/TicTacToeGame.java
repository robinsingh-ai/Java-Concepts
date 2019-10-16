//A simple tic tac toe game using notepad,cmd and jdk 1.6
//*******************************************************
import java.util.Arrays;
import java.util.Scanner;



public class TicTacToeGame {
	static int counter=0;
	static Scanner in;
	static String[] board;
	static String turn;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		board = new String[9];
		turn = "X";
		
		String winner = null;
		populateEmptyBoard();

		System.out.println("Welcome To Tic Tac Toe.");
		System.out.println("************************************");
		printBoard();
		System.out.println("Player X will play first,Enter a slot number to place X in:");

		while (winner == null) {
			int numInput;
			
				numInput = in.nextInt();
				if (!(numInput > 0 && numInput <= 9)) {
					System.out.println("Invalid input;entre slot number again:");
					continue;				
			}
			if (board[numInput-1].equals(String.valueOf(numInput))) {
				board[numInput-1] = turn;
				if (turn.equals("X")) {
					turn = "O";
				} else {
					turn = "X";
				}
				printBoard();
				winner = checkWinner();
			} else {
				System.out.println("Slot has been already taken;entre slot number again:");
				continue;
			}
		}
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("It's a TIE! Thanks for playing TIC TAC TOE.");
		} else {
			System.out.println("Congratulations!!! " + winner + "'s have won the game! Thanks for playing TIC TAC TOE.");
		}
	}

	static String checkWinner() {

		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
			}
			counter++;
			if (counter==9)
			{return "draw";}

		

		System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}

	static void printBoard() {
		System.out.println("//---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("//---|---|---\\");
	}

	static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
	}
}
