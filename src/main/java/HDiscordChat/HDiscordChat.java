package HDiscordChat;

import org.bukkit.plugin.java.JavaPlugin;

public class HDiscordChat extends JavaPlugin {

    private HDiscordBot bot;
    HChatListener chatListener;

    @Override
    public void onEnable() {

        getLogger().info("Плагин запустился!");
        bot = new HDiscordBot(getLogger());

        getServer().getPluginManager().registerEvents(new HChatListener(bot), this);
    }
}
