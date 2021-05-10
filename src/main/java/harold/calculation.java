package harold;

import static java.lang.Integer.MIN_VALUE;

public class calculation {
    public static int findMax(int arr[]){
        int max=MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
}
