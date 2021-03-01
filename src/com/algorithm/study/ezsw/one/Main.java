package com.algorithm.study.ezsw.one;

import java.util.Scanner;

public class Main {

    static int N, L, R;
    static int Map[][] = new int[50][50];
    static int Visited[][] = new int[50][50];
    static int Cnt;

    //https://www.acmicpc.net/problem/16234 인구이동문제
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        L = sc.nextInt();
        R = sc.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                Map[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve());
    }

    private static int solve() {
        int ret = 0;
        boolean flag;
        do{
            flag = false;
            // 초기화
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    Visited[i][j] = 0;
                }
            }

            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if(Visited[i][j] == 0){
                        Cnt = 0;
                        int sum = find(i,j,-1);
                        if(Cnt > 1){
                            flag = true;
                            move(i,j, sum / Cnt);
                        } else{
                            Visited[i][j] = 2;
                        }
                    }
                }
            }
            if(flag) ++ ret;
        }while(flag);
        return ret;
    }

    private static void move(int r, int c, int value) {
        if(r < 0 || r > N-1 || c < 0 || c > N-1) return;
        if(Visited[r][c] != 1) return;
        Visited[r][c] = 2;
        Map[r][c]= value;
        move(r,c+1,value);
        move(r,c-1,value);
        move(r-1,c,value);
        move(r+1,c,value);
    }

    private static int find(int r, int c, int value) {
        if(r < 0 || r > N-1 || c < 0 || c > N-1) return 0;
        if(Visited[r][c] != 0 ) return 0;
        if(value != -1){
            int diff = Math.abs(value - Map[r][c]);
            if(diff < L || diff > R) return 0;
        }
        Visited[r][c] = 1;
        Cnt++;
        int sum = Map[r][c];
        sum += find(r,c+1,Map[r][c]);
        sum += find(r,c-1,Map[r][c]);
        sum += find(r-1,c,Map[r][c]);
        sum += find(r+1,c,Map[r][c]);
        return sum;
    }
}
