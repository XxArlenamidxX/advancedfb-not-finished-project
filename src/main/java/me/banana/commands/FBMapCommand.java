package me.banana.commands;

import me.banana.commands.sub.FBCommand.Join;
import me.banana.commands.sub.FBCommand.Leave;
import me.banana.commands.sub.FBMapCommand.Create;
import me.banana.commands.sub.FBMapCommand.Set;
import me.banana.commands.sub.SubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;

public class FBMapCommand implements CommandExecutor {

    private ArrayList<SubCommand> subcommands = new ArrayList<>();

    public FBMapCommand() {
        subcommands.add(new Create());
        subcommands.add(new Set());
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {



        return true;
    }

    public ArrayList<SubCommand> getSubCommands() {
        return subcommands;
    }


}
