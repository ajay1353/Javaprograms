package com.wareenPkwy.inputOutputpack;


import java.io.FileInputStream;
import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;


public class ReadStringToChar
{
	int i = 0;
	char c;

	public void readCharFilter()

	{

		final Reader r = new StringReader("Ajay");
		final FilterReader fr = new FilterReader(r)
		{};


		try
		{
			while ((i = fr.read()) != -1)
			{
				c = (char) i;
				System.out.println("character read is : " + c);
			}
		}
		catch (final IOException e)
		{

			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
				r.close();
			}
			catch (final IOException e)
			{
				e.printStackTrace();
			}

		}
	}

	public void readCharString()
	{
		final StringReader sr = new StringReader("vijay");



		try
		{
			while ((i = sr.read()) != -1)
			{
				c = (char) i;
				System.out.println("character read is : " + c);
			}
		}
		catch (final IOException e)
		{

			e.printStackTrace();
		}
		finally
		{
			sr.close();

		}
	}

	public void readCharInputStream()
	{
		FileInputStream fis = null;
		InputStreamReader isr = null;

		try
		{
			fis = new FileInputStream("C:\\Users\\Ajay Krishna K\\Desktop\\Jdbc.txt");
			isr = new InputStreamReader(fis);
			/*
			 * FileReader fr=new FileReader("D:\\testout.txt"); BufferedReader br=new BufferedReader(fr); for buffered
			 * Reader
			 */

			while ((i = isr.read()) != -1)
			{
				c = (char) i;
				System.out.print(c);
			}
		}
		catch (final IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
