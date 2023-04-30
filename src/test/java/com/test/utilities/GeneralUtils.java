package com.test.utilities;

import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;


public class GeneralUtils {
	
	public void getBrokenLinks(String linkName)
	{
		try
		{
			URL url=new URL(linkName);
			HttpURLConnection hc=(HttpURLConnection) url.openConnection();
			hc.setConnectTimeout(5000);
			hc.connect();
			hc.getResponseMessage();
			hc.getResponseCode();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void getBrokenImage(String imgName)
	{
		try
		{
			HttpClient client=HttpClientBuilder.create().build();
			HttpGet request=new HttpGet(imgName);
			HttpResponse response=client.execute(request);
			response.getStatusLine().getStatusCode();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void getLocalTime()
	{
		try
		{
			DateTimeFormatter df=DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
			LocalDateTime now= LocalDateTime.now();
			df.format(now);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void addMinutes()
	{
		try
		{
			String s="09:30";
			SimpleDateFormat sd=new SimpleDateFormat("HH:mm");
			Date d=sd.parse(s);
			Calendar cal=Calendar.getInstance();
			cal.setTime(d);
			cal.add(Calendar.MINUTE, 30);
			sd.format(cal.getTime());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
