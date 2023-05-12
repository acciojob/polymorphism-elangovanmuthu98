package com.driver;

public class Main {
  public static void main(String args[])
  {
    Product p=new Product();
    int a=p.product(3,5);
   int b=p.product(3,4,5);
    double c=p.product(4.56,5.56);
  }

}
class Product
{
  public int product(int x, int y) {}
  public int product(int x, int y, int z) {}
  public double product(double x, double y) {}
}
  
