package leetcode.arrays.simple;

public class test1275 {
    public String tictactoe(int[][] moves) {
        int[][] num = new int[3][3];
        for (int i = 0; i < moves.length; i++) {
            if(i%2==0){
                num[moves[i][0]][moves[i][1]]=1;
                if((num[moves[i][0]][0]==1&&num[moves[i][0]][1]==1&&num[moves[i][0]][2]==1)||
                        (num[0][moves[i][1]]==1&&num[1][moves[i][1]]==1&&num[2][moves[i][1]]==1)){
                    return "A";
                }
            }else {
                num[moves[i][0]][moves[i][1]]=2;
                if((num[moves[i][0]][0]==2&&num[moves[i][0]][1]==2&&num[moves[i][0]][2]==2)||
                        (num[0][moves[i][1]]==2&&num[1][moves[i][1]]==2&&num[2][moves[i][1]]==2)){
                    return "B";
                }
            }
            if((num[0][0]==1&&num[1][1]==1&&num[2][2]==1)||(num[2][0]==1&&num[1][1]==1&&num[0][2]==1))
                return "A";
            else if((num[0][0]==2&&num[1][1]==2&&num[2][2]==2)||(num[2][0]==2&&num[1][1]==2&&num[0][2]==2))
                return "B";
        }
        for (int[] ints : num) {
            for (int anInt : ints) {
                if(anInt==0)
                    return "Pending";
            }
        }
        return "Draw";
    }
}
