import java.util.Map;

public class Winner {

    public static WinCause determineWinner(Board board) {
        Map<Integer, Player> boardMap = board.getBoardMap();

        int[][] winningConditions = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
                {0, 4, 8}, {2, 4, 6}
        };
        for (int[] condition : winningConditions) {
            if (boardMap.get(condition[0]) != null) {
                if (boardMap.get(condition[0]) == boardMap.get(condition[1]) &&
                        boardMap.get(condition[1]) == boardMap.get(condition[2])) {
                    return WinCause.getCause(String.valueOf(boardMap.get(condition[0])));
                }
            }
        }
        if (boardMap.size() == 9) {
            return WinCause.DRAW;
        }

        return WinCause.NO_WIN;
    }
}
