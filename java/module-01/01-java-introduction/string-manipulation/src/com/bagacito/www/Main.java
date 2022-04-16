package com.bagacito.www;

public class Main {

    public static void main(String[] args) {

        String providedString = "http://www.academiadecodigo.org <tr_,>";
        String providedStringTwo = "ca<orie_wdg,m .t>";
        stringManipulation(providedString);
        stringManipulation(providedStringTwo);

        //receive command line argument if available
        if(args.length>0){
            stringManipulation(args[0]);
        }
    }

    private static void stringManipulation(String str) {
        //"I am a Code Cadet at < Academia de Codigo_ >, www.academiadecodigo.org"

        // Store required Characters
        String space = Character.toString(str.charAt(str.indexOf(" ")));
        String backChevron = Character.toString(str.charAt(str.indexOf("<")));
        String forwardChevron = Character.toString(str.charAt(str.indexOf(">")));
        String underscore = Character.toString(str.charAt(str.indexOf("_")));
        String comma = Character.toString(str.charAt(str.indexOf(",")));
        String dot = Character.toString(str.charAt(str.indexOf(".")));
        String a = Character.toString(str.charAt(str.indexOf("a")));
        String c = Character.toString(str.charAt(str.indexOf("c")));
        String d = Character.toString(str.charAt(str.indexOf("d")));
        String e = Character.toString(str.charAt(str.indexOf("e")));
        String g = Character.toString(str.charAt(str.indexOf("g")));
        String i = Character.toString(str.charAt(str.indexOf("i")));
        String m = Character.toString(str.charAt(str.indexOf("m")));
        String o = Character.toString(str.charAt(str.indexOf("o")));
        String r = Character.toString(str.charAt(str.indexOf("r")));
        String t = Character.toString(str.charAt(str.indexOf("t")));
        String w = Character.toString(str.charAt(str.indexOf("w")));




        // Construct message Parts
        String I = i.toUpperCase();
        String am = a + m;
        String Code = c.toUpperCase() + o + d + e;
        String Cadet = c.toUpperCase() + a + d + e + t;
        String at = a + t;
        String Academia = a.toUpperCase() + c + a + d + e + m + i + a;
        String de = d + e;
        String Codigo = c.toUpperCase() + o + d + i + g + o;
        String name = backChevron + space + Academia + space + de + space + Codigo + underscore + space + forwardChevron;
        String domain = w + w + w + dot + Academia.toLowerCase() + de + Codigo.toLowerCase() + dot + o + r + g;

        //Print Message
        System.out.println(
          I + space + am + space + a + space + Code + space + Cadet + space + at + space + name + comma + space + domain
        );
    }
}
