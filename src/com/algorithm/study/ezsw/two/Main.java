package com.algorithm.study.ezsw.two;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int N, M, K;
    static int A[][] = new int[10][10];
    static int F[][] = new int[10][10];
    static LinkedList<Tree> Trees = new LinkedList<>();
    static int Dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int Dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        // map 그리기
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                A[i][j] = sc.nextInt();
                F[i][j] = 5;
            }
        }

        for(int i = 0; i < M ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int age = sc.nextInt();
            Trees.add(new Tree(x-1,y-1,age,true));
        }

        System.out.println(solve());

    }

    private static int solve() {
        for(int k = 0 ; k < K; k++){
            Spring();
            Summer();
            Fall();
            Winter();
        }
        return Trees.size();
    }

    private static void Winter() {
        for(int i = 0 ; i < N; i++){
            for(int j = 0; j < N; j++){
                F[i][j] += A[i][j];
            }
        }
    }

    private static void Fall() {
        LinkedList<Tree> newTrees = new LinkedList<>();
        for(Tree t : Trees){
            if(t.age % 5 == 0 ) {
                for(int i = 0; i < 8; i++){
                    int nr = t.x + Dx[i], nc = t.y + Dy[i];
                    if(nr < 0 || nr > N - 1 || nc < 0 || nc > N-1 ) continue;
                    newTrees.add(new Tree(nr,nc,1, true));
                }
            }
        }
        Trees.addAll(0,newTrees);
    }

    private static void Summer() {
        for(Iterator<Tree> it = Trees.iterator(); it.hasNext();){
            Tree t = it.next();
            if(!t.alive) {
                F[t.x][t.y] += t.age/2;
                it.remove();
            }
        }
    }

    private static void Spring() {
        for(Tree t : Trees){
            if(t.age <= F[t.x][t.y] ) {
                F[t.x][t.y] -= t.age;
                t.age++;
            }else{
                t.alive = false;
            }
        }
    }

    public static class Tree {
        public int age;
        public int x;
        public int y;
        public boolean alive;
        public Tree(int x, int y, int age, boolean alive){
            this.age = age;
            this.x = x;
            this.y = y;
            this.alive = alive;
        }
    }

}

