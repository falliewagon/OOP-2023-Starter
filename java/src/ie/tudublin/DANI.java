package ie.tudublin;

import java.lang.reflect.Array;
import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet{

public class Follow {
	String word;
	int count = 1;

	public Follow(String word) {
		this.word = word;
	}

	public void incrementCount() {
		this.count++;
	}

	public String getWord() {
		return this.word;
	}

	public int getCount() {
		return this.count;
	}

	public String toString() {
		return this.word + "(" + this.count + ")";
	}
}

class Word {

}

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

    	loadFile();
	}

	public void loadFile()
	{
		sonnet = loadStrings("shakespeare.txt");
	}

	public void keyPressed() {
		if (key == ' ') 
		{

		}

	}

	//End Code

	float off = 0;

	String word = "Test";

	ArrayList<Follow> Follow = new ArrayList<>();

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
	}
}
