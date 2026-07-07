package programmers.d0702;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String combined = str1.concat(str2);

        System.out.println(combined);
        sc.close();
    }
}