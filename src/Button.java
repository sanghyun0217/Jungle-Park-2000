////////////////////ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
//Title: Button.java
//Files: CS 300
//Course: LEC 003 Fall, 2018
//
//Author: Sanghyun lee	
//Email: lee866@wisc.edu
//Lecturer's Name: Mouna Kacem
//
//
//
//VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
//__X_ Write-up states that pair programming is allowed for this assignment.
//__X_ We have both read and understand the course Pair Programming Policy.
//__X_ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
//Students who get help from sources other than their partner must fully
//acknowledge and credit those sources of help here. Instructors and TAs do
//not need to be credited here, but tutors, friends, relatives, room mates,
//strangers, and others do. If you received no outside help from either type
//of source, then please explicitly indicate NONE.
//
//Persons: NONE.
//Online Sources: NONE.
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

/**
   * This a super class for any Button that can be added to a PApplet application
   * This class implements the ParkGUI interface
   * 
   */

public class Button implements ParkGUI {
  private static final int WIDTH = 85; // Width of the Button
  private static final int HEIGHT = 32; // Height of the Button
  protected JunglePark processing; // PApplet object where the button will be displayed
  private float[] position; // array storing x and y positions of the Button with respect to 
                            // the display window 
  protected String label;   // text/label that represents the button

  /**
   * This button constructor that can be added to a PApplet application
   * 
   * 
   */
  public Button(float x, float y, JunglePark processing) {
    this.processing = processing;
    this.position = new float[2];
    this.position[0] = x;
    this.position[1] = y;
    this.label = "Button";
  }

  @Override
  public void draw() {
    this.processing.stroke(0);// set line value to black
    if (isMouseOver())
      processing.fill(100); // set the fill color to dark gray if the mouse is over the button
    else
      processing.fill(200); // set the fill color to light gray otherwise

    // draw the button (rectangle with a centered text)
    processing.rect(position[0] - WIDTH / 2.0f, position[1] - HEIGHT / 2.0f,
        position[0] + WIDTH / 2.0f, position[1] + HEIGHT / 2.0f);
    processing.fill(0); // set the fill color to black
    processing.text(label, position[0], position[1]); // display the text of the current button
  }

  @Override
  public void mousePressed() {
    if (isMouseOver())
      System.out.println("A button was pressed.");
  }

  @Override
  public void mouseReleased() {
	  
  }

  @Override
  public boolean isMouseOver() {
    if (this.processing.mouseX > this.position[0] - WIDTH / 2
        && this.processing.mouseX < this.position[0] + WIDTH / 2
        && this.processing.mouseY > this.position[1] - HEIGHT / 2
        && this.processing.mouseY < this.position[1] + HEIGHT / 2)
      return true;
    return false;
  }
}