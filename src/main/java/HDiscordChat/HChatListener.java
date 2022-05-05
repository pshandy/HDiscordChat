package HDiscordChat;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class HChatListener implements Listener {
    private HDiscordBot bot;

    public HChatListener(HDiscordBot bot) {
        this.bot = bot;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onChat(AsyncPlayerChatEvent event) {
        if (event.getMessage().charAt(0) == '!')
            bot.sendMessageToChannel("[D]" + event.getPlayer().getDisplayName() + ": ",  event.getMessage().substring(1));
    }
}
