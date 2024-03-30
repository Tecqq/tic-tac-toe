import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Player turn = board.getTurn();
            System.out.println(turn + "'s turn");
            board.printBoard();
            int selection = scanner.nextInt() - 1;
            if (selection > 8) {
                System.out.println("Select a slot 1-9");
                continue;
            }
            if (board.getBoardMap().containsKey(selection)) {
                System.out.println("Select a slot that isnt already taken");
                continue;
            }
            board.setSlot(selection, turn);
            if (turn.equals(Player.X)) board.setTurn(Player.O);
            else board.setTurn(Player.X);

            switch (Winner.determineWinner(board)) {
                case X -> System.out.println("X has won the game!");
                case O -> System.out.println("O has won the game!");
                case DRAW -> System.out.println("The match has ended in a draw");
            }
        }
    }
}
