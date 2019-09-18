package cn.gzmodern.data_media.lesson02;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringReview {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println("str1 == str2?" + (str1 == str2));
        System.out.println("str1.equals(str2)?" + str1.equals(str2));

        System.out.println("str1 == str3?" + (str1 == str3));
        System.out.println("str1.equals(str3)?" + str1.equals(str3));
        System.out.println("str1.intern() == str3.intern?"+ (str1.intern() == str3.intern()));

        System.out.println("str4 == str3?" + (str4 == str3));

    }
}
