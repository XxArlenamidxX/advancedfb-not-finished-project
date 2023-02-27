package me.banana.commands.sub.FBCommand;

import me.banana.AdvancedFB;
import me.banana.commands.sub.SubCommand;
import me.banana.utilities.FastBuilder;
import org.bukkit.entity.Player;

public class Join extends SubCommand {
    @Override
    public String getName() {
        return "join";
    }

    @Override
    public String getDescription() {
        return "Joins FastBuilder.";
    }

    @Override
    public String getSyntax() {
        return "/fb join <mode>";
    }

    @Override
    public void perform(Player player, String[] args) {
        if(FastBuilder.INSTANCE.isInGame()) {
            player.sendMessage(AdvancedFB.Main.getConfig().getString("settings.messages.already_joined_message"));
        } else {
            FastBuilder.INSTANCE.JoinGame(player, args);
        }
    }
}
