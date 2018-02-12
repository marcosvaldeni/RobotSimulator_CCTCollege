import processing.core.PApplet;
public class Index extends PApplet{

	Robot allice;
	Robot bob;
	Robot charle;

	public static void main(String[] args){
		PApplet.main("Index");
	}

	public void settings(){
		size(500,500);
	}

	public void setup(){
		bob = new Robot(this,"Bob", color(255,0,0), 2.0f);
		allice = new Robot(this,"Allice", color(0,255,0), 5.0f);
		charle = new Robot(this,"Charle", color(0,0,255), 1.0f);
		System.out.println("The Bob's localization is A = (205, 175), B = (229, 215), C = (317, 155)  ");
	}

	public void draw(){
		background(255);
		bob.random();
		//allice.patrol();
		//charle.keyPressed();
	}
}