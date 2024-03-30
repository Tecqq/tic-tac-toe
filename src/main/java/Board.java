import java.util.HashMap;
import java.util.Map;

public class Board {

    Map<Integer, Player> boardMap = new HashMap<>();
    Player turn = Player.X;

    public Map<Integer, Player> getBoardMap() {
        return boardMap;
    }

    public void setSlot(int slot, Player player) {
        boardMap.put(slot, player);
    }

    public Player getTurn() {
        return turn;
    }
    public void setTurn(Player player) {
        turn = player;
    }
    public void printBoard() {
        int size = 3;
        for (int i = 0; i < size * size; i++) {
            if (boardMap.get(i) == null) System.out.print("~" + " ");
            else System.out.print(boardMap.get(i) + " ");
            if ((i + 1) % size == 0) {
                System.out.println();
            }
        }
    }

}
