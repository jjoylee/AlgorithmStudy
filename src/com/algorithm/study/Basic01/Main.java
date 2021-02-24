package com.algorithm.study.Basic01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
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

        //29번 문제
        //Scanner sc = new Scanner(System.in);
        //int tenVal = sc.nextInt();
        //System.out.println(String.format("%x",tenVal));

        //30번 문제
        //Scanner sc = new Scanner(System.in);
        //int tenVal = sc.nextInt();
        //System.out.println(String.format("%X",tenVal));

        //31번 문제
        //Scanner sc = new Scanner(System.in);
        //String eightVal = sc.nextLine();
        //System.out.println(Integer.parseInt(eightVal,8));

        //32번 문제
        //Scanner sc = new Scanner(System.in);
        //String hexVal = sc.nextLine();
        //int defaultVal = Integer.parseInt(hexVal,16);
        //System.out.println(Integer.toOctalString(defaultVal));

        //33번 문제
        //Scanner sc = new Scanner(System.in);
        //char charVal = sc.nextLine().charAt(0);
        //int asciVal = charVal;
        //System.out.println(asciVal);

        //34번 문제
        //Scanner sc = new Scanner(System.in);
        //int asciVal = sc.nextInt();
        //char charVal = (char)asciVal;
        //System.out.println(charVal);

        //35, 36번 문제
        //Scanner sc = new Scanner(System.in);
        //long firstVal = sc.nextLong();
        //long secondVal = sc.nextLong();
        //System.out.println(firstVal +secondVal );

        //37번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal = sc.nextInt();
        //System.out.println(intVal * -1);

        //38번 문제
        //Scanner sc = new Scanner(System.in);
        //char charVal = sc.nextLine().charAt(0);
        //char nextChar = (char)((int)charVal + 1);
        //System.out.println(nextChar);
    }
}
