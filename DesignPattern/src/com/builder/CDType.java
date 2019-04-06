package com.builder;
import java.util.ArrayList;
import java.util.List;

public class CDType {
   private List<Packing>item=new ArrayList();
   public void addItem(Packing pack)
   {
	   item.add(pack);
   }
   public void getCost()
   {
	   for(Packing pack:item)
	   {
		   pack.price();
	   }
   }
   
   public void showItem()
   {
	  for(Packing pk:item)
	  {
		  System.out.println("CD Name: "+pk.pack());
		  System.out.println("Price: "+pk.price());
	  }
   }

}
