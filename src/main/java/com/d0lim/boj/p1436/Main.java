package com.d0lim.boj.p1436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private void solution(int num) {
        int cnt = 0;
        int current = 0;

        while (current < Integer.MAX_VALUE && cnt < num) {
            if (Integer.toString(current).contains("666")) {
                cnt++;
            }
            current++;
        }

        System.out.println(current - 1);
    }

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());

            new Main().solution(num);
        }
    }
}
