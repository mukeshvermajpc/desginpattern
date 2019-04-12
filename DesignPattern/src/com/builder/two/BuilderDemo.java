package com.builder.two;

import java.io.IOException;

public class BuilderDemo {
   public static void main(String args[]) throws NumberFormatException, IOException
   {
	   OrderedBuilder builder=new OrderedBuilder();
	   OrderedItem orderedItem=builder.preparePizza();
	   orderedItem.showItem();
	   System.out.println("\n");
	   System.out.println("Total price: "+orderedItem.getPrice());  
   }
}
