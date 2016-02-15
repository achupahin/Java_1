package edu.achupahin.homeworks.Java_1_3_mine;

import java.util.Random;

public class getRandom {
 public static int getRandomInt(int min, int max)
 {
  if (min >= max)
  {
   throw new IllegalArgumentException("max must be greater than min");
  }
  Random r = new Random();
  return r.nextInt((max - min) + 1) + min;
 }
}
