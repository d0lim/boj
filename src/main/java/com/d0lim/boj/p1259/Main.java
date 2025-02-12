package com.d0lim.boj.p1259;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static void solution(String number) {
        int length = number.length();
        for (int i = 0; i < length / 2; i++) {
            if (number.charAt(i) != number.charAt(length - i - 1)) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String num = br.readLine();
                if (num.equals("0")) break;

                solution(num);
            }
        }
    }
}
