package edu.achupahin.homeworks.Java_1_3_mine;

public class results implements Comparable
{

 private String horse;
 private int speed;
 private int currentSpeed;
 private int time;

 public results(String _horse, int _speed, int _currentSpeed, int _time) {

  horse = _horse;
  speed = _speed;
  currentSpeed=_currentSpeed;
  time=_time;
 }
 public int getTime() {
  return time;
 }
 public int getCurrentSpeed() {
  return currentSpeed;
 }
 public String getHorse() {
  return horse;
 }
 public int compareTo(Object obj)
 {
  results tmp = (results)obj;
  if(this.time < tmp.time)
  {
   return -1;
  }
  else if(this.time > tmp.time)
  {
   return 1;
  }
  return 0;
 }

}
