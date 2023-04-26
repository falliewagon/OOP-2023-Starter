package ie.tudublin;

import java.lang.reflect.Array;
import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet{

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

		//sonnet = loadFile();
	}

	public void keyPressed() {
		if (key == ' ') 
		{

		}

	}

	/* 

	public void loadFile()
	{
		String[] words = loadStrings("small.txt");
		int count = 0;
		for (String line : words) {
			String[] splitLine = split(line, " ");
			for (String word : splitLine) {
				count = count + 1;
			}
		}
	}

	*/

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);


		//loadFile();
	}
}
