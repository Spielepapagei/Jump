package de.spielepapagei;

import de.spielepapagei.commands.JumpCommand;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public final class Main extends Plugin {

    private static Main Instance = null;

    public Main() {
        Instance = this;
    }

    public static Main getInstance() {
        return Instance;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info(ChatColor.GREEN + "Jump enabled!");
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new JumpCommand(this));
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.DARK_RED + "Jump disabled!");
    }
}
