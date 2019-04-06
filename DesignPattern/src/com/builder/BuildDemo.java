package com.builder;
public class BuildDemo {
  public static void main(String[] args) {
	CDBuilder cdBuilder=new CDBuilder();
	CDType cdType1=cdBuilder.buildSamsungCD();
	cdType1.showItem();
	CDType cdType2=cdBuilder.buildSonyCD();
	cdType2.showItem();
	CDType local=cdBuilder.buildLocal();
	local.showItem();
	
}
}
