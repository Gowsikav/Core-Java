package com.xworkz.modifier.internal;

public class God
{
      public God()
      {
          System.out.println("God constructor");
      }
      public void puja()
      {
          System.out.println("running in puja method");
          Temple temple=new Temple();
          temple.open();
          temple.display();
      }
}
