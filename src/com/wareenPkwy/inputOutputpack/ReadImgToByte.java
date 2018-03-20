package com.wareenPkwy.inputOutputpack;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;


public class ReadImgToByte
{
	public void streamInputFile()
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("C:\\Users\\Ajay Krishna K\\Desktop\\Jdbc.txt");
			int i = 0;
			while ((i = fis.read()) != -1)
			{
				System.out.print((char) i);
			}
		}
		catch (final IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fis.close();
			}
			catch (final IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void streamInputFilter()
	{
		InputStream is = null;
		FilterInputStream fis1 = null;
		try
		{
			is = new FileInputStream("C:\\Users\\Ajay Krishna K\\Desktop\\Jdbc.txt");
			fis1 = new BufferedInputStream(is);
			int i = 0;
			while ((i = fis1.read()) != -1)
			{
				System.out.print((char) i);
			}
		}
		catch (final IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
