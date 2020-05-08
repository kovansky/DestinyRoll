package me.f4dev.destinyroll.commands;

import me.f4dev.destinyroll.DestinyRoll;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class CommandListener extends ListenerAdapter {
  @Override
  public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
    String message = event.getMessage().getContentRaw();
  
    if(message.startsWith(DestinyRoll.prefix)) {
      String[] msgCut = message.split(" ");
      String msgModule = msgCut[0].substring(DestinyRoll.prefix.length());
      String msgCommand = msgCut[1];
  
      
    }
  }
}
