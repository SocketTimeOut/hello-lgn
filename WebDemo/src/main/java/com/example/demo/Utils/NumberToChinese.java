package com.example.demo.Utils;

import java.util.Arrays;

/**
 * @author ChenMengLong
 * @version v1.0
 * 2020/11/27
 */
public class NumberToChinese {
  public static void main(String[] args) {
    char[] a={'0','c','f','\u000c','\u0000','\u0038'};
    System.out.println(Arrays.asList(a).contains(new char[] {'8'}));
    System.out.println(Arrays.toString(a));
  }
}
