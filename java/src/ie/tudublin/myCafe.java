package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class myCafe extends PApplet
{
    ArrayList<myProduct> products = new ArrayList<myProduct>();
    ArrayList<myProduct> bill = new ArrayList<myProduct>();
    

    public void loadData() {
        Table t = loadTable("cafe.csv", "header");

        for(TableRow tr:t.rows()) {
            myProduct p = new myProduct(tr);
            products.add(p);
        }
    }

    public void printProducts() {
        for(myProduct p:products) {
            System.out.println(p);
        }
    }

    public void displayProducts() {
        float border = height * 0.10f;

        line(width/2, border, width/2, height - border);


        fill(255);
        float rectWidth = (width/2) - 100;
        float rectHeight = ((height - border) / products.size()) * 0.8f;
        float y = rectHeight;
        

        for(int i = 0 ; i < products.size() ; i++)
        {
            myProduct p = products.get(i);

            rect(border/2, y, rectWidth, rectHeight);
            fill(0);
            textSize(16);

            textAlign(LEFT,CENTER);
            text(p.getName(), (border/2) + 10, y + (rectHeight/2));

            textAlign(RIGHT,CENTER);
            text(nf(p.getPrice(),0,2), ((border/2) + rectWidth) - 10, y + (rectHeight/2));

            y += rectHeight + 10;
            fill(255);
        }
    }

    public void drawBill()
    {
        float border = height * 0.10f;

        float billWidth = (width/2) - border ;
        float billHeight = height - (border * 2);

        fill(255);
        rect((width/2) + border/2, border, billWidth, billHeight);

        fill(0);
        textSize(14);
        text("Your Bill", (width/2) + (border) + billWidth/2, border + 10 );


        float total = 0; 

        for(int i = 0 ; i < bill.size() ; i++)
        {
            myProduct b = bill.get(i);
            float y = map(i, 0, bill.size(), border + 30, billHeight + 20);
            total += b.getPrice(); 

            fill(0);
            textSize(14);

            //display bill
            text(b.getName(), (width/2) + (border - 10) + textWidth(b.getName()), y);

            text(nf(b.getPrice(),0,2), (width/2) + (border) + (billWidth - (billWidth * 0.20f)) , y);
        }

        text("Total:", (width/2) + (border - 10) + textWidth("Total:"), billHeight + 30);
        text(nf(total,0,2), (width/2) + (border) + (billWidth - (billWidth * 0.20f)) , billHeight + 30);
    }

    public void mousePressed()
    {
        float border = height * 0.10f;
        float rectWidth = (width/2) - 100;
        float rectHeight = ((height - border) / products.size()) * 0.8f;

        for(int i = 0 ; i < products.size() ; i ++)
        {
            float y = map(i, 0, products.size(), border, height - border);
            if (mouseX > border/2 && mouseX < (border/2) + rectWidth
                && mouseY > y && mouseY < y + rectHeight                
                )
                {
                    bill.add(products.get(i));
                    break;
                }

        }
    }

    public void settings()
    {
        size(800, 600);
    }


    public void draw()
    {
        displayProducts();
        drawBill();
    }

    public void setup()
    {
        loadData();
        printProducts();

        float border = height * 0.10f;
        String s = "Cafe Rubis Till System";

        fill(0);
        textSize(26);
        text(s, (width/2) - (textWidth(s) / 2), border/2);
    }
}