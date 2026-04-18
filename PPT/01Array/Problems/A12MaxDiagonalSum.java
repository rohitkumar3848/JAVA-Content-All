class A12MaxDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int res=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
                res+=mat[i][i];
                res+=mat[n-i-1][i];
        }
        if(n%2!=0){
            res-=mat[n/2][n/2];
        }
        return res;
    }
    public static void main(String[] args) {
       int [][]mat = {{1,1,1,1},
              {1,1,1,1},
              {1,1,1,1},
              {1,1,1,1}};
              System.out.println(diagonalSum(mat));
    }
}