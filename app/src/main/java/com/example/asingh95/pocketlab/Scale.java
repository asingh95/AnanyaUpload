package com.example.asingh95.pocketlab;

import processing.core.PApplet;

/**
 * Created by asingh95 on 3/8/2016.
 */
public class Scale extends PApplet{

    int j = 0;
    int degree = 95;

    @Override
    public void settings()
    {
        size(1000,1280);
    }

    @Override
    public void setup()
    {
        background(200);
        thermoScale();
       // font = loadFont("ArialNarrow-Bold-32.vlw");
       // textFont(font);
        drawTempMarker();
    }

    @Override
    public void draw()
    {
        int marker;
        temperature0();
        marker = degree*5;
        if(j<marker)
        {
            temperatureInc(j);
            j++;
        }//if
    }

    void thermoScale()
    {
        noStroke();
        fill(255);
        rect(440, 225, 120, 700);

        noStroke();
        fill(0, 0,255);
        // noFill();
        ellipse(500, 925, 225, 225);
    }//thermoScale()

    void temperature0()
    {
        noStroke();
        fill(0,0,255);
        rect(440, 810, 120, 25);
    }//temperature0()

    void temperatureInc(int i)
    {
        noStroke();
        fill(i,0,(255-i));
        rect(440, (810 - (i-1)), 120, 25);
    }//temperatureInc()

    void drawTempMarker()
    {
        //textAlign(RIGHT);
        //textSize(24);
        //fill(255,255,73);
        //text("Farenheit", 150, 125);

        for(int a = 0; a < 6; a++)
        {
            strokeWeight(4);
            stroke(0);
            line(440, 810-(a*100), 410, 810-(a*100));
            //line(270, 340-(a*40), 285, 340-(a*40));

            //textAlign(RIGHT);
            //textSize(14);
            //fill(0,0,255);
            //text(a*20,200, 340-(a*40));

            //textAlign(LEFT);
            //textSize(14);
            //fill(0,0,255);
            //celcius = ceil(((a*20)-32)*(5/9));
           // text(celcius,300, 340-(a*40));
        }//for

        for(int a = 0; a < 5; a++)
        {
            strokeWeight(2);
            stroke(0);
            line(440, 760-(a*100), 420, 760-(a*100));
            //textAlign(RIGHT);
            //textSize(10);
           // fill(0);
            //text((a*20)+10,210, 320-(a*40));
        }//for

        for(int a = 0; a <10; a++)
        {
            strokeWeight(1);
            stroke(0);
            line(440, 785-(a*50), 430, 785-(a*50));
        }//for
    }//drawTempMarker()
}
