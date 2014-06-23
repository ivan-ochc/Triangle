package main.java;

public final class RtriangleProvider {
    public static Rtriangle getRtriangle() {
       return  new Rtriangle() {
           @Override
           public int getApexX1() {
               return 0;
           }

           @Override
           public int getApexY1() {
               return 0;
           }

           @Override
           public int getApexX2() {
               return 3;
           }

           @Override
           public int getApexY2() {
               return 3;
           }

           @Override
           public int getApexX3() {
               return 3;
           }

           @Override
           public int getApexY3() {
               return 0;
           }
       } ;

    }
}
