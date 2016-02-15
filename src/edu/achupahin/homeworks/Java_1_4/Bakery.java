package edu.achupahin.homeworks.Java_1_4;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Bakery {

 static final Random RANDOM = new Random ();
 static final Calendar CALENDAR = Calendar.getInstance ();


 public static void main (String[] args) {
  Cake[] cakes = new Cake[10];

  //Замешиваем
  for (int i = 0, size = -1; i < cakes.length; i++) {
   int a = i + 1;
   Cake cake = new Cake ("Кекс_" + a, Cake.getRandomInt (100, 400));
   cakes[i] = cake;
  }
  //Выпекаем
  for (Cake cake : cakes) {
   cake.setWeightTime ();
   System.out.println (String.format ("%1$s готов", cake.getName ()));
  }
  //Выводим данные по кексам
  for (Cake cake : cakes) System.out.println (cake);

  System.out.println ("Увеличиваем муку и воду");
  int i = 1;
  for (Cake cake : cakes) {
   if (i % 2 == 0) {
    cake.setFlour (cake.getFlour () + 50f);
    cake.setWeightTime ();
   } else {
    cake.setWater (cake.getWater () + 80f);
    cake.setWeightTime ();
   }
  }
  //Выводим данные по кексам
  for (Cake cake : cakes) System.out.println (cake);
 }
}
