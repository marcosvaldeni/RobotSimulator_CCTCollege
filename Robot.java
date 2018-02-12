import processing.core.PApplet;
public class Robot extends PApplet{
	
	String name;
	float x;
	float y;  
	float x1;
	float y1;
	float x2;
	float y2;
	float x3;
	float y3;
	int color;
	float speed;
	PApplet parent;
	int number;
	float animationCounter;
	int direction;


	public Robot(PApplet p, String name,int color,float speed){
		parent = p;
		this.name = name;
		this.color = color;
		this.speed = speed;
		this.number = 1;
		this.animationCounter = 1;
		this.direction = round(random(1,12));
		//Bob's coordenates generater(minimum,maximun)
		this.x = round(random(50, parent.width - 50));
		this.y = round(random(50, parent.height - 50));
	}

	public void display(){ 
		parent.fill(color);
		parent.triangle(205, 175, 229, 215, 317, 155);
		parent.fill(0,0,0);
		parent.ellipse(229, 215, 3, 3);
	}

	public void patrol(){
			this.display();
		if (x > 0/**1*/ && x < parent.width - 19/**980*/ && y > 0/**1*/ && y < 21/**20*/) {
			if (x > parent.width - 21/**980*/ && x < parent.width - 19/**980*/ && y > 0/**1*/ && y < 21/**20*/) {
				this.animation();
			} else {
				this.alliceRight();
				this.goRight();
				direction = 1;
			}
			
		} else if (x > parent.width - 20/**980*/ && x <= parent.width/**1000*/ && y > 0 && y < parent.height - 19/**581*/) {
			if (x <= parent.width/**1000*/ && x > parent.width - 20/**980*/ && y < parent.height - 19/**581*/ && y > parent.height - 21/**579*/) {
				this.animation();
			
			} else {
 				this.alliceDown();
 				this.goDown();
 				direction = 2;
 			}

		} else if (x > 19 && x <= parent.width/**1000*/ && y > parent.height - 20/**480*/ && y <= parent.height) {
			if (x > 19 && x < 21 && y > parent.height - 20/**480*/ && y <= parent.height) {
				this.animation();
			
			} else {
				this.alliceLeft();
				this.goLeft();
				direction = 3;
			}

		} else if (x > 0/**1*/ && x < 21/**20*/ && y <= parent.height/**500*/ && y > 20/**21*/) {
			if (x > 0/**1*/ && x < 21/**20*/ && y > 20/**21*/ && y < (21+speed)/**21*/) {
				this.animation();
			
			} else {
				this.alliceUp();
				this.goUp();
				direction = 4;
			}

		} else if (x >= 21 && x <= parent.width - 20/**980*/ && y <= parent.height-20/**480*/ && y > 20) {
			this.alliceUp();
			this.goUp();
		}
	}
	 
	public void random(){
		this.display();
		if (x >= 1 && x <= parent.width - 20 && y >= 1 && y <= 20) {
			direction = round(random(1,12));
			y += 1;

		} else if (x >= parent.width - 19 && x <= parent.width && y >= 1 && y <= parent.height - 20) {
			direction = round(random(1,12));
			x -= 1;

		} else if (x >= 21 && x <= parent.width && y >= parent.height - 19/**481*/ && y <= parent.height) {
			direction = round(random(1,12));
			y -= 1;

		} else if (x >= 1 && x <= 20 && y <= parent.height && y >= 21) {
			direction = round(random(1,12));
			x += 1;

		}

		if (direction == 1) {
			this.bobRight();
			//this.goRight();
		} else if (direction == 2) {
			this.bobDown();
			//this.goDown();
		} else if (direction == 3) {
			this.bobLeft();
			//this.goLeft();
		} else if (direction == 4) {
			this.bobUp();
			//this.goUp();
		} else if (direction == 5) {
			this.bobRightUp();
			//this.goRight();
			//this.goUp();
		} else if (direction == 6) {
			this.bobRightDown();
			//this.goRight();
			//this.goDown();
		} else if (direction == 7) {
			this.bobLeftDown();
			//this.goLeft();
			//this.goDown();
		} else if (direction == 8) {
			this.bobLeftUp();
			//this.goLeft();
			//this.goUp();
		} else if (direction == 9) {
			this.bobRightUp();
			//this.goRight();
			//this.goUp();
		} else if (direction == 10) {
			this.bobRightDown();
			//this.goRight();
			//this.goDown();
		} else if (direction == 11) {
			this.bobLeftDown();
			//this.goLeft();
			//this.goDown();
		} else if (direction == 12) {
			this.bobLeftUp();
			//this.goLeft();
			//this.goUp();
		} 
	}

	public void charlieRight(){
		x1 = x - 5;
		y1 = y - 15;
		x2 = x + 5;
		y2 = y;
		x3 = x - 5;
		y3 = y + 15;
	}
	public void charlieLeft(){
		x1 = x + 5;
		y1 = y + 15;
		x2 = x - 5;
		y2 = y;
		x3 = x + 5;
		y3 = y - 15;
	}
	public void charlieDown(){
		x1 = x - 15;
		y1 = y - 5;
		x2 = x;
		y2 = y + 5;
		x3 = x + 15;
		y3 = y - 5;
	}
	public void charlieUp(){
		x1 = x + 15;
		y1 = y + 5;
		x2 = x;
		y2 = y - 5;
		x3 = x - 15;
		y3 = y + 5;
	}

	public void alliceRight(){
		x1 = x - 10;
		y1 = y - 10;
		x2 = x + 20;
		y2 = y;
		x3 = x - 10;
		y3 = y + 10;
	}
	public void alliceLeft(){
		x1 = x + 10;
		y1 = y + 10;
		x2 = x - 20;
		y2 = y;
		x3 = x + 10;
		y3 = y - 10;
	}
	public void alliceDown(){
		x1 = x - 10;
		y1 = y - 10;
		x2 = x;
		y2 = y + 20;
		x3 = x + 10;
		y3 = y - 10;
	}
	public void alliceUp(){
		x1 = x + 10;
		y1 = y + 10;
		x2 = x;
		y2 = y - 20;
		x3 = x - 10;
		y3 = y + 10;
	}
	
	public void bobRight(){
		x1 = x - 10;
		y1 = y - 12;
		x2 = x + 10;
		y2 = y +  0;
		x3 = x - 10;
		y3 = y + 12;
	}
	public void bobLeft(){
		x1 = x + 10;
		y1 = y + 12;
		x2 = x - 10;
		y2 = y -  0;
		x3 = x + 10;
		y3 = y - 12;
	}
	public void bobDown(){
		x1 = x - 12;
		y1 = y - 10;
		x2 = x +  0;
		y2 = y + 10;
		x3 = x + 12;
		y3 = y - 10;
	}
	public void bobUp(){
		x1 = x + 12;
		y1 = y + 10;
		x2 = x -  0;
		y2 = y - 10;
		x3 = x - 12;
		y3 = y + 10;
	}
	public void bobLeftUp(){
		x1 = x -  1.51f;
		y1 = y + 15.56f;
		x2 = x -  7.07f;
		y2 = y -  7.07f;
		x3 = x + 15.56f;
		y3 = y -  1.41f;
	}	
	public void bobRightUp(){
		x1 = x - 15.56f;
		y1 = y -  1.41f;
		x2 = x +  7.07f;
		y2 = y -  7.07f;
		x3 = x +  1.41f;
		y3 = y + 15.56f;
	}
	public void bobRightDown(){
		x1 = x +  1.41f;
		y1 = y - 15.56f;
		x2 = x +  7.07f;
		y2 = y +  7.07f;
		x3 = x - 15.56f;
		y3 = y +  1.41f;
	}
	public void bobLeftDown(){
		x1 = x -  1.41f;
		y1 = y - 15.56f;
		x2 = x -  7.07f;
		y2 = y +  7.07f;
		x3 = x + 15.56f;
		y3 = y +  1.41f;
	}

	public void goRight(){
		x = x + speed;
	}
	public void goLeft(){
		x = x - speed;
	}
	public void goUp(){
		y = y - speed;
	}
	public void goDown(){
		y = y + speed;
	}

	public void animation(){
		int limite = 40;

		if (direction == 1) {
			this.alliceDown();
			number++;
			if (number%limite==1) {
				direction+=1;
				animationCounter+=1;
				if (animationCounter%5==1) {
					x+=speed;
				}
			}
		} else if (direction == 2) {
			this.alliceLeft();
			number++;
			if (number%limite==1) {
				direction+=1;
				animationCounter+=1;
				if (animationCounter%5==1) {
					y+=speed;
				}
			}
		} else if (direction == 3) {
			this.alliceUp();
			number++;
			if (number%limite==1) {
				direction+=1;
				animationCounter+=1;
				if (animationCounter%5==1) {
					x-=speed;
				}
			}
		} else if (direction == 4) {
			this.alliceRight();
			number++;	
			if (number%limite==1) {
				direction = 1;
				animationCounter+=1;
				if (animationCounter%5==1) {
					y-=speed;
				}
			}
		} 
	}
	public void keyPressed() {
		this.display();
  		if (parent.key == parent.CODED) {
    		if (parent.keyCode == parent.UP) {
    			this.charlieUp();
    			if (x2 == 0 || x2 == parent.width || y2 == 0 || y2 == parent.height) {
    				this.charlieUp();
    			} else {
    				this.goUp();	
    			}
  			} else if (parent.keyCode == parent.DOWN) {
    			this.charlieDown();
    			if (x2 == 0 || x2 == parent.width || y2 == 0 || y2 == parent.height) {
    				this.charlieDown();
    			} else {
    				this.goDown();	
    			}
    		} else if (parent.keyCode == parent.LEFT) {
    			this.charlieLeft();
    			if (x2 == 0 || x2 == parent.width || y2 == 0 || y2 == parent.height) {
    				this.charlieLeft();
    			} else {
    				this.goLeft();	
    			}
    		} else if (parent.keyCode == parent.RIGHT) {
    			this.charlieRight();
    			if (x2 == 0 || x2 == parent.width || y2 == 0 || y2 == parent.height) {
    				this.charlieRight();
    			} else {
    				this.goRight();	
    			}
    		}
  		} else {
  			this.charlieRight();
  		}
	}
}