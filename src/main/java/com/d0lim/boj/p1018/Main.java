package com.d0lim.boj.p1018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private void solution(int N, int M, boolean[][] board) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int count = 0;
                boolean latest = board[i][j];
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if (board[i + k][j + l] != latest) count++;
                        latest = !latest;
                    }
                    latest = !latest;
                }
                result = Math.min(Math.min(result, count), 64 - count);
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            boolean[][] board = new boolean[N][M];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                String[] s = st.nextToken().split("");
                for (int j = 0; j < M; j++) {
                    board[i][j] = s[j].equals("W");
                }
            }

            new Main().solution(N, M, board);
        }
    }
}
