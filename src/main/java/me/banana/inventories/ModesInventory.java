package me.banana.inventories;

import me.banana.AdvancedFB;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ModesInventory {

    FileConfiguration config = AdvancedFB.Main.getConfig();

    public void open(Player player) {
        Inventory inventory = Bukkit.createInventory(player, config.getInt("settings.gui.modes.size"), config.getString("settings.gui.modes.title").replace("&", "§"));

        ItemStack slot1 = new ItemStack(Material.getMaterial(config.getString("settings.gui.modes.slot-1.item")));
        ItemMeta slot1meta = slot1.getItemMeta();
        slot1meta.setUnbreakable(true);
        slot1meta.setDisplayName(config.getString("settings.gui.modes.slot-1.name").replace("&", "§"));
        slot1.setItemMeta(slot1meta);

        inventory.addItem(slot1);
        player.openInventory(inventory);
    }

}
