package gg.hecate.xyz;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

import static gg.hecate.util.Format.f;

public class Command implements CommandExecutor {

    private final XYZ plugin;

    public Command(XYZ plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (args.length == 0) {

                String x = String.valueOf((int) p.getLocation().getX());
                String y = String.valueOf((int) p.getLocation().getY());
                String z = String.valueOf((int) p.getLocation().getZ());

                    Bukkit.broadcastMessage(f(Objects.requireNonNull(plugin.getConfig().getString("message"))
                            .replace("{x}", x)
                            .replace("{y}", y)
                            .replace("{z}", z)
                            .replace("{displayname}", p.getDisplayName())));
            }

            if (args.length == 1 && (args[0].equalsIgnoreCase("help"))) {
                p.sendMessage(f(plugin.getConfig().getString("AuthorMessage")));

            }

        }
        return true;
    }
}