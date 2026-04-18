public class M11PrintPath {
    public static void printPath(int cur,int dest,String path){
        if(cur>dest){
            return ;
        }
        if(cur==dest){
            System.out.println(path);
        }
        printPath(cur+1, dest, path+'1');
        printPath(cur+2, dest, path+'2');
        printPath(cur+3, dest, path+'3');
        printPath(cur+4, dest, path+'4');
        printPath(cur+5, dest, path+'5');
        printPath(cur+6, dest, path+'6');
    }
    public static void main(String[] args) {
        printPath(3,9," ");
    }
}
