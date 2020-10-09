package LeetCode.剑指offer;

/**
 * @author: Li jx
 * @date: 2019/12/3 20:50
 * @description:
 */
public class Home {

    public void getMaxPath(int[][] A){
        int rowA = A.length;
        int columnA = A[0].length;
        int[][] changeA = new int[rowA+1][columnA+1];
        int[][] maxA = new int[rowA+1][columnA+1];
        for(int i = 0;i < rowA;i++){
            System.arraycopy(A[i], 0, changeA[i + 1], 1, columnA);
        }
        for(int i = 1;i <= rowA;i++){
            for(int j = 1; j <= columnA;j++){
                if(maxA[i-1][j] >= maxA[i][j-1]) {
                    maxA[i][j] = maxA[i-1][j] + changeA[i][j];
                } else {
                    maxA[i][j] = maxA[i][j-1] + changeA[i][j];
                }
            }
        }

        System.out.println("最大硬币数：");
        for(int i = 1;i <= rowA;i++){
            for(int j = 1;j <= columnA;j++) {
                System.out.print(maxA[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Home test = new Home();
        int[][] A ={{0,0,0,0,1,0},
                {0,1,0,1,0,0},
                {0,0,0,1,0,1},
                {0,0,1,0,0,1},
                {1,0,0,0,1,0}};
        test.getMaxPath(A);
    }
}
