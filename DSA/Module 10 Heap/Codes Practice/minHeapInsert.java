
public class minHeapInsert{
    int arr[];
    int capacity;
    int size;
    minHeapInsert(int c){
        capacity=c;
        arr=new int[c];
        size=0;
    }
    int left(int i){
        return (2*i)+1;
    }
    int right(int i){
        return (2*i)+2;
    }
    int parent(int i){
        return (i-1)/2;
    }
    public void swap(int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
    }
    public void insert(int x){
        if(capacity==size){
            return;
        }
        size++;
        arr[size-1] = x;
        int i = size-1;
        //for max heap(parent(i)<i)
        while(i>0 && arr[parent(i)] > arr[i] ){
            swap( parent(i) , i );
            i = parent(i) ; 
        }
    }
    public int delete(){
        int del=arr[0];
        arr[0]=arr[size-1];
        size--;
        int i=0;
        while(i<(size-1)/2){
            if(arr[left(i)]<arr[i] || arr[right(i)]<arr[i]){
                int min=(arr[left(i)]<arr[right(i)])?left(i):right(i);
                swap(i, min);
            }
        }
        return del;
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        minHeapInsert m1=new minHeapInsert(100);
        m1.insert(40);
        m1.insert(20);
        m1.insert(30);
        m1.insert(35);
        m1.insert(25);
        m1.insert(80);
        m1.insert(32);
        m1.insert(100);
        m1.insert(70);
        m1.insert(60);
        m1.print();
        System.out.println(m1.delete());
        m1.print();
    }
}