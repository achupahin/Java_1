package edu.achupahin.homeworks.Java_1_3;

import java.util.Arrays;
import java.util.Random;

public class Race {
 public static void main(String[] args) {
  Random random = new Random();
  Horse[] horses = new Horse[4];
  int lenght = 10000;

  for (int i = 0, size = -1; i < horses.length; i++) {
   Horse horse = new Horse("Лошадка_" + i);
   match(horses, horse, size++);
   horses[i] = horse;
  }

  for (int i = 1; i <= 5; i++) {
   for (int j = 0; j < horses.length; j++) {
    horses[j].run(lenght, random.nextInt(10));
   }

   System.out.println(String.format("Забег %1$s победила лошадь %2$s",
     i, getWinner(horses)));
   printRaceTable(horses, i);
  }
 }

 static Horse getWinner(Horse[] horses) {
  Horse[] horses2 = Arrays.copyOf(horses, horses.length);
  Arrays.sort(horses2, Horse.TIME_COMPARATOR);
  return horses2[0];
 }

 static void printRaceTable(Horse[] horses, int zabeg) {
  System.out.println(String.format("Забег %1$s", zabeg));

  Horse[] horses2 = Arrays.copyOf(horses, horses.length);
  Arrays.sort(horses2, Horse.TIME_COMPARATOR);

  for (int i = 0; i < horses2.length; i++) {
   System.out.println(String.format("%1$s)%2$s", i + 1,
     horses2[i].toStringNew()));
  }
 }

 static void match(Horse[] horses, Horse newHorse, int size) {
  for (int i = 0; i < size; i++) {
   if (horses[i].equals(newHorse)) {
    System.out.println("Лошадь существует" + horses[i].name);
    System.exit(0);
   }
  }
 }
}