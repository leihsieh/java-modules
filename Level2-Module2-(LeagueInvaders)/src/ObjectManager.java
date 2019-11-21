import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class ObjectManager implements ActionListener {

	protected Rocketship rocketShip;

	protected ArrayList<Projectile> projectiles = new ArrayList<>();

	protected ArrayList<Alien> aliens = new ArrayList<Alien>();

	protected Random random = new Random();
	
	private int score = 0;

	// Initializing rocket ship
	protected ObjectManager(Rocketship rocketShip) {

		this.rocketShip = rocketShip;

	}

	// Adding projectiles to the arrayList<Projectiles>
	protected void addProjectile(Projectile projectile) {

		projectiles.add(projectile);

	}

	// Adding aliens into the game panel at a random x-position
	protected void addAlien() {

		aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

	}

	// Object manager updates aliens and projectile independently
	protected void update() {

		for (Alien alien : aliens) {

			alien.update();

			// if alien is above the screen, then remove
			if (alien.y >= LeagueInvaders.HEIGHT) {

				alien.isActive = false;

			}
		}

		for (Projectile projectile : projectiles) {

			projectile.update();

			// if projectile is below the screen, then remove the projectile
			if (projectile.y <= 0) {

				projectile.isActive = false;

			}
		}

		// Game is over is false if the rocket ship is inactive. Otherwise, checks for
		// collisions and purges objects from the frame.
		//if (rocketShip.isActive != false) {

			checkCollision();

			purgeObjects();

		//}
	}

	// Draws the rocket ship, alien, and projectiles in the game panel.
	
	protected void draw(Graphics g) {

		rocketShip.draw(g);

		for (Alien alien : aliens) {

			alien.draw(g);

		}

		for (Projectile projectile : projectiles) {

			projectile.draw(g);

		}
	}

	// Iterates through ArrayList and removes any alien or projectile marked as not
	// active.
	
	protected void purgeObjects() {

		// Using regular for loop instead of for-each since aliens are being removed
		for (int i = 0; i < aliens.size(); i++) {

			if (aliens.get(i).isActive == false) {

				aliens.remove(i);

			}
		}

		// Using regular for loop instead of for-each since projectiles are being
		// removed
		for (int i = 0; i < projectiles.size(); i++) {

			if (projectiles.get(i).isActive == false) {

				projectiles.remove(i);

			}
		}
	}

	// New alien appears in the game after one second
	@Override
	public void actionPerformed(ActionEvent e) {

		addAlien();

	}

	// Checks collisions between alien and rocket or alien and projectile
	
	protected void checkCollision() {

		// checks if aliens collide to the rocket ship
		for (Alien alien : aliens) {

			boolean isThereCollision = alien.collisionBox.intersects(rocketShip.collisionBox);

			if (isThereCollision == true) {

				alien.isActive = false;

				rocketShip.isActive = false;

			}
			
		}
		
		// Check if the alien is colliding with the projectiles

		for (Projectile projectile : projectiles) {
			
			for (Alien alien : aliens) {

				boolean isThereCollision = projectile.collisionBox.intersects(alien.collisionBox);

				if (isThereCollision == true) {

					alien.isActive = false;

					projectile.isActive = false;
					
					// score is incremented when projectile hits an alien
					score++;

				}
			}
		}
	}
	
	// Returns current score
	protected int getScore() {
	
		return score;
		
	}
}
