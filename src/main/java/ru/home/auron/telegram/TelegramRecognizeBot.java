package ru.home.auron.telegram;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import ru.home.auron.config.BotConfig;

@Component
@Slf4j
public class TelegramRecognizeBot extends TelegramLongPollingBot {

    private final BotConfig botConfig;

    public TelegramRecognizeBot(BotConfig botConfig){
        this.botConfig = botConfig;
    }

    @Override
    public String getBotUsername() {
        return botConfig.getBotUserName();
    }

    @Override
    public String getBotToken() {
        return botConfig.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        log.info("Text: {}", update.getMessage().getText());
    }
}
