import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class KeyInput extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public KeyInput()
    {
		MyKeyListener listener = new MyKeyListener();
		addKeyListener(listener);
		setFocusable(true);
		
		this.moveDirection = listener.getMoveDirection();
    }
    
	public class MyKeyListener implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				this.moveDirection = 1;
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				this.moveDirection = 2;
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				this.moveDirection = 3;
			} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				this.moveDirection = 4;
			} else {
				this.moveDirection = -1;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			//System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
		}
		
		public int getMoveDirection()
		{
			return this.moveDirection;
		}
		
		private int moveDirection;
	}
	
	public int getMoveDirection()
	{
		return this.moveDirection;
	}
	
    private int moveDirection;
}
