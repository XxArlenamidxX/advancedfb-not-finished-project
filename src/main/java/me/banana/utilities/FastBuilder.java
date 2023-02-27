package me.banana.utilities;

import me.banana.AdvancedFB;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FastBuilder implements Listener {

    Player player;
    public FileConfiguration config = AdvancedFB.Main.getConfig();

    private boolean isInGame;

    public FastBuilder() {

    }

    public static FastBuilder INSTANCE = new FastBuilder();

    public void JoinGame(Player player, String[] args) {

        isInGame = true;

        ItemStack blocks = new ItemStack(Material.getMaterial(config.getString("settings.items.blocks")));
        ItemMeta blocksMeta = blocks.getItemMeta();
        blocksMeta.setUnbreakable(true);
        blocksMeta.setDisplayName(config.getString("settings.item-names.blocks"));
        blocks.setAmount(64);
        blocks.setItemMeta(blocksMeta);

        ItemStack pickaxe = new ItemStack(Material.getMaterial(config.getString("settings.items.pickaxe")));
        ItemMeta pickaxeMeta = pickaxe.getItemMeta();
        pickaxeMeta.setUnbreakable(true);
        pickaxeMeta.setDisplayName(config.getString("settings.item-names.pickaxe"));
        pickaxe.setItemMeta(pickaxeMeta);

        ItemStack settings = new ItemStack(Material.getMaterial(config.getString("settings.items.settings")));
        ItemMeta settingsMeta = settings.getItemMeta();
        settingsMeta.setUnbreakable(true);
        settingsMeta.setDisplayName(config.getString("settings.item-names.settings"));
        settings.setItemMeta(settingsMeta);

        ItemStack modes = new ItemStack(Material.getMaterial(config.getString("settings.items.modes")));
        ItemMeta modesMeta = modes.getItemMeta();
        modesMeta.setUnbreakable(true);
        modesMeta.setDisplayName(config.getString("settings.item-names.modes"));
        modes.setItemMeta(modesMeta);

        ItemStack leave = new ItemStack(Material.getMaterial(config.getString("settings.items.leave")));
        ItemMeta leaveMeta = leave.getItemMeta();
        leaveMeta.setUnbreakable(true);
        leaveMeta.setDisplayName(config.getString("settings.item-names.leave"));
        leave.setItemMeta(leaveMeta);

        player.getInventory().setItem(0, blocks);
        player.getInventory().setItem(1, blocks);
        player.getInventory().setItem(2, pickaxe);
        player.getInventory().setItem(6, settings);
        player.getInventory().setItem(7, modes);
        player.getInventory().setItem(8, leave);



        player.sendMessage(config.getString("settings.messages.join_message"));

    }

    public void leaveGame(Player player) {
        isInGame = false;
        player.getInventory().clear();
        player.getLocation().setX(config.getDouble("settings.lobby-position.x"));
        player.getLocation().setY(config.getDouble("settings.lobby-position.y"));
        player.getLocation().setZ(config.getDouble("settings.lobby-position.z"));
        player.getLocation().setYaw((float) config.getDouble("settings.lobby-position.yaw"));
        player.getLocation().setPitch((float) config.getDouble("settings.lobby-position.pitch"));
    }
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if(config.getBoolean("settings.anti-swearing.enabled") == true) {
            if(event.getMessage().equalsIgnoreCase(config.getStringList("settings.anti-swearing.swear-words").toString())) {
                event.setCancelled(true);
                player.sendMessage(config.getString("settings.anti-swearing.swearing-message").replace("&", "§"));
            }
        }
    }

    public boolean isInGame() {
        return isInGame;
    }

    public int islandAlreadyTaken(int island, String mode) {
        int islandToJoin = config.getInt("modes." + mode + "." + island);

        

        return island;
    }

}
