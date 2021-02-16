def minimumSwaps(arr)
    min = 1
    swaps = 0

    arr.each.with_index do |el, idx|
        suposed_place = el - min
        unless (suposed_place == idx)
            while suposed_place != idx
                current_place = suposed_place
                suposed_place = arr[suposed_place] - min
                arr[current_place], arr[idx] = arr[idx], arr[current_place]
                swaps = swaps + 1
            end
        end
    end
    swaps
end