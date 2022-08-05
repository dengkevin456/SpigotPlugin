package me.kevindeng.spigotplugintutorial.commands;

import me.kevindeng.spigotplugintutorial.SpigotPluginTutorial;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ClearInventory implements CommandExecutor {
    private SpigotPluginTutorial plugin;
    public ClearInventory(SpigotPluginTutorial plugin) {
        this.plugin = plugin;
        plugin.getCommand("clearinventory").setExecutor(this);
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        for (ItemStack itemStack: p.getInventory().getContents())
        {
            if (p.getGameMode() == GameMode.CREATIVE) {
                p.sendMessage("Cleared everything from " + ChatColor.DARK_BLUE + ((Player) sender).getDisplayName() + "'s inventory");
                itemStack.setAmount(0);
            }
        }
        return false;
    }
}
