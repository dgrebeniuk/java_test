package ru.qa.javatest.sandbox;

public class First {

   public static void main(String[] args) {
      hello("God");

      Square s = new Square(5);
      System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

      Rectangle r = new Rectangle(3,7);
      System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));

   }

   public static void hello(String a) {
      System.out.println("Hello, World! I am " + a + "!");
   }

   public static Double area(Square s) {
      return s.l * s.l;
   }

   public static Double area(Rectangle r) {
      return r.a * r.b;
   }

}
