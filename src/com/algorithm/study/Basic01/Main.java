package com.algorithm.study.Basic01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

        //39번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal1 = sc.nextInt();
        //int intVal2 = sc.nextInt();
        //System.out.println(intVal1 / intVal2);

        //40번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal1 = sc.nextInt();
        //int intVal2 = sc.nextInt();
        //System.out.println(intVal1 % intVal2);

        //41번 문제
        //Scanner sc = new Scanner(System.in);
        //long longVal = sc.nextLong();
        //System.out.println(longVal + 1);

        //42번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal1 = sc.nextInt();
        //int intVal2 = sc.nextInt();
        //System.out.println(intVal1 + intVal2);
        //System.out.println(intVal1 - intVal2);
        //System.out.println(intVal1 * intVal2);
        //System.out.println(intVal1 / intVal2);
        //System.out.println(intVal1 % intVal2);
        //System.out.println(String.format("%.2f", (double)intVal1 / (double)intVal2));

        //43번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        int intVal3 = sc.nextInt();
        long sum = intVal1 + intVal2 + intVal3;
        System.out.println(sum);
        System.out.println(String.format("%.1f", (double)sum / 3));
         */

        //44번 문제 
        /*
        Scanner sc = new Scanner(System.in);
        int intVal = sc.nextInt();
        System.out.println(intVal<<1);
         */
        
        //45번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1<<intVal2);
         */

        //46번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1 > intVal2 ? 1 : 0);
         */

        //47번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1 == intVal2 ? 1 : 0);
         */

        //48번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1 <= intVal2 ? 1 : 0);
         */

        //49번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1 != intVal2 ? 1 : 0);
         */

        //50번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal = sc.nextInt();
        System.out.println((intVal == 1)? 0 : 1);
         */

        //51번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println((intVal1 == 1 && intVal2 == 1)? 1 : 0);
         */
        
        //52번 문제
         /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println((intVal1 == 1 || intVal2 == 1)? 1 : 0);
          */

        //53번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println((intVal1 == 1  ^ intVal2 == 1)? 1 : 0);
         */

        //54번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal1 = sc.nextInt();
        //int intVal2 = sc.nextInt();
        //System.out.println((intVal1 == 1  ^ intVal2 == 1)? 0 : 1);

        //55번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println((intVal1 == 0 && intVal2 == 0)? 1 : 0);
         */

        //56번 문제
        //Scanner sc = new Scanner(System.in);
        //int intVal = sc.nextInt();
        //System.out.println(~intVal);

        //57번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1&intVal2);
         */

        //58번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1 | intVal2);
         */

        //59번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println(intVal1 ^ intVal2);
         */

        //60번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        System.out.println((intVal1 > intVal2) ? intVal1 : intVal2);
         */

        //61번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        int intVal3 = sc.nextInt();
        System.out.println((intVal1 > intVal2) ? (intVal2 > intVal3? intVal3 : intVal2) :((intVal1 > intVal3? intVal3 : intVal1)));
        */

        //62번 문제
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

        //63번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal1 = sc.nextInt();
        int intVal2 = sc.nextInt();
        int intVal3 = sc.nextInt();
        System.out.println((intVal1 % 2 == 0) ? "even" : "odd");
        System.out.println((intVal2 % 2 == 0) ? "even" : "odd");
        System.out.println((intVal3 % 2 == 0) ? "even" : "odd");
         */

        //64번 문제
        /*
        Scanner sc = new Scanner(System.in);
        int intVal = sc.nextInt();
        System.out.println((intVal >= 0) ? "plus" : "minus");
        System.out.println((intVal % 2 == 0) ? "even" : "odd");
         */
    }
}
