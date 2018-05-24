package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Point {

  @Test
  public void TestPoint(){
    distance(1, 5);
  }
  public static void distance(int p1, int p2) {
    double len = Math.sqrt(p1 * p2);
    Assert.assertEquals(len, 2.23606797749979);

  }
}

