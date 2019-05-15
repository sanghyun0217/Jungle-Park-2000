////////////////////ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
//Title: tiger.java
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
 * This class represents a Tiger in the JunglePark application 
 *
 */
public class Tiger extends Animal {
	private static final int SCAN_RANGE = 100; // range dimension for scanning
												// the neighborhood for food
	private static final String IMAGE_FILE_NAME = "images/tiger.png";
	private static int nextID = 1; // class variable that represents the
									// identifier of the next tiger
									// to be created
	// Tiger's identification fields
	private static final String TYPE = "TGR"; // A String that represents the
												// tiger type
	private final int id; // Tiger's id: positive number that represents the
							// order of the tiger
	private int deerEatenCount; // Number of Deers that the current tiger has
								// eaten so far

	/**
	 * Creates a new Tiger object positioned at a random position of the display
	 * window
	 * 
	 * @param processing
	 *            PApplet object that represents the display window
	 */
	public Tiger(JunglePark processing) {
		// Set Tiger drawing parameters
		super(processing, IMAGE_FILE_NAME);

		// Set Tiger identification fields
		id = nextID;
		this.label = TYPE + id; // String that identifies the current tiger
		nextID++;
		this.deerEatenCount = 0;
	}

	/**
	 * Tiger's behavior in the Jungle Park Scans for food at the neighborhood of
	 * the current tiger. If the Tiger founds any deer at its proximity, it hops
	 * on it, and eats it
	 */
	@Override
	public void action() {
		
		//scan for food (aka deer) and hop on it if any.
		for (int i = 0; i < processing.listGUI.size(); i++) {
			if (processing.listGUI.get(i) instanceof Deer) {
				Deer nDeer = (Deer) processing.listGUI.get(i);
				if(this.isClose(nDeer, SCAN_RANGE)){
				this.hop(nDeer);
				
				}
				if (deerEatenCount > 0)
					displayDeerEatenCount(); // display deerEatenCount
			
			}
			}
		}
	/**
	 * he tiger moves forward the position of food, and eats it.
	 * @param the deer = food    
	 */
	public void hop(Deer food) {
		
		this.setPositionX(food.getPositionX()); // set deer position
		this.setPositionY(food.getPositionY());
		processing.listGUI.remove(food); // remove the deer from listGUI
		this.deerEatenCount++; // if remove(hopping) deer deerEatenCount +1

	}
	/**
	 * @return the deerEatenCount  
	 */
	public int getDeerEatenCount() {
		return deerEatenCount; //
	}

	public void displayDeerEatenCount() {
		this.processing.fill(0); // specify font color: black
		// display deerEatenCount on the top of the Tiger's image
		this.processing.text(deerEatenCount, this.getPositionX(), this.getPositionY() -
				this.image.height / 2 - 4);
	}

}