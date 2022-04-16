package com.bagacito.www;

public class Main {

    public static void main(String[] args) {
        frontBack("heisenberg");
        frontBack("academia");
        frontBack("SOMETHING");

        //receive command line argument if available
        if(args.length>0){
            frontBack(args[0]);
        }
    }

    private static void frontBack(String str) {
        String firstChar = str.substring(str.length()-1).toUpperCase();
        String lastChar = str.substring(0,1).toLowerCase();
        String rest = str.substring(1, str.length() - 1).toLowerCase();
        System.out.println(firstChar + rest + lastChar);

    }
}
