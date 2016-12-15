package se.hiflyer.kata;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class TennisTest {

	@Test
	public void whenMatchIsCreatedTheStandingIsTied() throws Exception {
		Player player1 = mock(Player.class);
		Player player2 = mock(Player.class);
		TennisMatch match = new TennisMatch(player1, player2);

		assertTrue(match.isTied());

	}
}
