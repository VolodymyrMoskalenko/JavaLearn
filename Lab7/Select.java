package lab07.example.select;

import lab07.example.strategies.SortStrategy;

public class Select {

    public void processSelect(SortStrategy strategy) {
        long[] arr = {11, 3, 14, 16, 7};
        strategy.printResults(arr);
    }

}
