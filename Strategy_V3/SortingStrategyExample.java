package Strategy_V3;

public class SortingStrategyExample {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Sorter sorter2 = new Sorter();
        int[] array = {3,5,7,0,4};

        sorter.setSortingStrategy(new BubbleSort());
        sorter.performSort(array);

        sorter2.setSortingStrategy(new QuickSort());
        sorter2.performSort(array);


    }
}
