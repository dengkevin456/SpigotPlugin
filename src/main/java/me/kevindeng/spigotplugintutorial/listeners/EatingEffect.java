package me.kevindeng.spigotplugintutorial.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class EatingEffect implements Listener {
    @EventHandler
    public void Eating(PlayerItemConsumeEvent event) {
        if (event.getItem().getType().name().toLowerCase().contains("potion")) return;
        if (event.getItem().getType().name().toLowerCase().contains("bucket")) return;
        event.getPlayer().setHealth(.5);

    }
}
