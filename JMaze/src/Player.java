import java.awt.geom.Point2D;

/**
 * Represents the player
 * Responsibilities:
 * - Returning its position
 * - Making moves to connected MazeNodes
 * - Containing a player name
 * @author
 */
public class Player {
	/**
	 * The constructor method
	 */
	public Player(String name, MazeGraph m) {
		
		this.playerName = name;
		//Assign player to starting position on MazeGraph
		this.maze = m;
		this.position = new Point(0,0);
		
		
	}
	
	/**
	 * Retrieves the (x,y) position of the player on the map
	 * @return the position of the player
	 */
	public Point getPosition() {
		return this.position;
	}
	
	/**
	 * Retrieves the name of the player
	 * @return the name of the player
	 */
	public String getName()
	{
		return this.playerName;
	}
	
	/**
	 * Moves the player accordingly to the input action
	 * @param action the input direction the player should move
	 */
	public void move(int action)
	{
		Point newPosition;
		if (action == UP) {
			newPosition = new Point(this.getPosition().getX()-1, this.getPosition().getY());
		} else if (action == DOWN) {
			newPosition = new Point(this.getPosition().getX()+1, this.getPosition().getY());
		} else if (action == LEFT) {
			newPosition = new Point(this.getPosition().getX(), this.getPosition().getY()-1);
		} else if (action == DOWN) {
			newPosition = new Point(this.getPosition().getX()+1, this.getPosition().getY()+1);
		} else {
			newPosition = this.getPosition();
		}
		
		//Change the player position if valid
		if (this.maze.validMove(this.position, newPosition)) {
			this.setPosition(newPosition);
		}
	
	}

	public void setPosition(Point newPosition) {
		this.position = newPosition;
	}
	
	
	private static final int UP = 1;
	private static final int DOWN = 2;
	private static final int LEFT = 3;
	private static final int RIGHT = 4;
	
	private String playerName;
	private Point position; //the position of the player
	private MazeGraph maze;
}
