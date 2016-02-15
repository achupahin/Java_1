package edu.achupahin.homeworks.Java_1_4;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class Bakery {

 static final Random RANDOM = new Random();
 static final Calendar CALENDAR = Calendar.getInstance();

 public static void main(String[] args) {
  Cake[] cakes=new Cake[10];

  //Замешиваем
  for (int i = 0, size = -1; i < cakes.length; i++) {
   int a=i+1;
   Cake cake = new Cake("Кекс_" + a, Cake.getRandomInt(100,400));
   cakes[i]=cake;
  }
  //Выпекаем
  for (int i = 0; i < cakes.length; i++) {
   cakes[i].setWeightTime();
   System.out.println(String.format("%1$s готов", cakes[i].getName()));
  }
  //Выводим данные по кексам
  for (int i = 0; i < cakes.length ; i++) {
   System.out.println(cakes[i].toString());
  }
  System.out.println("Увеличиваем муку и воду");
  for (int i = 0; i < cakes.length; i++) {
   int a=i+1;
   if (a%2==0) {
    cakes[i].setFlour(cakes[i].getFlour()+50f);
    cakes[i].setWeightTime();
   }
   else {
    cakes[i].setWater(cakes[i].getWater()+80f);
    cakes[i].setWeightTime();
   }
  }
  //Выводим данные по кексам
  for (int i = 0; i < cakes.length ; i++) {
   System.out.println(cakes[i].toString());
  }
  //System.out.println(String.format("Время %1$tH:%1$tM", timeOfBake));
 }
}
