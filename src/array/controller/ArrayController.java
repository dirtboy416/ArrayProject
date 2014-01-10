package array.controller;

import array.model.Cookie;

public class ArrayController
{
	private int [][] randomNumbers;
	private Cookie [][] CookieTypes;
	private String [][] CookieNames;
	
	
	public ArrayController()
	{
		randomNumbers = new int [5][3];
		CookieTypes = new Cookie [6][4];
		CookieNames = new String [4][4];
	}

	
	public int[][] getRandomNumbers()
	{
		return randomNumbers;
	}


	public Cookie[][] getCookieTypes()
	{
		return CookieTypes;
	}


	public String[][] getCookieNames()
	{
		return CookieNames;
	}


	public void setRandomNumbers(int[][] randomNumbers)
	{
		this.randomNumbers = randomNumbers;
	}


	public void setCookieTypes(Cookie[][] cookieTypes)
	{
		this.CookieTypes = cookieTypes;
	}


	public void setCookieNames(String[][] CookieNames)
	{
		this.CookieNames = CookieNames;
	}


	public void start()
	{
		
	}
	
}