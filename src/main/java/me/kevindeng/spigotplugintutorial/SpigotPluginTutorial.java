package me.kevindeng.spigotplugintutorial;

import me.kevindeng.spigotplugintutorial.commands.ClearInventory;
import me.kevindeng.spigotplugintutorial.commands.GamemodeHandler;
import me.kevindeng.spigotplugintutorial.listeners.EatingEffect;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import java.util.*;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public final class SpigotPluginTutorial extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        new GamemodeHandler(this);
        new ClearInventory(this);
        getServer().getPluginManager().registerEvents(this, this);
        // getServer().getPluginManager().registerEvents(new EatingEffect(), this);
    }

    @EventHandler
    public void TempEvent(EntityDamageEvent e) {
        Entity b = e.getEntity();
        if (b.getType().equals(EntityType.PLAYER) && e.getCause().equals(EntityDamageEvent.DamageCause.FALL)) {
            Random rand = new Random();
            int num = rand.nextInt(23);
            ItemStack is = null;
            int a = num % 4;
            if (num == 0) {      //helmet
                num = rand.nextInt(3);
                if(num == 0) {
                    is = new ItemStack(Material.IRON_HELMET, 1);
                }else if(num == 1) {
                    is = new ItemStack(Material.DIAMOND_HELMET,1);
                }else {
                    is = new ItemStack(Material.NETHERITE_HELMET,1);
                }

                num = rand.nextInt(4);
                if(num == 0) {
                    is.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                }else if(num == 1) {
                    is.addEnchantment(Enchantment.PROTECTION_FIRE, num % 3);
                }else if(num == 2) {
                    is.addEnchantment(Enchantment.DURABILITY, 3);
                }else {
                    is.addEnchantment(Enchantment.OXYGEN, 3);
                }

            }else if (num == 1) {//chest
                num = rand.nextInt(3);
                if(num == 0) {
                    is = new ItemStack(Material.IRON_CHESTPLATE,1);
                }else if(num == 1) {
                    is = new ItemStack(Material.DIAMOND_CHESTPLATE,1);
                }else {
                    is = new ItemStack(Material.NETHERITE_CHESTPLATE,1);
                }

                num = rand.nextInt(4);
                if(num == 0) {
                    is.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, a);
                }else if(num == 1) {
                    is.addEnchantment(Enchantment.PROTECTION_FIRE, a);
                }else if(num == 2) {
                    is.addEnchantment(Enchantment.DURABILITY, a);
                }else {
                    is.addEnchantment(Enchantment.THORNS, a);
                }

            }else if (num == 2) {//pants
                num = rand.nextInt(3);
                if(num == 0) {
                    is = new ItemStack(Material.IRON_LEGGINGS,1);
                }else if(num == 1) {
                    is = new ItemStack(Material.DIAMOND_LEGGINGS,1);
                }else {
                    is = new ItemStack(Material.NETHERITE_LEGGINGS,1);
                }

                num = rand.nextInt(4);
                if(num == 0) {
                    is.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, a);
                }else if(num == 1) {
                    is.addEnchantment(Enchantment.PROTECTION_FIRE, a);
                }else if(num == 2) {
                    is.addEnchantment(Enchantment.DURABILITY, a);
                }else {
                    is.addEnchantment(Enchantment.THORNS, 3);
                }

            }else if (num == 3) {//boots
                num = rand.nextInt(3);
                if(num == 0) {
                    is = new ItemStack(Material.IRON_BOOTS,1);
                }else if(num == 1) {
                    is = new ItemStack(Material.DIAMOND_BOOTS,1);
                }else {
                    is = new ItemStack(Material.NETHERITE_BOOTS,1);
                }

                num = rand.nextInt(8);
                if(num == 0) {
                    is.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, a);
                }else if(num == 1) {
                    is.addEnchantment(Enchantment.PROTECTION_FIRE, a);
                }else if(num == 2) {
                    is.addEnchantment(Enchantment.DURABILITY, a);
                }else if(num == 3) {
                    is.addEnchantment(Enchantment.WATER_WORKER, a);
                }else if(num == 4) {
                    is.addEnchantment(Enchantment.SOUL_SPEED, a);
                }else if(num == 5) {
                    is.addEnchantment(Enchantment.FROST_WALKER, a);
                }else if(num == 6) {
                    is.addEnchantment(Enchantment.DEPTH_STRIDER, a);
                }else {
                    is.addEnchantment(Enchantment.PROTECTION_FALL, a);
                }

            }else if (num == 4) {//pickaxe
                num = rand.nextInt(3);
                if(num == 0) {
                    is = new ItemStack(Material.IRON_PICKAXE,1);
                }else if(num == 1) {
                    is = new ItemStack(Material.DIAMOND_PICKAXE,1);
                }else {
                    is = new ItemStack(Material.NETHERITE_PICKAXE,1);
                }

                num = rand.nextInt(4);
                if(num == 0) {
                    is.addEnchantment(Enchantment.DIG_SPEED, a);
                }else if(num == 1) {
                    is.addEnchantment(Enchantment.SILK_TOUCH, a);
                }else if(num == 2) {
                    is.addEnchantment(Enchantment.DURABILITY, a);
                }else {
                    is.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, a);
                }

            }else if (num == 5) {//sword
                num = rand.nextInt(3);
                if(num == 0) {
                    is = new ItemStack(Material.IRON_SWORD,1);
                }else if(num == 1) {
                    is = new ItemStack(Material.DIAMOND_SWORD,1);
                }else {
                    is = new ItemStack(Material.NETHERITE_SWORD,1);
                }

                num = rand.nextInt(4);
                if(num == 0) {
                    is.addEnchantment(Enchantment.DAMAGE_ALL, a);
                }else if(num == 1) {
                    is.addEnchantment(Enchantment.FIRE_ASPECT, a);
                }else if(num == 2) {
                    is.addEnchantment(Enchantment.DURABILITY, a);
                }else {
                    is.addEnchantment(Enchantment.MENDING, a);
                }

            }else if (num == 6) {//shovel
                num = rand.nextInt(3);
                if(num == 0) {
                    is = new ItemStack(Material.IRON_SHOVEL,1);
                }else if(num == 1) {
                    is = new ItemStack(Material.DIAMOND_SHOVEL,1);
                }else {
                    is = new ItemStack(Material.NETHERITE_SHOVEL,1);
                }

                num = rand.nextInt(4);
                if(num == 0) {
                    is.addEnchantment(Enchantment.DIG_SPEED, a);
                }else if(num == 1) {
                    is.addEnchantment(Enchantment.SILK_TOUCH, 1);
                }else if(num == 2) {
                    is.addEnchantment(Enchantment.DURABILITY, a);
                }else {
                    is.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, a);
                }

            }else if (num == 7) {//axe
                num = rand.nextInt(3);
                if(num == 0) {
                    is = new ItemStack(Material.IRON_AXE,1);
                }else if(num == 1) {
                    is = new ItemStack(Material.DIAMOND_AXE,1);
                }else {
                    is = new ItemStack(Material.NETHERITE_AXE,1);
                }

                num = rand.nextInt(4);
                if(num == 0) {
                    is.addEnchantment(Enchantment.DAMAGE_ALL, a);
                }else if(num == 1) {
                    is.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                }else if(num == 2) {
                    is.addEnchantment(Enchantment.DURABILITY, a);
                }else {
                    is.addEnchantment(Enchantment.MENDING, 1);
                }

            }else if (num == 8) {//shield
                is = new ItemStack(Material.SHIELD,1);
            }else if (num == 9) {//totem
                is = new ItemStack(Material.TOTEM_OF_UNDYING,1);
            }else if (num == 10) {//diamond
                is = new ItemStack(Material.DIAMOND,a * 2);
            }else if (num == 11) {//iron
                is = new ItemStack(Material.IRON_INGOT,a * 3);
            }else if (num == 12) {//gold
                is = new ItemStack(Material.GOLD_INGOT,10);
            }
            else if (num == 13) {
                is = new ItemStack(Material.OBSIDIAN, 10);
            }
            else if (num == 14) {
                is = new ItemStack(Material.BOW);
                num = rand.nextInt(4);
                if(num == 0) {
                    is.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                }else if(num == 1) {
                    is.addEnchantment(Enchantment.ARROW_FIRE, 2);
                }else if(num == 2) {
                    is.addEnchantment(Enchantment.ARROW_DAMAGE, a);
                }else {
                    is.addEnchantment(Enchantment.ARROW_INFINITE, 1);
                }
            }
            else if (num == 15) {
                is = new ItemStack(Material.ARROW, 20);
            }
            else if (num == 16) {
                is = new ItemStack(Material.COOKED_BEEF, 32);
            }
            else if (num == 17) {
                is = new ItemStack(Material.NETHERITE_PICKAXE);
                is.addEnchantment(Enchantment.DIG_SPEED, 5);
            }
            else if (num == 18) {
                Player p = (Player) b;
                p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1000, 10, true, false));
                p.sendMessage("You have now obtained haste");
             }
            else if (num == 19) {
                Player p = (Player) b;
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000, 5, true, false));
                p.sendMessage("You have now obtained speed");
            }
            else if (num == 20) {
                is = new ItemStack(Material.ENDER_EYE, 8);
            }
            else if (num == 21) {
                is = new ItemStack(Material.ENDER_PEARL, 16);
            }
            else {              //golden apple
                int l = rand.nextInt(5);
                is = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, l + 1);
            }

            b.getWorld().dropItem(b.getLocation(), is);
        }
    }

    @EventHandler
    public void PlayerDies(PlayerDeathEvent playerDeathEvent) {
        playerDeathEvent.setKeepInventory(true);
    }
}
