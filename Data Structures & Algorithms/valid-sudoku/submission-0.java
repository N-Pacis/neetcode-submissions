class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> row = new HashMap<>();
        Map<Integer, Set<Integer>> col = new HashMap<>();
        Map<Integer, Set<Integer>> square = new HashMap<>();

       for(int i=0; i<9; i++){
        for(int j=0; j<9; j++){
            if(board[i][j] != '.'){
                int num = (board[i][j] - '0');
                int box = ((i / 3) * 3) + (j / 3);

                if(!row.containsKey(i)){
                    row.put(i, new HashSet<>());
                }
                if(!col.containsKey(j)){
                    col.put(j, new HashSet<>());
                }
                if(!square.containsKey(box)){
                    square.put(box, new HashSet<>());

                }

                if(row.get(i).contains(num)) return false;
                if(col.get(j).contains(num)) return false;
                if(square.get(box).contains(num)) return false;
                
                row.get(i).add(num);
                col.get(j).add(num);
                square.get(box).add(num);
            }
        }
       } 

       return true;
    }
}
