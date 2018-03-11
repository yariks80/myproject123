package com.company.Utils;

import java.util.Random;

public class Utils {
    static  class Random{
       public static String  getRandomEmail() {
           return  System.currentTimeMillis()+"@mail.ru";
       }
    }
}
