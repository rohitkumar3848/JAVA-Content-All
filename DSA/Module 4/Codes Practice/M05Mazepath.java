public class M05Mazepath {
    public static int mazePath(int maze[][],int n){
        if(maze[0][0]==-1 || maze[n-1][n-1]==-1){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(maze[i][0]==0){
                maze[i][0]=1;
            }
            else{
                break;
            }
        }
        for(int i=1;i<n;i++){
            if(maze[0][i]==0){
                maze[0][i]=1;
            }
            else{
                break;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(maze[i][j]==-1){
                    continue;
                }
                if(maze[i-1][j]>0){
                    maze[i][j]=maze[i][j]+maze[i-1][j];
                }
                if(maze[i][j-1]>0){
                    maze[i][j]=maze[i][j]+maze[i][j-1];
                }
            }
        }
        return maze[n-1][n-1];
    }
    public static void main(String[] args) {
        int arr[][]={{0,0,0,0},
        {0,-1,0,0},
        {-1,0,0,0},
        {0,0,0,0}
        };
        System.out.println("Total ways :"+mazePath(arr, arr.length));
        
    }
}
