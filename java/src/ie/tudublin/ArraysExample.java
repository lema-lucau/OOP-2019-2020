package ie.tudublin;

import java.util.Arrays; 
import java.util.Collections; 

import processing.core.PApplet;

public class ArraysExample extends PApplet
{	

	//float[] rainFall = new float[12]; 
	float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i = 0 ; i < rainFall.length; i ++)
		{
			println(months[i] + "\t" + rainFall[i]);
		}

		for(float f:rainFall)
		{
			println(f);
		}

		for(String s:months)
		{
			println(s);
		}

		int minIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] < rainFall[minIndex])
			{
				minIndex = i;
			}
		}
		println(months[minIndex] + " had the minimum rainfall of " + rainFall[minIndex]);
		
		int maxIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] > rainFall[maxIndex])
			{
				maxIndex = i;
			}
		}
		println(months[maxIndex] + " had the maximum rainfall of " + rainFall[maxIndex]);

		// You can also calculate the minimum and max of an arry this way:
		// Note the array is of type Float not float
		// Float are objects float is a primitive type
		Float[] floatArray = {10.0f, 5.0f, 20.0f};
		float min = Collections.min(Arrays.asList(floatArray)); 
        float max = Collections.max(Arrays.asList(floatArray));
	}

	void drawBarChart()
	{
		float w = width / (float) rainFall.length;
		float cGap = 255 / (float) rainFall.length;
		noStroke();
		colorMode(HSB);
		for(int i = 0 ; i < rainFall.length ; i ++)
		{
			float x = i * w;
			fill(i * cGap, 255, 255);
			rect(x, height, w, -rainFall[i]);
		}
	}

	void drawLineGraph()
	{
		// float gapNum = 10f;
		// float gapMon = 35f;

		// int x_axis_x1 = 40;
		// int x_axis_x2 = 460;
		// int x_axis_y1 = 450;
		// int x_axis_y2 = 450;

		// int y_axis_x1 = 40;
		// int y_axis_x2 = 40;
		// int y_axis_y1 = 20;
		// int y_axis_y2 = 450;

		// //Draw x and y axis
		// stroke(255);
		// line(x_axis_x1, x_axis_y1, x_axis_x2, x_axis_y2);
		// line(y_axis_x1, y_axis_y1, y_axis_x2, y_axis_y2);

		// //Map x and y axis
		// for(int i = 0; i < 150; i++)
		// {
		// 	float x = map(i, 0, 150, gapNum, width -gapNum);				
		// 	line(gapNum, x, width - gapNum, x);
		// 	fill(255);
		// 	text(i, x, gapNum / 2);

		// }

		float border = width * 0.1f;

		textAlign(CENTER,CENTER);
		stroke(255);
		fill(255);
		line(border, border, border, height - border);

		for(int ya = 0; ya <= 150; ya+= 10 )
		{
			float y = map(ya,0,150,height - border, border);
			line(border, y, border - 5, y);
			text(ya,border / 2, y);
		}

		line(border, height - border, width - height, height - border);
		for(int i = 0; i < months.length - 1; i++ )
		{
			float x = map(i,0,months.length - 1, border, width-border);
			line(x, height - border, x, height+(border + 5));
			text(months[i],x,height - border/2);
		}

		for(int i = 0; i < rainFall.length - 1; i++)
		{
			float x1 = map(i,0,months.length-1,border,width-border);
			float x2 = map(i+1,0,months.length-1,border,width-border);
			
			float y1 = map(rainFall[i],0,150,height-border,border);
			float y2 = map(rainFall[i+1],0,150,height-border,border);

			line(x1,x2,y1,y2);
		}
	}

	void drawPieChart() 
	{
		fill(255);
		stroke(0);

		float percentage = 0f;
		float total = 0f;
		int colourNum = 0;

		for(int i = 0; i < rainFall.length; i++)
		{
			total += rainFall[i];
		}

		for(int i = 0; i < rainFall.length; i++)
		{
			fill(colourNum);
			percentage = rainFall[i] / total;
			arc(250,250,100,100,PI / rainFall.length-,PI * percentage);
			colourNum += 30;
		}
	}

	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	

	public void draw()
	{	
		background(0);		
		colorMode(HSB);	

		//drawLineGraph();
		drawPieChart();
	}
}
