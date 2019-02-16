package main;

public class Book {

   private String name;
   private float price;
   
   public Book(String bookName, float bookPrice)
	{
		name=bookName;
		price = bookPrice;
	}
   
   Book(String bookName)
	{
       this(bookName,0);
	}
   
   Book(float bookPrice)
	{
       this("",bookPrice);
	}
   
   Book()
	{
		this("",0);
	}
   public void setName(String bookName)
   {
	   name=bookName;
   }
   
   public void setPrice(float bookPrice)
   {
	   price=bookPrice;
   }
   
   public String getName()
   {
	   return name;
   }
   public float getPrice()
   {
	   return price;
   }
}
