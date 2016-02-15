package edu.achupahin.homeworks.Java_1_3;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Random;

public class Horse {
 int speed; // км/ч
 String name;
 double time; // минуты
 Date timeDate;

 static final Random RANDOM = new Random();
 static final Calendar CALENDAR = Calendar.getInstance();

 static final Comparator<Horse> TIME_COMPARATOR = new Comparator<Horse>() {
  @Override
  public int compare(Horse o1, Horse o2) {
   return Double.compare(o1.time, o2.time);
  }
 };

 Horse(String name) {
  this.name = name;
  this.speed = RANDOM.nextInt(10) + 10;
 }

 double run(int lenght, int tormoz) {
  this.time = (lenght / (double) ((this.speed - tormoz) * 1000)) * 60;

  CALENDAR.clear();
  CALENDAR.set(Calendar.MINUTE, (int) this.time);
  this.timeDate = CALENDAR.getTime();

  return this.time;
 }

 @Override
 public String toString() {
  return String.format("%1$s со временем %2$s", this.name, this.time);
 }

 String toStringNew() {
  return String.format("%1$s со временем %2$tH:%2$tM", this.name, this.timeDate);
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;

  Horse horse = (Horse) o;

  if (speed != horse.speed) return false;
  if (Double.compare(horse.time, time) != 0) return false;
  if (!name.equals(horse.name)) return false;
  return timeDate.equals(horse.timeDate);

 }

 //    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Horse other = (Horse) obj;
//        if (name == null) {
//            if (other.name != null)
//                return false;
//        } else if (!name.equals(other.name))
//            return false;
//        return true;
//    }

}