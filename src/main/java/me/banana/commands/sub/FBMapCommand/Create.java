package me.banana.commands.sub.FBMapCommand;

import me.banana.AdvancedFB;
import me.banana.commands.sub.SubCommand;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Create extends SubCommand {
    @Override
    public String getName() {
        return "create";
    }

    @Override
    public String getDescription() {
        return "Creates a FastBuilder Island.";
    }

    @Override
    public String getSyntax() {
        return "/fb create <mode> <id>";
    }

    @Override
    public void perform(Player player, String[] args) {

    }
}
