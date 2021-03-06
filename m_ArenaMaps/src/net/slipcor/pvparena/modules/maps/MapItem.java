package net.slipcor.pvparena.modules.maps;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import net.slipcor.pvparena.arena.Arena;

public class MapItem {
	private final int x;
	private final int z;
	private final boolean player;
	private final String name;
	private final ChatColor color;
	
	public MapItem(Arena a, Player p, ChatColor c) {
		player = true;
		color = c;
		name = p.getName();
		x = 0;
		z = 0;
	}
	
	public MapItem(Arena a, Location coord, ChatColor c) {
		player = false;
		name = null;
		color = c;
		x = coord.getBlockX();
		z = coord.getBlockZ();
	}
	
	public int getX() {
		if (player) {
			return Bukkit.getPlayerExact(name).getLocation().getBlockX();
		}
		return x;
	}
	
	public int getZ() {
		if (player) {
			return Bukkit.getPlayerExact(name).getLocation().getBlockZ();
		}
		return z;
	}
	
	public ChatColor getColor() {
		return color;
	}
	
	public boolean isPlayer() {
		return player;
	}

	public String getName() {
		return name;
	}
}
