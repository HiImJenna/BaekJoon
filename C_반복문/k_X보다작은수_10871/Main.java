package C_반복문.k_X보다작은수_10871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenght = sc.nextInt();
        int max = sc.nextInt();
        int arr[] = new int [lenght];

        for (int i = 0; i < lenght; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < lenght; j++) {
            if (arr[j] < max){
                System.out.print(arr[j] + " ");
            }

        }
           
        
        sc.close();

        }
        
    }

