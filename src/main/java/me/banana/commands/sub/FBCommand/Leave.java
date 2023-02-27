package me.banana.commands.sub.FBCommand;

import me.banana.commands.sub.SubCommand;
import org.bukkit.entity.Player;

public class Leave extends SubCommand {
    @Override
    public String getName() {
        return "leave";
    }

    @Override
    public String getDescription() {
        return "Leaves FastBuilder.";
    }

    @Override
    public String getSyntax() {
        return "/fb leave";
    }

    @Override
    public void perform(Player player, String[] args) {

    }
}
