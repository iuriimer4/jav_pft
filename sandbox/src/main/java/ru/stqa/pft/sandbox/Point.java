package ru.stqa.pft.sandbox;


public class Point {

  public static double distance(int p1, int p2) {
    double len = Math.sqrt(p1 * p2);

    System.out.println(len);
    return len;

  }

  public static void main(String[] args) {

    distance(1, 5);

  }

   }


