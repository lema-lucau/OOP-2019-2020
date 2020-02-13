package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		colorMode(HSB);
	}

	
	public void keyPressed()
	{

	}	


	public void draw()
	{	
		// background(0);

		// stroke(255);
		// line(10, 10, 100, 10);
		// line(10, 20, 100, 20);
		// line(10, 30, 100, 30);
		// line(10, 40, 100, 40);

		// for(int y = 10; y <= 40; y += 10)
		// {
		// 	line(200, y, 300, y);
		// }

		// int yy = 0;

		// while(yy <= 40)
		// {
		// 	line(200, yy, 300, yy);
		// 	yy += 10;
		// }

		/*
		int i = 0;
		
		while(i < 10)
		{
			i++;
		}

		for (int j = 0; j < 100; j++)
		{

		}
		*/

		// background(240);
		// stroke(0);

		//Lines to center
		// int x1 = 0;
		// int y1 = 0;
		// int x2 = 250;
		// int y2 = 250;
		// int count = 0;

		// while(count != 2020)
		// {
		// 	if(count <= 500)
		// 	{
		// 		line(x1, y1, x2, y2);
		// 		y1 += 10;
		// 	}

		// 	if(count > 500 && count <= 1000)
		// 	{
		// 		line(x1, y1, x2, y2);
		// 		x1 += 10;
		// 	}

		// 	if(count > 1000 && count <= 1510)
		// 	{
		// 		line(x1, y1, x2, y2);
		// 		y1 -= 10;
		// 	}

		// 	if(count > 1510 && count <= 2020)
		// 	{
		// 		line(x1, y1, x2, y2);
		// 		x1 -= 10;
		// 	}

		// 	count += 10;
		// }

		//Connected circles
		// int count = 0;
		// int x1 = 25;
		// int y1 = 250;
		
		// while(count != 10)
		// {
		// 	if(count <= 10)
		// 	{
		// 		fill(20,25,250);
		// 		circle(x1, y1, 50);
		// 		x1 += 50;
		// 	}
			
		// 	count += 1;
		// }

		//Rainbow lines
		// int count = 0;
		// int x = 0;
		// int y = 0;
		
		// while(count != 10)
		// {
		// 	noStroke();
		// 	fill(y, 10000, 1000);
		// 	rect(x, 0, 50, 500);
			
		// 	x += 50;
		// 	y += 20;
		// 	count += 1;
		// }

		//Rainbow circles
		// background(255);

		// int count = 0;
		// int x1 = 25;
		// int y1 = 250;
		// int b = 0;
		
		// while(count != 10)
		// {
		// 	noStroke();
		// 	fill(b, 10000, 1000);
		// 	circle(x1, y1, 50);
		// 	x1 += 50;
		// 	b += 20;
			
		// 	count += 1;
		// }

		//Grid
		int count = 0;
		int x1 = 50;
		int y1 = 50;
		int x2 = 450;
		int y2 = 450;
		
		background(255);
		
		while(count != 20)
		{
			if(count <= 10)
			{
				stroke(86, 242, 7);
				line(x1, y1, x2, y1);
				y1 += 35;
			}

			if(count > 10 && count)			

			count += 1;
		}
	}
}
