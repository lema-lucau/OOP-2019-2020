package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
    public float playerX;
    public float playerY;
    public float playerWidth;

    public float bugX;
    public float bugY;
    public float bugWidth;
    public float bugHeight;

    public int score = 0;

    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        playerX = 250;
        playerY = 450;
        playerWidth = 100;

        bugX = 50;
        bugY = 50;
        bugWidth = 20;
        bugHeight = 20;
    }

    void drawPlayer(float x, float y, float w)
    {
        line(x, y, x, y + 30);
        stroke(82,252,3);
    }

    void drawBug(float x, float y, float w, float h)
    {
        if((frameCount % 1) == 0)
        {
            ellipse(random(x,450), y,  w, h);
            fill(15, 81, 240);            
        }
    }

    void drawScore(int score, float x, float y)
    {
        textSize(14);
        text("Score: " + score, x, y);
        fill(255,255,255);
    }

    public void keyPressed()
    {
        if(keyCode == LEFT)
        {
            playerX = playerX - 10;
            System.out.println("LEFT arrow pressed");
        }

        if(keyCode == RIGHT)
        {
            playerX = playerX + 10;
            System.out.println("RIGHT arrow pressed");
        }

        if(keyCode == ' ')
        {
            stroke(32, 201, 199); 
            line(playerX, playerY, playerX, playerY -500);   
            System.out.println("SPACE key pressed");
        }
    }

    public void draw()
    {
        background(0);
        drawPlayer(playerX, playerY, playerWidth);
        drawBug(bugX, bugY++, bugWidth, bugHeight);
        drawScore(score++, 50, 50);
    }

}
