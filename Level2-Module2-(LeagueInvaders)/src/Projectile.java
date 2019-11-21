import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {

	// Calling a Projectile object and passing values to super
	protected Projectile(int x, int y, int width, int height) {

		super(x, y, width, height);

		super.speed = 10;
	}

	protected void update() {

		super.y -= speed;
		
		// Updates collisionBox in GameObject
		super.update();

	}

	// Draws alien into the panel
	protected void draw(Graphics g) {

		g.setColor(Color.RED);

		g.fillRect(x, y, width, height);

	}

}
