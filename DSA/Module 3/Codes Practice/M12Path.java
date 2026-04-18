public class M12Path {
    public static void print(int cc,int cr,int dc,int dr,String res){
        if(cc>dc || cr>dr){
            return ;
        }
        if(cc==dc && cr==dr){
            System.out.println(res);
            return ;
        }
        print(cc+1, cr, dc, dr,res+'H');
        print(cc, cr+1, dc, dr,res+'V');
    }
    public static void main(String[] args) {
        print(0,0,2,2," ");
    }
}
