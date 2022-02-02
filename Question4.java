
package java_test;

import java.util.Scanner;

/**
 *
 * @author navneet
 */
class acceptArray {

    public static Scanner sc = new Scanner(System.in);

    public int[] Array() {
        System.out.print("Enter the size of Array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}

class great_small extends acceptArray {

    public void greatest() {
        int[] arr = Array();
        System.out.print("The greatest Number is:");
        int great = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (great < arr[i]) {
                great = arr[i];
            }
        }
        System.out.print(great);
    }

    public void smallest() {
        int[] arr = Array();
        System.out.print("The smallest Number is:");
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        System.out.print(small);
    }

}

class ascen_descen extends acceptArray {

    public void ascending() {
        int[] arr = Array();
        int large = 0;
        System.out.println("The sorted array is :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    large = arr[i];
                    arr[i] = arr[j];
                    arr[j] = large;
                }
            }
            System.out.println(arr[i]);
        }
    }

    public void descending() {
        int[] arr = Array();
        int small = 0;
        System.out.println("The sorted array is :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    small = arr[i];
                    arr[i] = arr[j];
                    arr[j] = small;
                }
            }
            System.out.println(arr[i]);
        }
    }
}

public class Question4 extends ascen_descen {

    public void average() {
        int[] arr = Array();
        int avg, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("The average of array is:");
        avg = sum / arr.length;
        System.out.print(avg);

    }

    public static void main(String[] args) {
        great_small gs = new great_small();
        Question4 q4 = new Question4();
        int option;

        System.out.println("Select option to perform :\n 1.Greatest \n 2. Smallest"
                + "\n 3. Ascending Order"
                + "\n 4. Descending Order"
                + "\n 5. Average");
        option = sc.nextInt();
        char rep;
        do{
        switch (option) {
            case 1:
                gs.greatest();
                break;
            case 2:
                gs.smallest();
                break;
            case 3:
                q4.ascending();
                break;
            case 4:
                q4.descending();
                break;
            case 5:
                q4.average();
                break;
            default:
                System.out.println("Select Proper option");

        }
            System.out.print("\n Want to run again:");
            rep=sc.next().charAt(0);
        }while(rep=='Y'||rep=='y');
    }
}
