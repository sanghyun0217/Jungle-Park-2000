////////////////////ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
//Title: AddAnimalButton.javaS
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
import java.util.ArrayList;
	
public class AddAnimalButton extends Button {

	private String type; // type of the animal to add

	public AddAnimalButton(String type, float x, float y, JunglePark park) {
		super(x, y, park);
		this.type = type.toLowerCase();
		this.label = "Add " + type;
	}

	@Override
	public void mousePressed() {
		if (isMouseOver()) {
			switch (type) {
			case "tiger":
			
				Tiger tiger = new Tiger(processing);// create a new Tiger
				processing.listGUI.add(tiger);//  add it to the JunglePark
						
				break;
			case "deer":
				
				Deer deer = new Deer(processing); //create a new Deer
				processing.listGUI.add(deer); // Deer and add it to the JunglePark
				break;
			}
		}
	}
}
