package com.simedia.demos;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a roman number: ");
        String romanNumber = scn.nextLine();
        int n=0;
        int sum=0;


        char[] charArray = romanNumber.toCharArray();
        int[] intArray = new int[charArray.length+1];

        for (int i = 0; i < charArray.length ; i++) {


            switch (charArray[i]){
                case 'M':
                    intArray[i]=7;
                    break;
                case 'D':
                    intArray[i]=6;
                    break;
                case 'C':
                    intArray[i]=5;
                    break;
                case 'L':
                    intArray[i]=4;
                    break;
                case 'X':
                    intArray[i]=3;
                    break;
                case 'V':
                    intArray[i]=2;
                    break;
                case 'I':
                    intArray[i]=1;
                    break;
            }
        }
        System.out.println(charArray);
        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < intArray.length-1; i++) {
            if (intArray[i]<intArray[i+1]){
                switch (charArray[i]){
                    case 'C':
                        if (charArray[i+1]=='M')
                            n+=900;
                        if (charArray[i+1]=='D')
                            n+=400;
                        break;
                    case 'X':
                        if (charArray[i+1]=='C')
                            n+=90;
                        if (charArray[i+1]=='L')
                            n+=40;
                        break;
                    case 'I':
                        if (charArray[i+1]=='X')
                            n+=9;
                        if (charArray[i+1]=='V')
                            n+=4;
                        break;
                }
                i++;
            }
            else switch (charArray[i]){
                case 'M':
                    n+=1000;
                    break;
                case 'D':
                    n+=500;
                    break;
                case 'C':
                    n+=100;
                    break;
                case 'L':
                    n+=50;
                    break;
                case 'X':
                    n+=10;
                    break;
                case 'V':
                    n+=5;
                    break;
                case 'I':
                    n+=1;
                    break;


            }

        }
        System.out.println(n);

        }
    }

