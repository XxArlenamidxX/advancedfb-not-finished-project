package me.banana.commands;

import org.bukkit.Bukkit;

public class LoadCommands {

    public static LoadCommands commands = new LoadCommands();

    public void loadCommands() {
        Bukkit.getPluginCommand("fastbuilder").setExecutor(new FBCommand());
        Bukkit.getPluginCommand("fastbuildermap").setExecutor(new FBMapCommand());
    }

}
