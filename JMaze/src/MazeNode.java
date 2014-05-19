import java.awt.geom.Point2D;

/**
 * Represents a node in our MazeGraph
 * Responsibilities:
 * - Reporting its (x,y) position on the maze
 * - Retrieve its connections to (up to) 4 other mazeNodes
 * @author 
 * @date 16/5/2014
 *
 */
public class MazeNode {
    
	/**
	 * The constructor
	 */
	public MazeNode(int x, int y) {
		NORTH = false;
		EAST = false;
		SOUTH = false;
		WEST = false;
		this.position = new Point(x,y);
	}
	
	/**
	 * Retrieves the (x,y) position of the node in the maze
	 * @return the (x,y) position of the node
	 */
	Point getPosition() {
		return this.position;
	}
	
	public void addConnection(int direction) {
		if (direction == 0) NORTH = true;
		if (direction == 1) EAST = true;
		if (direction == 2) SOUTH = true;
		if (direction == 3) WEST = true;

	}
	
	public boolean isConnected() {
		return true;
	}
	
	private Point position; //the position of the node in the maze
	private boolean NORTH; // 0
	private boolean EAST; // 1
	private boolean SOUTH; //2
	private boolean WEST; //3
}
