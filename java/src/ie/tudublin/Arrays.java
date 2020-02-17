package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{	
	// float[] rainFall = new float[12];
	float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Nov", "Dec"};
	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i = 0; i < rainFall.length-1; i++)
		{
			println(months[i] + "\t" + rainFall[i]);
		}

		//Limited use. Cannot format the output
		for(float f:rainFall)
		{
			println(f);
		}

		for(String s:months)
		{
			println(s);
		}

		int minIndex = 0;
		int maxIndex = 0;
		float average = 0;
		float total = 0;

		for(int i = 0; i < rainFall.length; i++)
		{
			if(rainFall[minIndex] > rainFall[i])
			{
				minIndex = i;
			}

			if(rainFall[maxIndex] < rainFall[i])
			{
				maxIndex = i;
			}

			total += rainFall[i];
		}

		average = total / rainFall.length;
		
		println("Month with lowest rainfall: " + months[minIndex] + " with " + rainFall[minIndex] + " mm of rainfall");
		println("Month with highest rainfall: " + months[maxIndex] + " with " + maxIndex + " mm of rainfall");
		println("Average: " + average);
	}

	float offset = 0;

	public void drawBarChart()
	{
		// float x_axis_x1 = 50;
		// float x_axis_y1 = 450;

		// float x_axis_x2 = 450;
		// float x_axis_y2 = 450;

		// float y_axis_x1 = 50;
		// float y_axis_y1 = 50;

		// float y_axis_x2 = 50;
		// float y_axis_y2 = 450;

		// stroke(255);
		// line(x_axis_x1, x_axis_y1, x_axis_x2, x_axis_y2);
		// line(y_axis_x1, y_axis_y1, y_axis_x2, y_axis_y2);

		//Draw bars
		// float x = 50;
		// float y = 450;
		// float h = 0;
		float w = width / (float) rainFall.length;
		float cGap = 255 /(float) rainFall.length;

		colorMode(HSB);
		for(int i = 0; i < rainFall.length; i++)
		{
			// h = rainFall[i];
			// fill(50,255,255);
			// rect(x, y, w, -h);
			// x += 30;

			float x = i * w;
			fill(i * cGap,255,255);
			rect(x, height, w, -rainFall[i] * 2);
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
		drawBarChart();
	}
}
