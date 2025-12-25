
import java.util.Scanner;

public class PriceUpdater {

public static double[] merge(double[] arr1, double[] arr2) {
    int i = 0, j = 0, k = 0;
    double[] merged = new double[arr1.length + arr2.length];
    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            merged[k++] = arr1[i++];
        } else {
            merged[k++] = arr2[j++];
        }
    }
    while (i < arr1.length) {
        merged[k++] = arr1[i++];
    }
    while (j < arr2.length) {
        merged[k++] = arr2[j++];
    }
    return merged;
}

public static void applyInflation(double[] prices) {
    System.out.println("Applying 80% inflation...");
    for (int i = 0; i < prices.length; i++) {
        prices[i] *= 1.8;
    }
}

public static double[] insertSorted(double[] prices, double newPrice) {
    double[] newArr = new double[prices.length + 1];
    int i = 0;
    while (i < prices.length && prices[i] < newPrice) {
        newArr[i] = prices[i];
        i++;
    }
    newArr[i] = newPrice;
    for (int j = i; j < prices.length; j++) {
        newArr[j + 1] = prices[j];
    }
    return newArr;
}

public static void printarray(double[] arr) {
    for (double value : arr) {
        System.out.printf("%1.2f",value);
    }
    System.out.println();
}

public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    double[] arr1 = {10.5, 14.8, 20.0, 30.0, 50.0};
    double[] arr2 = {11.0, 15.2, 25.6, 33.9};

    double[] merged = merge(arr1, arr2);

    //System.out.print("Merged array: ");
    //printarray(merged);
    //System.out.print("Min price: ", merged[0]);
    //System.out.print("Max price: ", merged[merged.length - 1]);

    while (true) {
        System.out.println("Please enter a new prıce: ");
        String input = keyboard.next();

        if (input.equalsIgnoreCase("stop")) {
            break;
        }

        double newPrice = Double.parseDouble(input);

        merged = insertSorted(merged, newPrice);
        applyInflation(merged);
        System.out.print("Updated List: ");
        printarray(merged);
    }

    keyboard.close();
}


}