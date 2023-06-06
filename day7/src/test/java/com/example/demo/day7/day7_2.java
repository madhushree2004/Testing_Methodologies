package com.example.demo.day7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day7_2 
{

	int n1=20;
	int n2=10;
   @Test(priority=1)
   public void add() {
	   int sum=n1+n2;
	  Assert.assertEquals(sum, 30);
  }
  @Test(priority=2)
	  public void subtract() {
	  int sub=n1-n2;
	  Assert.assertEquals(sub, 10);
  }
  @Test(priority=3)
  public void  multiply() {
	  int pro=n1*n2;
	  Assert.assertEquals(pro, 200);
  }
  @Test(priority=4)
  public void division() {
	  int div=n1/n2;
	  Assert.assertEquals(div, 2);
  }
}
