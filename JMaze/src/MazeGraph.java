import java.util.ArrayList;

/**
 * Contains all the MazeNodes in a grid format (ie with their (x,y) positions
 * Responsibilities:
 * - Create a new graph
 * - Maze generation (based on the input difficulty)
 * - return a MazeNode
 * - Checking validity of a player move
 * - Return the state of the graph (with its connections)
 * @author
 *
 */
public class MazeGraph {
	
	/**
	 * Constructor method
	 * @param size the breadth and length of the maze
	 */
	public MazeGraph(int difficulty) {
		if (difficulty == EASY) {
			this.size = 8;
		} else if (difficulty == MEDIUM) {
			this.size = 15;
		} else if (difficulty == HARD) {
			this.size = 25;
		} else if (difficulty == EXTREME){
			this.size = 32;
		}
			
		this.mazeNodes = new ArrayList<ArrayList<MazeNode>>();
		
		//Construct the maze nodes
		int breadth = 0;
		while (breadth < this.size) {
			ArrayList<MazeNode> lengthList = new ArrayList<MazeNode>();
			int length = 0;
			while (length < this.size) {
				MazeNode node = new MazeNode(breadth, length);
				lengthList.add(node);
				length++;
			}
			this.mazeNodes.add(lengthList);
			breadth++;
		}
		
	}
	
	/**
	 * Generate the maze path, and populate the graph with connections
	 * based on the difficulty of the maze as specified by user input
	 */
	public void makeMaze()
	{
		
	}
	
	/**
	 * Returns the node at a specified (x,y) position
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @return the node at the specified position
	 */
	public MazeNode getNode(int x, int y) {
		return this.mazeNodes.get(x).get(y);
	}
	
	/**
	 * Checks whether a move from the oldPosition to newPosition is valid
	 * @param oldPosition
	 * @param newPosition
	 * @return
	 */
	public boolean validMove(Point oldPosition, Point newPosition)
	{
		//TODO: check that node at oldPosition is connected to node at newPosition
		return true;
	}
	
	/**
	 * Retrieves the size of the maze
	 * @return the size of the maze
	 */
	public int getSize()
	{
		return this.size;
	}
	
	private static final int EASY = 1;
	private static final int MEDIUM = 2;
	private static final int HARD = 3;
	private static final int EXTREME = 4;
	
	
    private ArrayList<ArrayList<MazeNode>> mazeNodes; //all the nodes in a grid format
    private int pathLength; //the number of steps from start to finish
    private int size; //the size of the maze lengthwise and breadthwise
    private int difficulty; //represents the difficulty of the maze: 1..4 (Note: difficulty is directly related to size)
}