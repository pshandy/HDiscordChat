package HDiscordChat;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.utils.MarkdownUtil;

import javax.security.auth.login.LoginException;
import java.util.logging.Logger;

public class HDiscordBot {

    private JDA jda;
    private Logger log;

    public HDiscordBot(Logger log) {
        this.log = log;
        try {
            String token = "OTcxODc1NzU1NTM5NzIyMjkw.YnQ31A.B8Fm69xEYxSxJKIPMg7msm-YIK8";
            jda = JDABuilder.createDefault(token)
                    .setStatus(OnlineStatus.DO_NOT_DISTURB)
                    .build();
        } catch (LoginException e) {
            log.info("Ошибка авторизации.");
        }
    }

    public void sendMessageToChannel(String sender, String message) {
            TextChannel textChannel = this.jda.getTextChannelById("971894551503581194");
            if (textChannel != null)
                textChannel.sendMessage(MarkdownUtil.monospace("Onyx:") + "\n"
                        + MarkdownUtil.quoteBlock(MarkdownUtil.bold(sender) + message)).queue();
    }
}
