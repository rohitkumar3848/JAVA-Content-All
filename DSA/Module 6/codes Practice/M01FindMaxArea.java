
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class M01FindMaxArea {
        public static ArrayList nextSmallEle(int [] price,int n){
            Stack<Integer> st=new Stack<>();
            ArrayList<Integer> a1=new ArrayList<>();
            st.push(-1);
            for(int i=n-1;i>=0;i--){
                int cur=price[i];
                while(st.peek()!=-1 && price[st.peek()]>=cur){
                    st.pop();
                }
                a1.add(st.peek());
                st.push(i);
            }
            Collections.reverse(a1);
            return a1;
            //System.out.println(a1);
        }
        public static ArrayList prevSmallEle(int []price,int n){
            Stack<Integer> st=new Stack<>();
            ArrayList<Integer> a1=new ArrayList<>();
            st.push(-1);
            for(int i=0;i<=n-1;i++){
                int cur=price[i];
                while(st.peek()!=-1 && price[st.peek()]>=cur){
                    st.pop();
                }
                a1.add(st.peek());
                st.push(i);
            }
            //Collections.reverse(a1);
            return a1;
            //System.out.println(a1);
        }
        public static int maxArea(int []heights, int n){
            //int n=heights.length;
            ArrayList<Integer> prev=new ArrayList<>(n);
            prev=prevSmallEle(heights, n);

            ArrayList<Integer> next=new ArrayList<>(n);
            next=nextSmallEle(heights, n);

            int area=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
               int l=heights[i];
               int x=next.get(i);
               if(x==-1){
                    x=n;
               }
               int b=x-prev.get(i)-1;
               int Newarea=l*b;
               area=(Newarea>area)?Newarea:area;
            }
            //System.out.println("Maximum Area is :"+area);
            return area;
        }
        public static void maxRecArea(int [][]arr,int n,int m){
            int area=maxArea(arr[0],m);
            for(int i=1;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j]!=0){
                        arr[i][j]=arr[i][j]+arr[i-1][j];
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
                //int newArea=area;
                area=(area>maxArea(arr[i], n))?area:maxArea(arr[i], n);
            }
            System.out.println("Max Area of Rectangle is:"+area);
        }
        public static void main(String[] args) {
            //int heights[]={2,1,5,6,2,3};
            //int n=heights.length;
            //stockSpan(price,n);
            //stockSpan1(price, n);
            //maxArea(heights);
            //prevSmallEle(heights, n);
            int arr[][]={{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
            int n=4;
            int m=5;
            maxRecArea(arr, n, m);

    }
}
