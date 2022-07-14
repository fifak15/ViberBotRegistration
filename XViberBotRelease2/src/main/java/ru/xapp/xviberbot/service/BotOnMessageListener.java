package ru.xapp.xviberbot.service;

import com.viber.bot.ViberBot;
import com.viber.bot.events.IncomingMessageEvent;
import com.viber.bot.listeners.OnMessageListener;
import com.viber.bot.messages.Profile;
import com.viber.bot.messages.TextMessage;
import com.viber.bot.server.ServerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BotOnMessageLiАstener implements OnMessageListener{
    //private final Logger logger;
    private ApplicationContext appContext;

    @Override
    public void handle(IncomingMessageEvent event, ServerResponse response) {
        // System.out.println(event.getSender())

        switch (event.getMessage().getType()) {
            case TEXT: {
                TextMessage message = (TextMessage) event.getMessage();
                //logger.info("%s: %s", event.getSender().getName(), message.getText());
                System.out.println(event.getSender().getName() + ": "+ message.getText());
                /*
                viberBot.sendMessage(message.getSender().getId(),
                        new TextMessage().setText("echo " + message.getText()));
                        */
            break;
            }
            case CONTACT: {
                break;
            }

            default: {
                System.out.println("default");
            }
        }
    }
}

