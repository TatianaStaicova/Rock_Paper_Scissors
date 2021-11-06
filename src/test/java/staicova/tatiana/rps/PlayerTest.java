package staicova.tatiana.rps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    private Player player;

    @BeforeEach

    public void setUp(){
        player = new Player("Tatiana", "You lose!");

    }
@Test
    @DisplayName("Taunt MSg test")
    public void tauntTest(){
        String expected = "You lose!";
        String actual = player.taunt();

    Assertions.assertEquals(expected, actual);
}
}

