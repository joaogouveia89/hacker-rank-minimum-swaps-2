fun minimumSwaps(arr: Array<Int>): Int {
    var min = 1
    var swaps = 0
    var supposedPlace = 0
    var currentPlace = 0
    
    for(i in arr.indices){
        supposedPlace = arr[i] - min
        if(supposedPlace == i) continue
        while(supposedPlace != i){
            currentPlace = supposedPlace
            supposedPlace = arr[supposedPlace] - min
            arr[i] = arr[currentPlace].also { arr[currentPlace] = arr[i] }
            swaps++
        }
    }
    
    return swaps
}