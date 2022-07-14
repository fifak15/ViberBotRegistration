package ru.xapp.xviberbot.service;

import com.viber.bot.events.IncomingConversationStartedEvent;
import com.viber.bot.listeners.OnConversationStartedListener;
import com.viber.bot.messages.TextMessage;
import com.viber.bot.server.ServerResponse;
import org.springframework.stereotype.Service;


@Service
public class BotOnConversationStartedListener implements OnConversationStartedListener {
    @Override
    public void handle(IncomingConversationStartedEvent event, ServerResponse response) {
        String name = event.getUser().getName();
    }
}
