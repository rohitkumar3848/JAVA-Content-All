public class M10ValidParanthesis {
    public static void ValPar(int n,int oc,int cc,String  ans){
        if(n==oc && cc==n){
            System.out.println(ans);
            return ;
        }
        if(oc<n){
            ValPar(n, oc+1, cc, ans+'(');
        }
        if(oc>cc){
            ValPar(n, oc, cc+1, ans+')');
        }
    }
    public static void main(String[] args) {
        ValPar(4,0,0," ");
    }
}
