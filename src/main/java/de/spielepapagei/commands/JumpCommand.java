package de.spielepapagei.commands;

import de.spielepapagei.Main;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class JumpCommand extends Command {

    public JumpCommand(String name, String permission, String... aliases) {
        super(name, permission, aliases);
    }

    public JumpCommand(Main main) {
        super("jump","","join");
    }

    @Override
    public void execute(CommandSender s, String[] args) {
        if ((s instanceof ProxiedPlayer)) {
            ProxiedPlayer p = (ProxiedPlayer)s;
            p.sendMessage(new ComponentBuilder("Connecting you to the lobby!").color(ChatColor.RED).create());
            p.connect(ProxyServer.getInstance().getServerInfo(args[0]));
        }
    }
}