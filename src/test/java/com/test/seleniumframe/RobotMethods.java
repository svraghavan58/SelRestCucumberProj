package com.test.seleniumframe;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class RobotMethods extends BrowserMethods{

	public void keyDown(int keys)
	{
		try
		{
		Robot robot=new Robot();
		robot.keyPress(keys);
		//robot.keyPress(KeyEvent.VK_CONTROL);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void keyUp(int keys)
	{
		try
		{
		Robot robot=new Robot();
		robot.keyRelease(keys);
		//robot.keyPress(KeyEvent.VK_CONTROL);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void mousePress(int keys)
	{
		try
		{
			Robot robot=new Robot();
			robot.mousePress(keys);
			//robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	public void mouseRelease(int keys)
	{
		try
		{
			Robot robot=new Robot();
			robot.mouseRelease(keys);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	public void mouseMove(int x,int y)
	{
	try
	{
		Robot robot=new Robot();
		robot.mouseMove(x,y);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	public void mouseWheel(int x)
	{
		try
		{
			Robot robot=new Robot();
			robot.mouseWheel(x);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void getScreenshot(String fileName)
	{
		try
		{
		Robot robot=new Robot();
		Rectangle rect=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage img=robot.createScreenCapture(rect);
		ImageIO.write(img,"jpeg" ,new File(fileName));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void uplocadFile(String value)
	{
		try
		{
			Robot robot=new Robot();
			Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
			StringSelection sel=new StringSelection(value);
			clipboard.setContents(sel,null);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
