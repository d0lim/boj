package com.d0lim.boj.p1181;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private void solution(String[] strs) {
        Arrays.stream(strs).distinct().sorted().sorted(Comparator.comparingInt(String::length)).forEach(str ->
                System.out.println(str)
        );
    }

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());

            String[] strs = new String[num];
            for (int i = 0; i < num; i++) {
                strs[i] = br.readLine();
            }

            new Main().solution(strs);
        }
    }
}
