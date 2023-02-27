package me.banana.commands;

import me.banana.commands.sub.FBCommand.Join;
import me.banana.commands.sub.FBCommand.Leave;
import me.banana.commands.sub.SubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;

public class FBCommand implements CommandExecutor {

   private ArrayList<SubCommand> subcommands = new ArrayList<>();

   public FBCommand() {
       subcommands.add(new Join());
       subcommands.add(new Leave());
   }

   @Override
   public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {



       return true;
   }

   public ArrayList<SubCommand> getSubCommands() {
       return subcommands;
   }


}
