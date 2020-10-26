package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode749 {

}

class Solution749 {
    public int containVirus(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        List<List<Position>> listOfInfectedAreas = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++){
                if (grid[i][j] == 1) {
                    Position currPos = new Position(i,j);
                    mainLoop: for (List<Position> lp : listOfInfectedAreas) {
                        for (Position p : lp) {
                            if (p.isCloseTo(currPos)) {
                                lp.add(currPos);
                                break mainLoop;
                            }
                        }
                    }
                    List<Position> newArea = new ArrayList<>();
                    newArea.add(currPos);
                    listOfInfectedAreas.add(newArea);
                }
            }
        }

        return 0;
    }
    class Position {
        int row;
        int column;
        Position(int row, int column) {
            this.row = row;
            this.column = column;
        }
        boolean isCloseTo(Position p) {
            return Math.abs(this.row - p.row) <= 1 && Math.abs(this.column - p.column) <= 1;
        }
    }
}
