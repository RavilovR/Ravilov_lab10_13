package mirea;

import java.util.ArrayList;
import java.util.Scanner;

public class OddPos {

    public ArrayList<Integer> integers = new ArrayList<Integer>();
    public int i = 0;
    public int num = 1;

    public OddPos() {

    }

    public void FillArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Вводите числа. Чтобы закончить введите 0: ");
        while (num != 0) {
            num = sc.nextInt();
            integers.add(num);
        }
        sc.close();
    }
    public void ShowOddPosElements() {
        if (integers.get(i) == 0) {
            return;
        }
        if (i % 2 != 0) {
            System.out.println(integers.get(i));
        }
        if (++i < integers.size()) {
            ShowOddPosElements();
        }
    }
}