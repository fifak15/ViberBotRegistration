package ru.xapp.xviberbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.xapp.xviberbot.service.Bot;

@EnableScheduling
@SpringBootApplication
public class XViberBotApplication {

	public static void main(String[] args) throws TelegramApiException {
		SpringApplication.run(XViberBotApplication.class, args);

		TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
		try {
			telegramBotsApi.registerBot(new Bot());

		} catch (TelegramApiRequestException e) {
			e.printStackTrace();
		}
	}
}
