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
		this.position = new Point(x,y);
	}
	
	/**
	 * Retrieves the (x,y) position of the node in the maze
	 * @return the (x,y) position of the node
	 */
	Point getPosition() {
		return this.position;
	}
	
	public void addConnection(MazeNode node, int direction) {
		
	}
	
	public boolean isConnected() {
		return true;
	}
	
	private Point position; //the position of the node in the maze
	private MazeNode[] connections;
	
}
