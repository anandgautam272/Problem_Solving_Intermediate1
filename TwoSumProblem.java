import java.util.HashMap;

public class TwoSumProblem {
    public static void main(String[] args) {
        int [] arr = {2,5,4,8,3,1};
        int target = 13;
        int ans [] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
             int secondNum = target-arr[i];
             if(map.containsKey(secondNum)){
                 ans[0] = map.get(secondNum);
                 ans[1] = i;
             } map.put(arr[i],i);
        }
        System.out.println(ans[0]+","+ans[1]);
    }
}
