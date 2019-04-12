package com.builder.two;
import java.util.ArrayList;
import java.util.List;

public class OrderedItem {
	List<Item>itemList=new ArrayList();
    public void addItem(Item item)
    {
    	itemList.add(item);
    }
    public int getPrice()
    {
    	int cost=0;
    	for(Item it:itemList)
    	{
    		cost+=it.price();
    	}
    	return cost;
    }
    public void showItem()
    {
    	itemList.forEach((x)->{
    		System.out.println(x.name());
    		System.out.println(x.size());
    		System.out.println(x.price());
    	});
    }
}
