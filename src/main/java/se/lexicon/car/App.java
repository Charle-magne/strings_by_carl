package se.lexicon.car;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        lengthOfString_00();
        indexPos6_01();
        indexPosOfChar_02();
        substring_03();
        capsOrNoCaps_04();
        javaIsWorst_05();
        trimThoseTabs_06();
        parseInt_07();
        oilAndWater_08();
        splitString_09();
        convertToCharArray_10();
        charToString_11();
    }

    public static void lengthOfString_00(){

        String s1 = "java";
        System.out.println(s1.length());
    }

    public static void indexPos6_01(){

        String s1 = "Long example sentence";
        System.out.println(s1.substring(6,7)); // Printing out whatever is at index position 6 (and stopping right before 7).
    }

    public static void indexPosOfChar_02(){

        String s1 = "Even longer example sentence";
        System.out.println(s1.indexOf("o")); // Printing out the index position of the first letter o it can find.
    }

    public static void substring_03(){

        String s1 = "Ok this is not as long!";
        System.out.println(s1.substring(11, s1.length()-1));
    }

    public static void capsOrNoCaps_04(){

        String s1 = "CAPS EQUALS SCREAMING!";

        String lowerCase = s1.toLowerCase();
        System.out.println(lowerCase);

        s1 = lowerCase.toUpperCase();
        System.out.println(s1);
    }

    public static void javaIsWorst_05(){

        String s1 = "Java is the worst programming language!";
        String s2 = s1.replace("worst", "best");
        System.out.println(s2);
    }

    public static void trimThoseTabs_06(){

        String s1 = "\tJ\ta\tv\ta\t";
        System.out.println(s1.trim());
    }

    public static void parseInt_07(){

        int a = 20;
        String b = String.valueOf(a);
        String year = b.concat("20");
        System.out.println(year);
    }

    public static void oilAndWater_08(){

        String s1 = "Oil and Water";
        String [] array1 = new String[2];

        array1[0] = s1.substring(0,3);
        array1[1] = s1.substring(8);

        for (int i=0; i<array1.length; i++){
            System.out.println(array1[i]);
        }
    }

    public static void splitString_09(){

        String s1 = "Carl,Susie,Fredrick,Bob,Erik";
        String[] names = new String[5];

        names[0] = s1.substring(0,s1.indexOf("S")-1);                   //Det här gränsar till FULKOD.
        names[1] = s1.substring(s1.indexOf("S"), s1.indexOf("F")-1);    //
        names[2] = s1.substring(s1.indexOf("F"), s1.indexOf("B")-1);    //
        names[3] = s1.substring(s1.indexOf("B"), s1.indexOf("E")-1);    //
        names[4] = s1.substring(s1.indexOf("E"));                       //

        for (int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void convertToCharArray_10(){

        String a = "ThisShouldBeConverted";
        char[] b = new char[a.length()];

        for (int i=0; i<a.length(); i++){
            b[i] = a.charAt(i);
            System.out.print(b[i]+"\t");
        }
    }

    public static void charToString_11(){

        char[] a = {'J','a','v','a'};
        String b = new String(a);
        System.out.println(b);
    }
}
