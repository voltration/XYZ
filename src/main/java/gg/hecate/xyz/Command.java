package gg.hecate.xyz;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static gg.hecate.util.Format.f;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;

            int x = (int) p.getLocation().getX();
            int y = (int) p.getLocation().getY();
            int z = (int) p.getLocation().getZ();

            Bukkit.broadcastMessage(f("&x&7&4&6&C&C&0&lANNOUNCEMENT"));
            Bukkit.broadcastMessage(f("&r"));
            Bukkit.broadcastMessage(f("&x&7&4&6&C&C&0" + p.getDisplayName() + "&f shared their coordinates!"));
            Bukkit.broadcastMessage(f("&x&7&4&6&C&C&0"
                    + x
                    + "&f, &x&7&4&6&C&C&0"
                    + y
                    + "&f, &x&7&4&6&C&C&0"
                    + z
                    ));
        }

        return true;
    }
}