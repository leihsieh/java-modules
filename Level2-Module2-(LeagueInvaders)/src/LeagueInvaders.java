import javax.swing.JFrame;

public class LeagueInvaders {

	// Declaring and initializing width

	protected static final int WIDTH = 500;

	// Declaring and initializing height

	protected static final int HEIGHT = 800;

	// Creating window of the game

	protected JFrame window;
	
	// Declaring gamePanel
	
	public GamePanel gamePanel;
	
	// Creating a league invader object and calling for setup method

	public static void main(String[] args) {

		LeagueInvaders leagueInvaders = new LeagueInvaders();

		leagueInvaders.setup();

	}

	// League invader constructor and initializing window

	protected LeagueInvaders() {
		
		// Creating a game panel object
		gamePanel = new GamePanel();

		window = new JFrame();
		
		// Adding gamePanel to the window
		window.add(gamePanel);		
		
		// Adding a key listener to the window
		window.addKeyListener(gamePanel);

	}
	
	
	// Preparing the league invader window
	protected void setup() {

		window.setSize(WIDTH, HEIGHT);

		window.setVisible(true);

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
