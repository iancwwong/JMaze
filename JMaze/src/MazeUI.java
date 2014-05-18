/**
 * Presents the MazeGraph as a GUI
 * Responsibilities:
 * - Show Maze as GU
 * @author ianwong
 *
 */
public class MazeUI {
	
	/**
	 * Constructor method
	 * @param m the maze to display
	 * @param p the player of the maze
	 */
	public MazeUI(MazeGraph m, Player p) 
	{
		this.maze = m;
		this.player = p;
	}
	
	/**
	 * Displays the maze as a GUI
	 */
	public void displayMaze()
	{
    	int breadth = 0;
    	while (breadth < this.maze.getSize()) {
    		int length = 0;
    		while (length < this.maze.getSize()) {
    			if (maze.getNode(breadth,length) != null) {
    				Point current = new Point(breadth,length);
    				if (current.equals(this.player.getPosition())) {
    					System.out.print("x ");
    				} else {
    			        System.out.print("o ");
    				}
    			} else {
    				System.out.print("  ");
    			}
    			length++;
    		}
    		System.out.println("");
    		breadth++;
    	}
	}
	
	private MazeGraph maze; //the maze to display from
	private Player player; //the player of the maze

}
