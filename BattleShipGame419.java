import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//This is similar to leetcode 419 but slightly different
public class BattleShipGame419 {
    public static HashMap<Character,Integer> shipLength = new HashMap<>();

    public static void main(String[] args) {
        char[][] initialGrid = {
                {'.', 'A', 'B', 'B', 'B'},
                {'.', 'A', '.', '.', 'C'},
                {'.', '.', '.', '.', '.'},
                {'D', 'D', '.', '.', '.'},
                {'.', 'E', 'E', 'E', 'E'}
        };
        int[][] shots = {
                {0, 0}, {0, 1}, {0, 2}, {2, 3}, {3, 4}, {1, 3},{3, 4},{1, 4}
        };

        getShipLength(initialGrid);
        ArrayList<String> result = processShot(shots, initialGrid);
        for (String str: result) {
            System.out.println(str);
        }
    }
    public static ArrayList<String> processShot(int[][]shots, char[][]grid){
        ArrayList<String> result = new ArrayList<>();
        HashSet<String> alreadyAttacked = new HashSet<>();
        for (int[] shot: shots) {
            int row = shot[0];
            int col = shot[1];
            if(grid[row][col] == '.'){
                result.add("Missed");
            }else if(alreadyAttacked.contains(row+","+col)){
                result.add("Already attacked");
            } else {
                alreadyAttacked.add(row+","+col);
                int length = shipLength.get(grid[row][col]);
                shipLength.put(grid[row][col], --length);
                if (shipLength.get(grid[row][col]) <= 0){
                    result.add("Ship " + grid[row][col] + " sunk");
                }else{
                    result.add("Attacked ship" + grid[row][col]);
                }
            }
        }
        return result;
    }

    public static void getShipLength(char[][] grid) {
        //shipLength.put('.',0);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != '.') {
                    if (!shipLength.containsKey(grid[i][j])) {
                        shipLength.put(grid[i][j], 1);
                    } else {
                        int count = shipLength.get(grid[i][j]);
                        shipLength.put(grid[i][j], ++count);
                    }
                }
            }
        }
    }
}
