package gg.hecate.util;

import net.md_5.bungee.api.ChatColor;

public class Format {

    public static String f(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
