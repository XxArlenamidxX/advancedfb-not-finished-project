package me.banana;

import me.banana.utilities.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class AdvancedFB extends JavaPlugin {

    public static AdvancedFB Main = new AdvancedFB();
    Plugin plugin = new Plugin();

    @Override
    public void onEnable() {

        Bukkit.getLogger().info("[AdvancedFB] Enabling AdvancedFB...");

        plugin.enablePlugin();

    }

    @Override
    public void onDisable() {

        Bukkit.getLogger().info("[AdvancedFB] Disabling AdvancedFB...");

        plugin.disablePlugin();

    }

}