package adventuregame.tests.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import adventuregame.model.Game;

class TestLoadWorldOne {

	@Test
	void testLoadWorldOne() {
		Game game = new Game();
		game.loadWorldOne();
		assertEquals("The Street", game.getCurrentLocation().getName());
	}

}
