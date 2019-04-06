package com.builder;
public class CDBuilder {
   public CDType buildSonyCD()
   {
	   CDType cds=new CDType();
	   cds.addItem(new Sony());
	   return cds;
   }
   public CDType buildSamsungCD()
   {
	   CDType cds=new CDType();
	   cds.addItem(new Samsung());
	   return cds;
   }
   public CDType buildLocal()
   {
	   CDType cds=new CDType();
	   cds.addItem(new Local());
	   return cds;
   }
}
