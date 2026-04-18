public class M01GetWaysForTiles{
    public static int getwaysForTiles(int num){
        if(num<=3){
            return num;
        }
        else{
            return getwaysForTiles(num-1)+getwaysForTiles(num-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("The number of tiles can be placed for n=1 :"+getwaysForTiles(1));
        System.out.println("The number of tiles can be placed for n=2 :"+getwaysForTiles(2));
        System.out.println("The number of tiles can be placed for n=3 :"+getwaysForTiles(3));
        System.out.println("The number of tiles can be placed for n=4 :"+getwaysForTiles(4));
        System.out.println("The number of tiles can be placed for n=5 :"+getwaysForTiles(5));
    }
}