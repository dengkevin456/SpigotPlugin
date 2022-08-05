package me.kevindeng.spigotplugintutorial.commands;

import me.kevindeng.spigotplugintutorial.SpigotPluginTutorial;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class GamemodeHandler implements CommandExecutor {
    private SpigotPluginTutorial plugin;
    public GamemodeHandler(SpigotPluginTutorial plugin) {
        this.plugin = plugin;
        plugin.getCommand("gamemode").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (p.getGameMode().equals(GameMode.SURVIVAL)) {
            p.setGameMode(GameMode.CREATIVE);
            return true;
        }
        else if (p.getGameMode().equals(GameMode.CREATIVE)) {
            p.setGameMode(GameMode.SURVIVAL);
            return true;
        }
        return false;
    }
}
