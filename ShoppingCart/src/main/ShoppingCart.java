package main;
import java.util.ArrayList;

public class ShoppingCart {
	private int count;
	private float price;
	ArrayList<Book> list= new ArrayList<Book>();
	
	public ShoppingCart()
	{
		count=0;
		price=0;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public void add(Book toAdd)
	{
		count++;
		price+= toAdd.getPrice();
		list.add(toAdd);
	}
	
	public void remove(String bookName)
	{
		for(int i=0;i<list.size();i++)
		{
			if (list.get(i).getName().toUpperCase().equals(bookName.toUpperCase()))
			{
				count--;
				price-=list.get(i).getPrice();
				list.remove(i);
				break;
			}
		}
	}
}
