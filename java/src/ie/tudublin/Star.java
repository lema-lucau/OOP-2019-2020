package ie.tudublin;

import processing.data.TableRow;

public class Star
{
    private boolean hab;
    private String displayName;
    private float distance;
    private float xG;
    private float yG;
    private float zG;
    private float absMag;
    
    public void setHab(boolean hab)
    {
        this.hab = hab;
    }

    public boolean getHab()
    {
        return hab;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getxG() {
        return xG;
    }

    public void setxG(float xG) {
        this.xG = xG;
    }

    public float getyG() {
        return yG;
    }

    public void setyG(float yG) {
        this.yG = yG;
    }

    public float getzG() {
        return zG;
    }

    public void setzG(float zG) {
        this.zG = zG;
    }

    public float getAbsMag() {
        return absMag;
    }

    public void setAbsMag(float absMag) {
        this.absMag = absMag;
    }

    // Converts the object to a string for logging etc
    public String toString()
    {
        return displayName + "\t" + hab + "\t" 
            + xG + "\t" + yG + "\t" + zG + "\t" + absMag; 
    }

    public Star(String displayName
        , boolean hab, float xG, float yG, float zG, float distance
        , float absMag
        )
    {
        this.displayName = displayName;
        this.xG = xG;
        this.yG = yG;
        this.zG = zG;
        this.distance = distance;
        this.absMag = absMag;        
    }

    // Default constructor
    // Chain to the other constructor
    // If no default constructor, Java will make one for u
    // Once you add a constructor, you dont get the 
    // default one for free
    public Star()
    {
        this("", false, 0, 0, 0, 0, 0);
    }

    public Star(TableRow tr)
    {
        this(
            tr.getString("Display Name")
            , tr.getInt("Hab?") == 1
            , tr.getFloat("Xg")
            , tr.getFloat("Yg")
            , tr.getFloat("Zg")
            , tr.getFloat("Distance")
            , tr.getFloat("AbsMag")
        );
    }


    
}