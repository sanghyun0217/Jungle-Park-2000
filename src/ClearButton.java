////////////////////ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
//Title: ClearButton.java
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
 * this a super class for any Button that can be added to a PApplet application
 * This class implements the ParkGUI interface
 * 
 */
public class ClearButton extends Button {

	public ClearButton(float x, float y, JunglePark park) {
		super(x, y, park);
		this.label = "clear park";
	}

	@Override
	  public void mousePressed() {
	    if (isMouseOver())
	    	for (int i = 0; i < processing.listGUI.size(); i++) {
	    	      if (processing.listGUI.get(i) instanceof Animal) {
	    	        processing.listGUI.remove(i);
	    	        i--;
	    	      }
	    	
	    	
	  }}}
