package com.algorithm.study.Basic01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Code Up 기초 100제
        // https://codeup.kr/problemsetsol.php?psid=23

        //01번 문제
        //System.out.println("Hello");

        //02번 문제
        //System.out.println("Hello World");

        //03번 문제
        //System.out.println("Hello\nWorld");

        //04번 문제
        //System.out.println("\'Hello\'");

        //05번 문제
        //System.out.println("\"Hello World\"");

        //06번 문제
        //System.out.println("\"!@#$%^&*()\"");

        //07번 문제
        //System.out.println("\"C:\\Download\\hello.cpp\"");

        //08번 문제
        //System.out.println("\u250C\u252C\u2510");
        //System.out.println("\u251C\u253C\u2524");
        //System.out.println("\u2514\u2534\u2518");

        //09번 문제
        //Scanner sc = new Scanner(System.in);
        //int val = sc.nextInt();
        //System.out.println(val);

        //10번 문제
        //(char)System.in.read() 이 방법도 있다.
        //Scanner sc = new Scanner(System.in);
        //char charVal = sc.next().charAt(0);
        //System.out.println(charVal);

        //11번 문제
        //Scanner sc = new Scanner(System.in);
        //float floatVal = sc.nextFloat();
        //System.out.format("%f", floatVal);

        //12번 문제
        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //System.out.println(a + " " + b);

        //13번 문제
        //Scanner sc = new Scanner(System.in);
        //char x = sc.next().charAt(0);
        //char y = sc.next().charAt(0);
        //System.out.println(y + " " + x);

        //14번 문제
        //Scanner sc = new Scanner(System.in);
        //float floatVal = sc.nextFloat();
        //System.out.format("%.2f",floatVal);

        //15번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal = sc.nextInt();
        //System.out.println(intVal + " " + intVal + " " + intVal);

        //16번 문제
        //Scanner sc = new Scanner(System.in);
        //String dateVal = sc.nextLine();
        //System.out.println(dateVal);

        //17번 문제
        //Scanner sc = new Scanner(System.in);
        //String dateVal = sc.nextLine();
        //int yearVal = Integer.parseInt(dateVal.split("\\.")[0]);
        //int monthVal = Integer.parseInt(dateVal.split("\\.")[1]);
        //int dayVal = Integer.parseInt(dateVal.split("\\.")[2]);
        //System.out.println(String.format("%04d",yearVal) + "." + String.format("%02d",monthVal) + "." + String.format("%02d",dayVal));

        //18번 문제
        //Scanner sc = new Scanner(System.in);
        //String code = sc.nextLine();
        //String firstCode = code.split("-")[0];
        //String secondCode = code.split("-")[1];
        //System.out.println(firstCode+secondCode);

        //19, 20번 문제
        //Scanner sc = new Scanner(System.in);
        //String stringVal = sc.nextLine();
        //System.out.println(stringVal);

        //21번 문제
        //Scanner sc = new Scanner(System.in);
        //String floatVal = sc.nextLine();
        //System.out.println(floatVal.split("\\.")[0]);
        //System.out.println(floatVal.split("\\.")[1]);

        //22번 문제
        //Scanner sc = new Scanner(System.in);
        //String voca = sc.nextLine();
        //for (int idx = 0 ; idx < voca.length(); idx++) {
        //    System.out.println("\'" + voca.charAt((idx)) + "\'");
        //}

        //23번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal = sc.nextInt();
        //for(int idx = 10000; idx >= 1 ; idx = idx / 10){
        //    int topVal = intVal / idx * idx;
        //    System.out.println("[" + topVal + "]");
        //   intVal = intVal - topVal;
        //}

        //24번 문제
        //Scanner sc = new Scanner(System.in);
        //String timeString = sc.nextLine();
        //String minute = timeString.split(":")[1];
        //System.out.println(Integer.parseInt(minute));

        //25번 문제
        //Scanner sc = new Scanner(System.in);
        //String timeString = sc.nextLine();
        //SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy.mm.dd");
        //SimpleDateFormat outputFormat = new SimpleDateFormat("dd-mm-yyyy");
        //Date inputDate = inputFormat.parse(timeString);
        //System.out.println(outputFormat.format(inputDate));

        //26, 28번 문제
        //Scanner sc = new Scanner(System.in);
        //long longVal = sc.nextLong();
        //System.out.println(longVal);

        //27번 문제
        //Scanner sc = new Scanner(System.in);
        //double doubleVal = sc.nextDouble();
        //System.out.println(String.format("%.11f",doubleVal));

        //29번 문제
        //Scanner sc = new Scanner(System.in);
        //int tenVal = sc.nextInt();
        //System.out.println(String.format("%o",tenVal));

        //30번 문제
        //Scanner sc = new Scanner(System.in);
        //int tenVal = sc.nextInt();
        //System.out.println(String.format("%x",tenVal));

        //31번 문제
        //Scanner sc = new Scanner(System.in);
        //int tenVal = sc.nextInt();
        //System.out.println(String.format("%X",tenVal));

        //32번 문제
        //Scanner sc = new Scanner(System.in);
        //String eightVal = sc.nextLine();
        //System.out.println(Integer.parseInt(eightVal,8));

        //33번 문제
        //Scanner sc = new Scanner(System.in);
        //String hexVal = sc.nextLine();
        //int defaultVal = Integer.parseInt(hexVal,16);
        //System.out.println(Integer.toOctalString(defaultVal));

        //34번 문제
        //Scanner sc = new Scanner(System.in);
        //char charVal = sc.nextLine().charAt(0);
        //int asciVal = charVal;
        //System.out.println(asciVal);

        //35번 문제
        //Scanner sc = new Scanner(System.in);
        //int asciVal = sc.nextInt();
        //char charVal = (char)asciVal;
        //System.out.println(charVal);

        //36, 37번 문제
        //Scanner sc = new Scanner(System.in);
        //long firstVal = sc.nextLong();
        //long secondVal = sc.nextLong();
        //System.out.println(firstVal +secondVal );

        //38번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal = sc.nextInt();
        //System.out.println(intVal * -1);

        //39번 문제
        //Scanner sc = new Scanner(System.in);
        //char charVal = sc.nextLine().charAt(0);
        //char nextChar = (char)((int)charVal + 1);
        //System.out.println(nextChar);

        //40번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal1 = sc.nextInt();
        //int intVal2 = sc.nextInt();
        //System.out.println(intVal1 / intVal2);

        //41번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal1 = sc.nextInt();
        //int intVal2 = sc.nextInt();
        //System.out.println(intVal1 % intVal2);

        //42번 문제
        //Scanner sc = new Scanner(System.in);
        //long longVal = sc.nextLong();
        //System.out.println(longVal + 1);

        //43번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal1 = sc.nextInt();
        //int intVal2 = sc.nextInt();
        //System.out.println(intVal1 + intVal2);
        //System.out.println(intVal1 - intVal2);
        //System.out.println(intVal1 * intVal2);
        //System.out.println(intVal1 / intVal2);
        //System.out.println(intVal1 % intVal2);
        //System.out.println(String.format("%.2f", (double)intVal1 / (double)intVal2));

        //44번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        int intVal3 = sc.nextInt();
        long sum = intVal1 + intVal2 + intVal3;
        System.out.println(sum);
        System.out.println(String.format("%.1f", (double)sum / 3));
         */

        //45번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal = sc.nextInt();
        System.out.println(intVal<<1);
         */

        //46번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1<<intVal2);
         */

        //47번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1 > intVal2 ? 1 : 0);
         */

        //48번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1 == intVal2 ? 1 : 0);
         */

        //49번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1 <= intVal2 ? 1 : 0);
         */

        //50번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1 != intVal2 ? 1 : 0);
         */

        //51번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal = sc.nextInt();
        System.out.println((intVal == 1)? 0 : 1);
         */

        //52번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println((intVal1 == 1 && intVal2 == 1)? 1 : 0);
         */

        //53번 문제
         /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println((intVal1 == 1 || intVal2 == 1)? 1 : 0);
          */

        //54번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println((intVal1 == 1  ^ intVal2 == 1)? 1 : 0);
         */

        //55번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal1 = sc.nextInt();
        //int intVal2 = sc.nextInt();
        //System.out.println((intVal1 == 1  ^ intVal2 == 1)? 0 : 1);

        //56번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println((intVal1 == 0 && intVal2 == 0)? 1 : 0);
         */

        //57번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal = sc.nextInt();
        //System.out.println(~intVal);

        //58번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1&intVal2);
         */

        //59번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1 | intVal2);
         */

        //60번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1 ^ intVal2);
         */

        //61번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println((intVal1 > intVal2) ? intVal1 : intVal2);
         */

        //62번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        int intVal3 = sc.nextInt();
        System.out.println((intVal1 > intVal2) ? (intVal2 > intVal3? intVal3 : intVal2) :((intVal1 > intVal3? intVal3 : intVal1)));
        */

        //63번 문제
        /*
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        for(int i = 0 ; i < 3 ; i++){
            if(list.get(i) % 2 == 0)  System.out.println(list.get(i));
        }
         */

        //64번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        int intVal3 = sc.nextInt();
        System.out.println((intVal1 % 2 == 0) ? "even" : "odd");
        System.out.println((intVal2 % 2 == 0) ? "even" : "odd");
        System.out.println((intVal3 % 2 == 0) ? "even" : "odd");
         */

        //65번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal = sc.nextInt();
        System.out.println((intVal >= 0) ? "plus" : "minus");
        System.out.println((intVal % 2 == 0) ? "even" : "odd");
         */

        //66번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String grade = "";
        if(100 >= score && score >= 90) grade = "A";
        else if(89 >= score && score >= 70 ) grade = "B";
        else if(69 >= score && score >= 40 ) grade = "C";
        else grade = "D";
        System.out.println(grade);
         */

        //67번 문제
        /*
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();
        String printVal = "";
        switch (grade){
            case "A" :
                printVal = "best!!!";
                break;
            case "B" :
                printVal = "good!!";
                break;
            case "C" :
                printVal = "run!";
                break;
            case "D" :
                printVal = "slowly~";
                break;
            default :
                printVal = "what?";
                break;
        }
        System.out.println(printVal);
         */

        //68번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        String monthString = "";
        switch (month){
            case 12: case 1: case 2 :
                monthString = "winter";
                break;
            case 3: case 4: case 5 :
                monthString = "spring";
                break;
            case 6: case 7: case 8 :
                monthString = "summer";
                break;
            default :
                monthString = "fall";
                break;
        }
        System.out.println(monthString);
         */

        //69, 71번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal = sc.nextInt();
        while(intVal != 0){
            System.out.println(intVal);
            intVal = sc.nextInt();
        }
         */

        //70번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int recordNum = sc.nextInt();
        while(recordNum != 0){
            int record = sc.nextInt();
            System.out.println(record);
            recordNum--;
        }
         */

        //72번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int recordNum = sc.nextInt();
        while(recordNum != 0){
            System.out.println(recordNum);
            recordNum--;
        }
         */

        //73번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int recordNum = sc.nextInt();
        while(recordNum != 0){
            recordNum--;
            System.out.println(recordNum);
        }
         */

        //74번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int asciiVal = sc.nextLine().charAt(0);
        int firstVal = 'a';
        while(firstVal <= asciiVal){
            char charVal = (char)firstVal;
            System.out.println(charVal);
            ++firstVal;
        }
         */

        //75번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal = sc.nextInt();
        for(int idx = 0; idx <= intVal ; idx++){
            System.out.println(idx);
        }
         */

        //76번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal = sc.nextInt();
        if(intVal % 2 == 1) intVal = intVal - 1;
        int sumVal = 0;
        for(int idx = 0; idx <= intVal ; idx = idx + 2){
            sumVal += idx;
        }
        System.out.println(sumVal);
         */

        //77번 문제
        /*
        Scanner sc = new Scanner(System.in);
        char charVal = sc.next().charAt(0);
        while(charVal != 'q'){
            System.out.println(charVal);
            charVal = sc.next().charAt(0);
        }
        System.out.println(charVal);
         */

        //78번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal = sc.nextInt();
        int sumVal = 0;
        for(int idx = 1; idx < intVal; idx++){
            sumVal = sumVal + idx;
            if(sumVal >= intVal) {
                System.out.println(idx);
                break;
            }
        }
         */

        //79번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        for(int idx1 = 1; idx1 <= dice1; idx1++){
            for(int idx2 = 1; idx2 <= dice2 ; idx2++){
                System.out.println(idx1 + " " + idx2);
            }
        }
         */

        //80번 문제
        /*
        Scanner sc = new Scanner(System.in);
        String hexString = sc.nextLine();
        int intVal = Integer.valueOf(hexString,16);
        for(int idx = 1; idx <= 15; idx++){
            System.out.println(
                    Integer.toHexString(intVal).toUpperCase(Locale.ROOT)
                    + "*" + Integer.toHexString(idx).toUpperCase(Locale.ROOT)
                    + "=" + Integer.toHexString(idx * intVal).toUpperCase(Locale.ROOT));
        }
         */

        //81번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal = sc.nextInt();
        for(int idx = 1; idx <= intVal; idx++){
            String printTxt = (idx %3 == 0)? "X" : String.valueOf(idx);
            System.out.print((printTxt + " "));
        }
         */

        //82번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int rVal = sc.nextInt();
        int gVal = sc.nextInt();
        int bVal = sc.nextInt();

        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int idx1 = 0; idx1 < rVal; idx1++){
            for(int idx2 = 0 ; idx2 < gVal ; idx2++){
                String strVal ="";
                for(int idx3 = 0 ; idx3 < bVal; idx3++){
                    strVal += idx1 + " " + idx2 + " " + idx3+"\n";
                }
                bf.write(strVal);
                bf.flush();
            }
        }
        System.out.println(rVal * gVal * bVal);
         */

        //83번 문제
        /*
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = sc.nextLong();
        double mbVal = (h*b*c*s) / (double)8 / (double)1024 / (double)1024;
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.write(String.format("%.1f",mbVal) + " MB");
        bf.flush();
         */

        //84번 문제
        /*
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        long b = sc.nextLong();
        double mbVal = (h*b*w) / (double)8 / (double)1024 / (double)1024;
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.write(String.format("%.2f",mbVal) + " MB");
        bf.flush();
         */

        //85번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal = sc.nextInt();
        int sum = 0;
        for(int idx = 1; idx <= intVal; idx++){
            sum += idx;
            if(sum >= intVal) break;
        }
        System.out.println(sum);
         */

        //86번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(a + d * (n-1));
         */

        //87번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        long sum = 0;
        for(int idx =0 ; idx < n-1 ; idx++){
            sum += (long)(d * Math.pow(m,idx));
        }
        System.out.println((long)(a* Math.pow(m,n-1)) + sum);
         */

        //87번 문제
        /*
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();
        for(int idx = 1 ; idx < n ; idx++){
            a = a*m + d;
        }
        System.out.println(a);
         */

        //88번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int day = 1;
        while(day % a != 0 || day % b != 0 || day % c != 0){
            day++;
        }
        System.out.println(day);
         */

        //89번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] callArray = new int[23];
        for(int idx = 0; idx < n ; idx++){
            int called = sc.nextInt();
            ++callArray[called - 1];
        }
        for(int idx = 0; idx < 23 ; idx++){
            System.out.print(callArray[idx] + " ");
        }
         */

        //90번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] callArray = new int[n];
        for(int idx = 0; idx < n ; idx++){
            callArray[idx] = sc.nextInt();
        }
        for(int idx = n-1; idx >= 0 ; idx--){
            System.out.print(callArray[idx] + " ");
        }
         */

        //91번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 23;
        for(int idx = 0; idx < n ; idx++){
            int inputVal = sc.nextInt();
            if(inputVal < min) min = inputVal;
        }
        System.out.print(min);
         */

        // 92번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[19][19];
        for(int idx = 0; idx < n ; idx++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            board[x-1][y-1] = 1;
        }

        for(int xVal = 0; xVal < 19 ; xVal++){
            for(int yVal = 0; yVal < 19 ; yVal++){
                System.out.print(board[xVal][yVal] + " ");
            }
            System.out.println();
        }
         */

        // 93번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[19][19];
        for(int xVal = 0; xVal < 19 ; xVal++){
            for(int yVal = 0; yVal < 19 ; yVal++){
                board[xVal][yVal] = sc.nextInt();
            }
        }

        int n = sc.nextInt();

        for(int idx = 0; idx < n ; idx++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int xVal = 0; xVal < 19 ; xVal++){
                board[xVal][y-1]  = (board[xVal][y-1] == 1) ? 0 : 1;
            }
            for(int yVal = 0; yVal < 19 ; yVal++){
                board[x-1][yVal]  = (board[x-1][yVal] == 1) ? 0 : 1;
            }
        }

        for(int xVal = 0; xVal < 19 ; xVal++){
            for(int yVal = 0; yVal < 19 ; yVal++){
                System.out.print(board[xVal][yVal] + " ");
            }
            System.out.println();
        }
         */

        // 94번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] board = new int[x][y];
        int n = sc.nextInt();
        for(int idx = 0; idx < n; idx++){
            int l = sc.nextInt();
            int d = sc.nextInt();
            int startX = sc.nextInt();
            int startY = sc.nextInt();
            for(int len = 0 ; len < l ; len++){
                if(d == 0) board[startX - 1][startY - 1 + len] = 1;
                else  board[startX - 1 + len][startY-1]  = 1;
            }
        }

        for(int xVal = 0; xVal < x ; xVal++){
            for(int yVal = 0; yVal < y ; yVal++){
                System.out.print(board[xVal][yVal] + " ");
            }
            System.out.println();
        }
         */

        // 95번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[10][10];

        for(int xVal = 0; xVal < 10 ; xVal++){
            for(int yVal = 0; yVal < 10 ; yVal++){
                board[xVal][yVal] = sc.nextInt();
            }
        }

        int x = 1;
        int y = 1;
        while(x != 9 && y != 9) {
            if(board[x][y] == 2){
                board[x][y] = 9;
                break;
            }
            board[x][y] = 9;
            if(board[x][y+1] == 1) {
                x = x + 1;
            } else{
                y = y + 1;
            }
        }

        for(int xVal = 0; xVal < 10 ; xVal++){
            for(int yVal = 0; yVal < 10 ; yVal++){
                System.out.print(board[xVal][yVal] + " ");
            }
            System.out.println();
        }
         */
    }
}
