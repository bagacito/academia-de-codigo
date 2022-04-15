package com.bagacito.www;

public class Main {

    public static void main(String[] args) {
        missingChar("Robocop" , 6);

        if(args.length >= 2){
            missingChar(args[0], Integer.parseInt(args[1]));
        }

    }

    private static void missingChar(String str, int n){
        if(!(n >= str.length()))
            System.out.println(str.substring(0,n) + str.substring(n+1));
        else
            System.out.println(str);
    }
}
