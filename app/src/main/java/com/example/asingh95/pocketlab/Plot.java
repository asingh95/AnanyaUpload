package com.example.asingh95.pocketlab;

import processing.core.*;

/**
 * Created by asingh95 on 3/8/2016.
 */
public class Plot extends PApplet {

    int i;
    float init;

    public void settings()
    {
        size(1000,1000);
    }

    public void setup()
    {
        background(2, 142, 151);
        GetData();
    }

    public void draw()
    {

    }

    void GetData()
    {
        String lines[] = loadStrings("data.csv");

        for (int i = 0; i < lines.length; i++)
        {
            String[] lineparts = lines[i].split(",");

            float xnum = Float.parseFloat(lineparts[0]);
            float ynum = Float.parseFloat(lineparts[1]);

            if (i == 0)
            {
                init = ynum;
                System.out.println(init);
            }
        }
    }
}
