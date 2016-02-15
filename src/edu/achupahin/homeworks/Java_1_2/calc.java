package edu.achupahin.homeworks.Java_1_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class calc {
 public static void main(String[] args){
  Scanner scanner=new Scanner(System.in);
  System.out.println("Это калькулятор Java");
  String fromConsole;
  while ((System.out.printf("Введите операцию (+,-,*,/) и несколько цифр (q для выхода):\n")) != null
    && !(fromConsole=scanner.nextLine()).equalsIgnoreCase("q")) {
   try {
    if (matchtest(fromConsole) == true){
     String[] temp;
     temp=fromConsole.split(" ");
     int s = 0;
     switch (temp[0].charAt(0)){
      case '+':
       s=0;
       for (int i=1; i<temp.length; i++){
        s=s+Integer.parseInt(temp[i]);
       }
       System.out.printf("Итого:"+s+"\n");
       break;
      case '-':
       s=0;
       for (int i=1; i<temp.length; i++){
        if (i==1){
         s=Integer.parseInt(temp[i]);
        }
        else{
         s=s-Integer.parseInt(temp[i]);
        }
       }
       System.out.printf("Итого:"+s+"\n");
       break;
      case '*':
       for (int i=1; i<temp.length; i++){
        if (i==1){
         s=Integer.parseInt(temp[i]);
        }
        else{
         s=s*Integer.parseInt(temp[i]);
        }
       }
       System.out.printf("Итого:"+s+"\n");
       break;
      case '/':
       float sf=0;
       for (int i=1; i<temp.length; i++){
        if (i==1){
         sf=Float.parseFloat(temp[i]);
        }
        else{
         sf=sf/Float.parseFloat(temp[i]);
        }
       }
       System.out.printf("Итого:"+String.format("%.2f",sf)+"\n");
       break;
     }
    }
   } catch (Exception e) {
    System.out.printf("Неправильный ввод:" + fromConsole+ "\n");
   }
  }

 }
 public static boolean matchtest(String testr)
 {
  Pattern p=Pattern.compile("[\\+\\-\\*\\/](?:\\s\\d{1,10})+");
  Matcher m=p.matcher(testr);
  return m.matches();
 }
}
