package lab07.example;

import lab07.example.select.Select;
import lab07.example.strategies.InsertionSort;
import lab07.example.strategies.BubbleSort;
import lab07.example.strategies.SelectionSort;
import lab07.example.strategies.SortStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Select select = new Select();
    private static SortStrategy strategy;

    public static void main(String[] args) throws IOException {

            if (strategy == null) {
                System.out.println("Please, select a sort method:" + "\n" +
                        "1 - Bubble Sort" + "\n" +
                        "2 - Insertion Sort" + "\n" +
                        "3 - Selection Sort" );
                String sortMethod = reader.readLine();

                if (sortMethod.equals("1")) {
                    strategy = new BubbleSort();
                } else if (sortMethod.equals("2")){
                    strategy = new InsertionSort();
                } else {
                    strategy = new SelectionSort();
                }

                select.processSelect(strategy);

//                System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
//                String proceed = reader.readLine();
//                if (proceed.equalsIgnoreCase("P")) {
//                    // И наконец, стратегия запускает приём платежа.
//                    if (strategy.pay(order.getTotalCost())) {
//                        System.out.println("Payment has been successful.");
//                    } else {
//                        System.out.println("FAIL! Please, check your data.");
//                    }
//                    order.setClosed();
//                }
            }
        }

}

