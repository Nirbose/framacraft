package fr.nirbose.framacraft.api.text;

import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;

public class TextComponent {

    private StringBuilder text;

    public TextComponent() {
        this("");
    }

    public TextComponent(String text) {
        this.text = new StringBuilder().append(text);
    }

    public TextComponent append(String string) {
        text.append(string);

        return this;
    }

    public TextComponent append(TextComponent textComponent) {
        return this.append(textComponent.toString());
    }

    public TextComponent color(ChatColor color) {
        text.insert(0, color.toString());

        return this;
    }

    public String toString() {
        return text.toString();
    }

}
