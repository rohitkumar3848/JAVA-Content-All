class majorityElement {
    public static int majorityEle(int[] nums) {
        int maj_Count=1;
        int maj=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==maj){
                maj_Count++;
            }
            else{
                maj_Count--;
                if(maj_Count==0){
                    maj=nums[i];
                    maj_Count=1;
                }
            }
        }
        return maj;
    }
    public static void main(String[] args) {
        int arr[]={2,2,2,1,6,3,2,2,3,3,3};
        System.out.println(majorityEle(arr));
    }
}
