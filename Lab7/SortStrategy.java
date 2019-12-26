package lab07.example.strategies;

/**
 * Общий интерфейс всех стратегий.
 */
public interface SortStrategy {
    void printResults(long [] arr);
    long[] sortArray(long[] sourceArray);
}