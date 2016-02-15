package edu.achupahin.homeworks.Java_1_4;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Cake {
 private String name;
 private float flour;
 private float butter;
 private float sugar;
 private int eggs;
 private float water;
 private float weight;
 private Date timeToBake;

 static final int EGGWEIGHT=65;

 public Cake(String name, float flour) {
  this.name = name;
  this.flour = flour;
  this.butter = (float)getRandomInt(40,70)/100f*flour;
  this.sugar = (float)getRandomInt(110,140)/100f*flour;
  this.eggs = getEggs(butter);
  this.water = sugar-eggs*EGGWEIGHT;
 }

 void setWeightTime(){
  float weight=this.flour+this.butter+this.sugar+this.eggs*EGGWEIGHT+this.water;
  this.weight=weight;
  Bakery.CALENDAR.clear();
  Bakery.CALENDAR.set(Calendar.MINUTE, 5);
  for (int i = 0; i <3000 ; i+=100) {
   if (i>=weight) {
    Bakery.CALENDAR.add(Calendar.MINUTE,5);
    this.timeToBake = Bakery.CALENDAR.getTime();
    break;
   }
   else {
    Bakery.CALENDAR.add(Calendar.MINUTE,5);
   }
  }
 }

 public String getName() {
  return name;
 }

 public float getFlour() {
  return flour;
 }

 public void setFlour(float flour) {
  this.flour = flour;
 }

 public float getWater() {
  return water;
 }

 public void setWater(float water) {
  this.water = water;
 }

 public static int getEggs(float butter){
  return (int)Math.round(butter*1.1/EGGWEIGHT);
 }
 public static int getRandomInt(int min, int max)
 {
  if (min >= max)
  {
   throw new IllegalArgumentException("max must be greater than min");
  }
  return Bakery.RANDOM.nextInt((max - min) + 1) + min;
 }

 @Override
 public String toString() {
  return String.format("%1$s: Мука %2$sгр Масло %3$sгр Сахар %4$sгр Яйца %5$sшт " +
    "Вода %6$sмл. Масса %7$sгр, Готовить %8$tR", this.name, (int)this.flour,
    (int)this.butter, (int)this.sugar, this.eggs, (int)this.water,
    (int)this.weight, this.timeToBake);
 }
}
