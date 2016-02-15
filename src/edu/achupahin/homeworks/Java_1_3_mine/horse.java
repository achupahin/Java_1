package edu.achupahin.homeworks.Java_1_3_mine;

public class horse {
 private String name;
 private int speed;

 public horse(String _name) {
  name = _name;
  speed = getRandom.getRandomInt(30, 40);
 }

 public int getSpeed() {
  return speed;
 }

 public String getName() {
  return name;
 }
}
