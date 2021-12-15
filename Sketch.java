import processing.core.PApplet;

public class Sketch extends PApplet {
	float scale = random(0, 200);
	
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
	  
    stroke(128);
    float churchX = 100;
    float churchY = 100;
    float doorX = (float)(scale / 2.5);
    float doorY = scale / 1;
    float roofX = scale / 1;

    // Church
    fill(148, 62, 9);
    rect(churchX, churchY, scale, (float)(scale * 1.5));
    
    // Church Door
    fill(15, 15, 15);
    rect(churchX + doorX,churchY + doorY, scale / 4 , scale / 2);  
    
    // Roof
    fill(123, 135, 120);
    triangle(churchX, churchY, churchX + roofX, churchY, churchX + scale / 2, churchY - scale / 2);
}
}