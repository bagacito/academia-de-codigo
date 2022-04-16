package com.bagacito.www;

public class Main {

    public static void main(String[] args) {
        notString("semicolon");
        notString("not semicolon");
        notString("nothing");
        notString("knot");
        notString("cannot ");

        if(args.length > 0)
            notString(args[0]);
    }

    private static void notString(String str){
        String compare = "not ";

        if(!str.startsWith(compare))
            System.out.println(compare + str);
        else
            System.out.println(str);
    }
}
