public class MinimumSwipes2{
    static int minimumSwaps(int[] arr) {

        int min = 1;
        int swaps = 0;
        int supposedPlace;
        int currentPlace;
        int temp;
        
        for(int i = 0; i < arr.length; i++){
            supposedPlace = arr[i] - min;
            if(supposedPlace != i){
               while(supposedPlace != i){
                    currentPlace = supposedPlace;
                    supposedPlace = arr[supposedPlace] - min;
                    temp = arr[currentPlace];
                    arr[currentPlace] = arr[i];
                    arr[i] = temp;
                    swaps++;
               }
            }    
        }
        return swaps;
    }
}