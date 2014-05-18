
public class testMazeGraph {
    public static void main(String[] args)
    {
    	System.out.println("Now starting tests for the MazeGraph..");
    	
    	testNewMazeGraph();
    	
    	System.out.println("All tests passed! You are AWESOME!");

    }
    
    private static void testNewMazeGraph() 
    {
    	System.out.println("Now testing newMazeGraph function..");
    	
    	//Display the maze
    	MazeGraph maze = new MazeGraph(1);
    	Player p = new Player("Winner", maze);
    	int numNodes = 0;
    	int breadth = 0;
    	while (breadth < 8) {
    		int length = 0;
    		while (length < 8) {
    			if (maze.getNode(breadth,length) != null) {
    				Point current = new Point(breadth,length);
    				if (current.equals(p.getPosition())) {
    					System.out.print("x ");
    				} else {
    			        System.out.print("o ");
    				}
    			    numNodes++;
    			} else {
    				System.out.print("  ");
    			}
    			length++;
    		}
    		System.out.println("");
    		breadth++;
    	}
    	assert(numNodes == 64);
    }
}
