package com.builder.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderedBuilder {
	public OrderedItem preparePizza() throws NumberFormatException, IOException {

		OrderedItem itemOrder = new OrderedItem();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the choice of Pizza");
		System.out.println("==================================================");
		System.out.println(" 1. Veg Pizza    ");
		System.out.println(" 2. Non-Veg      ");
		System.out.println(" 3. Exit");
		System.out.println("===================================================");
		int choiceOfpizza = Integer.parseInt(br.readLine());
		switch (choiceOfpizza) {
		case 1: {
			   System.out.println("You ordered Veg-Pizza");
			   System.out.println("\n\n");
			   System.out.println("  1.  Cheeze Pizza    ");
			   System.out.println("  2.  Onion Pizza     ");
			   System.out.println("  3.  Masala Pizza     ");
			   System.out.println("  4.  Exit    ");
			   int typeOfPizza=Integer.parseInt(br.readLine());
			   switch(typeOfPizza)
			   {
			   case 1:{
				    System.out.println("You have ordered Cheez Pizza");
				    
				    System.out.println("-------------------------------");
				    System.out.println(" 1. Small cheez pizza");
				    System.out.println(" 2. Medium cheez pizza");
				    System.out.println(" 1. Large cheez pizza");
				    System.out.println(" 2. Extra Large cheez pizza");
                    int typeOfCheezPizza=Integer.parseInt(br.readLine());
                    switch(typeOfCheezPizza)
                    {
                    case 1:{
                    	    itemOrder.addItem(new SmallCheezPizza());
                    	    break;
                    }
                    case 2:{
                    	    itemOrder.addItem(new MediumCheezPizza());
                    	    break;
                    }
                    case 3:
                    {
                    	    itemOrder.addItem(new LargeCheezPizza());
                    	    break;
                    	
                    }
                    case 4:
                    {
                    	   itemOrder.addItem(new ExtraLargeCheesePizza());
                    	   break;
                    }
                    }
			   }
			   case 2:{
				    System.out.println("You have ordered Onion Pizza");
				    
				    System.out.println("-------------------------------");
				    System.out.println(" 1. Small Onion pizza");
				    System.out.println(" 2. Medium Onion pizza");
				    System.out.println(" 1. Large Onion pizza");
				    System.out.println(" 2. Extra Onion cheez pizza");
				    int typeOfOnionPizaa=Integer.parseInt(br.readLine());
				    switch(typeOfOnionPizaa)
				    {
				    case 1:{
				    	itemOrder.addItem(new SmallOnionPizza());
				    	break;
				    }
				    case 2:{
				    	itemOrder.addItem(new MediumOnionPizza());
				    	break;
				    }
				    case 3:{
				    	itemOrder.addItem(new LargeOnionPizza());
				    	break;
				    }
				    case 4:{
				    	itemOrder.addItem(new ExtraLargeOnionPizza());
				    	break;
				    }
				    }
				   
			   }
			   case 3:{
				   System.out.println("You have ordered Masala Pizza");
				    
				    System.out.println("-------------------------------");
				    System.out.println(" 1. Small Masala pizza");
				    System.out.println(" 2. Medium Masala pizza");
				    System.out.println(" 3. Large Masala pizza");
				    System.out.println(" 4. Extra Masala cheez pizza");
				    int typeOfMasalaPizza=Integer.parseInt(br.readLine());
				    switch(typeOfMasalaPizza)
				    {
				    case 1:
				    {
				    	itemOrder.addItem(new SmallMasalaPizza());
				    	break;
				    }
				    case 2:{
				    	itemOrder.addItem(new MediumMasalaPizza());
				       break;
				    }
				    case 3:
				    {
				    	itemOrder.addItem(new LargeMasalaPizza());
				     break;	
				    }
				    case 4:{
				    	itemOrder.addItem(new ExtraLargeMasalaPizza());
				    	break;
				    }
				    }
			   }
			   case 4:{
				   break;
			   }
			   }
		}
		case 2:{
			   System.out.println("  You have ordered Non Veg Pizza   ");
			   System.out.println("\n\n");
			   System.out.println(" 1. Small Non-Veg Pizza  ");
			   System.out.println(" 2. Medium Non-Veg Pizza  ");
			   System.out.println(" 3. Large Non-Veg Pizza  ");
			   System.out.println(" 4. Extra Large Non-Veg Pizza  ");
			   int nonVegPizza=Integer.parseInt(br.readLine());
			   switch(nonVegPizza)
			   {
			   case 1: itemOrder.addItem(new SmallNonVegPizza());
			           break;
			   case 2: itemOrder.addItem(new MediumNonVegPizza());
			   		   break;
			   case 3: itemOrder.addItem(new LargeNonVegPizza());
			   		   break;
			   case 4: itemOrder.addItem(new ExtraLargeNonVegPizza());
			   		   break;
			   }
			   break;
			}
		case 3:{
			   break;
		}
		default:{
			break;
		}
		}
		System.out.println("Enter the choice of ColdDrink");
		System.out.println("=============================================");
        System.out.println("1. Pepsi");
        System.out.println("2. Coke");
        System.out.println("3.  Exit");
        System.out.println("==============================================");
        int coldDrink=Integer.parseInt(br.readLine());
        switch(coldDrink)
        {
        case 1:{
        	System.out.println("You have ordered pepsi");
        	System.out.println("Enter the size of pepsi");
        	System.out.println("-------------------------------------------");
        	System.out.println("1. Small Pepsi");
        	System.out.println("2. Medium Pepsi");
        	System.out.println("3. Large Pepsi");
        	System.out.println("4. Extra Large Pepsi");
        	System.out.println("Enter your choice ");
        	int sizeOfPepsi=Integer.parseInt(br.readLine());
        	switch(sizeOfPepsi)
        	{
        	case 1:{
        		  itemOrder.addItem(new SmallPepsi());
        		break;
        	}
        	case 2:{
        		itemOrder.addItem(new MediumPepsi());
        	    break;	
        	 }
        	case 3:
        	{
        		itemOrder.addItem(new LargePepsi());
        		break;
        	}
        	case 4:{
        		itemOrder.addItem(new ExtraLargePepsi());
        		break;
        	}
        	
        	}
        }
        case 2:{
        	System.out.println("You have ordered Coke");
        	System.out.println("Enter the size of coke");
        	System.out.println("-------------------------------------------");
        	System.out.println("1. Small Coke");
        	System.out.println("2. Medium Coke");
        	System.out.println("3. Large Coke");
        	System.out.println("Enter your choice");
            int cokeOption=Integer.parseInt(br.readLine());
            switch(cokeOption)
            {
            case 1:{
            	itemOrder.addItem(new SmallCoke());
            	break;
            	}
            case 2:{
            	itemOrder.addItem(new MediumCoke());
            	break;
            }
            case 3:{
            	itemOrder.addItem(new LargeCoke());
            	break;}
            }
         }
        }
		return itemOrder;
	}

}
