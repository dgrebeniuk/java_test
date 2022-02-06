package ru.qa.javatest.sandbox;

public class First {

   public static void main(String[] args) {
      hello("God");
      double x = 13;
      double y = 1;
      System.out.println("Площадь прямоугольника = " + x + " и " + y + " = " + area(x,y));
   }

   public static void hello(String a) {
      System.out.println("Hello, World! I am " + a + "!");
   }

   public static Double area(Double x, Double y) {
      return x * y;
   }

}
