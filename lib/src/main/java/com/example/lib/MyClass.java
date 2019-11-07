package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        float n, ans;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入  1+2+3...+n  中的n");
            n = scanner.nextFloat();
            ans = ((1 + n) * n) / 2;
            if (n == (int) n) {

                System.out.println("你的答案是:" + ans);
            } else if (n != (int) n) {
                System.out.println("請輸入整數\n");
            }
        }
    }
}
