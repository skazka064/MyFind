package com.mypackage.find;

public class MyFind {

    public static boolean myF(int[] list, int x){
        int length = list.length;
        int left = -1;
        int right = list.length;
        while (left < right-1){
          int  med = (left+right)/2;

          if (list[med] == x){
              return true;
          }else  if (list[med] < x){
                    left = med;

                }else{
                    right = med;

                }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] list = {1,2,503,704,805,806,808,809,900};

        boolean rez = myF(list,807);
        System.out.println(rez);
    }
}
