import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.lang.*;
public class M01FractionalKnapsack
{
    private static double getMaxValue(ItemValue[] arr,int capacity){
       Arrays.sort(arr, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue item1,
                               ItemValue item2)
            {
                double cpr1 = Double.valueOf(item1.profit/item1.weight);
                double cpr2 = Double.valueOf(item2.profit/item2.weight);
     
                if (cpr1 < cpr2)
                    return 1;
                else
                    return -1;
            }
        });
        double maxprofit=0;
        for (ItemValue i : arr) {
            int curWt = (int)i.weight;
            int curProfit = (int)i.profit;
            if(capacity-curWt>=0){
                capacity = capacity - curWt;
                maxprofit += curProfit;
            }
            else{
                double fraction= ((double)capacity / (double)curWt);
                maxprofit += (curProfit * fraction);
                capacity= (int)(capacity - (curWt * fraction));
                break;
            }
        }
        return maxprofit;
    }
    static class ItemValue{
        int weight;
        int profit;
        public ItemValue(int p,int w){
            this.weight=w;
            this.profit=p;
        }
    }
    public static void main(String[] args) {
        ItemValue[] arr = { new ItemValue(25, 5),
            new ItemValue(75, 10),
            new ItemValue(100, 12),
            new ItemValue(50, 4),
            new ItemValue(45, 7),
            new ItemValue(90, 9),
            new ItemValue(30, 3)
        };

        int capacity = 37;
        double maxValue = getMaxValue(arr, capacity);
        System.out.println("Maximum Profit is: "+maxValue);
    }
}