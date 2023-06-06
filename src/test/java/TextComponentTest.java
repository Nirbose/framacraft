import be.seeseemelk.mockbukkit.MockBukkit;
import fr.nirbose.framacraft.api.text.TextComponent;
import org.bukkit.ChatColor;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TextComponentTest {

    @BeforeAll
    public static void load() {
        MockBukkit.mock();
    }

    @AfterAll
    public static void unload() {
        MockBukkit.unmock();
    }

    @Test
    public void testSimpleText() {
        TextComponent text = new TextComponent("Simple text");

        Assertions.assertEquals("Simple text", text.toString());
    }

    @Test
    public void testAppendText() {
        TextComponent text = new TextComponent("Simple text");

        text.append("!");
        Assertions.assertEquals("Simple text!", text.toString());
    }

    @Test
    public void testColorText() {
        TextComponent text = new TextComponent("Simple text");

        text.color(ChatColor.AQUA);
        Assertions.assertEquals("§bSimple text", text.toString());
    }

}
