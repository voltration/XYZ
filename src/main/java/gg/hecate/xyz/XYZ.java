package gg.hecate.xyz;
import org.bukkit.plugin.java.JavaPlugin;


public final class XYZ extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("xyz").setExecutor(new Command());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
