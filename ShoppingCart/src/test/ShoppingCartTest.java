package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import main.Book;
import main.ShoppingCart;

public class ShoppingCartTest {
	ShoppingCart cart;
	static Book java;
	static Book web;
	
	@BeforeClass
	public static void setUpFirst() throws Exception{
		java= new Book("Java Book",127);
	    web= new Book("Web design Book",100);
	}
	
	@Before
	public void setUp() throws Exception {
		cart= new ShoppingCart();
	}

	@Test
	public void testEmpty() {
		assertEquals(0,cart.getCount());
		assertTrue(0==cart.getPrice());
	}
    
	@Test
	public void testAdd1()
	{
		cart.add(java);
		assertEquals(1,cart.getCount());
		assertTrue(127==cart.getPrice());
	}
	
	@Test
	public void testAdd2()
	{
		cart= new ShoppingCart();
		cart.add(java);
		cart.add(web);
		assertEquals(2,cart.getCount());
		assertTrue(227==cart.getPrice());
	}
	
	@Test
	public void testAddGeneral()
	{
		// the code ia already general, it's just an additional case (not necessary)
		cart= new ShoppingCart();
		cart.add(java);
		cart.add(web);
		Book other= new Book("Rahaf",250);
		cart.add(other);
		assertEquals(3,cart.getCount());
		assertTrue(477==cart.getPrice());
	}
	
	@Test
	public void testRemove1()
	{
		cart.add(java);
		cart.add(web);
		cart.remove("java book");
		assertEquals(1,cart.getCount());
		assertTrue(100==cart.getPrice());
	}
	
	@Test
	public void testRemove2()
	{
		cart.add(java);
		cart.add(web);
		cart.remove("java book");
		cart.remove("web design book");
		assertEquals(0,cart.getCount());
		assertTrue(0==cart.getPrice());
	}
}


