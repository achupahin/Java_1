package edu.achupahin.homeworks.Java_1_3_mine;

import java.time.LocalTime;
import java.util.Arrays;

public class Races {
 private static int raceCount = 6;
 private static int currentSpeed;
 private static int trackLenght = 10;
 private static int raceTime;


 public static void main(String[] args) {
  horse[] horses = new horse[6];
  horses[0] = new horse("Молох");
  horses[1] = new horse("Степной Орел");
  horses[2] = new horse("Голден Глори");
  horses[3] = new horse("Гутен Таг");
  horses[4] = new horse("Буллит");
  horses[5] = new horse("Вент Нуар");
  results[][] results=new results[raceCount][6];

  for (int r = 0; r < raceCount; r++) {
   int c1=r+1;
   System.out.printf("Забег #" + c1 + "\n");
   for (int h = 0; h < horses.length; h++) {
    currentSpeed = horses[h].getSpeed() - getRandom.getRandomInt(1, 10);
    raceTime = trackLenght*3600 / currentSpeed;
    results[r][h]=new results(horses[h].getName(),horses[h].getSpeed(),currentSpeed,raceTime);
   }
   Arrays.sort(results[r]);
   for (int h = 0; h < horses.length; h++) {
    int c2=h+1;
    System.out.printf(c2+") Лошадь " + results[r][h].getHorse() + ": Скорость: " + results[r][h].getCurrentSpeed() + "км/ч Время: " + toHMS(results[r][h].getTime()) + "\n");
   }
   System.out.printf("В забеге "+c1+" победила лошадь "+results[r][0].getHorse()+"\n");
  }
  System.out.printf("Финиш");
 }
 private static String toHMS(int nSecondTime) {
  return LocalTime.MIN.plusSeconds(nSecondTime).toString();
 }
}
