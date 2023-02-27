package me.banana.utilities;

import me.banana.AdvancedFB;
import me.banana.commands.FBCommand;
import me.banana.commands.FBMapCommand;
import me.banana.listeners.LoadListeners;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

public class Plugin {

    private FileConfiguration config = AdvancedFB.Main.getConfig();

    public void enablePlugin() {

        Bukkit.getLogger().info("[AdvancedFB] Loading Config");
        getConfig().options().copyDefaults();
        AdvancedFB.Main.saveDefaultConfig();

        Bukkit.getLogger().info("[AdvancedFB] Loading Listeners");
        LoadListeners.listeners.loadListeners(AdvancedFB.Main);

        Bukkit.getLogger().info("[AdvancedFB] Loading Commands");
        Bukkit.getPluginCommand("fastbuilder").setExecutor(new FBCommand());
        Bukkit.getPluginCommand("fastbuildermap").setExecutor(new FBMapCommand());
    }

    public void disablePlugin() {
        if(Bukkit.getPluginManager().getPlugin(AdvancedFB.Main.getName()).isEnabled()) {
            Bukkit.getServer().broadcastMessage(config.getString("settings.prefix") + " Intiating AdvancedFB Shutdown...");

        }
    }

    private FileConfiguration getConfig() {
        return config;
    }

}
