package me.f4dev.destinyroll;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import org.apache.commons.cli.*;

import javax.security.auth.login.LoginException;

public class DestinyRoll {
  public static void main(String[] args) throws ParseException, LoginException {
    CommandLine cmd = prepareParser(args);
    String token = "", prefix;
    JDABuilder builder = new JDABuilder(AccountType.BOT);
    
    if(!cmd.hasOption("t")) {
      System.err.println("You have to pass the token (-t, -token)");
      System.exit(1);
    } else {
      token = cmd.getOptionValue('t');
    }
    
    prefix = cmd.getOptionValue('p', "!");
    
    builder.setToken(token);
    builder.build();
  }
  
  private static CommandLine prepareParser(String[] args) throws ParseException {
    Options options = new Options();
    CommandLineParser parser = new DefaultParser();
    CommandLine cmd;
    
    options.addOption("t", "token", true, "Discord bot token.");
    options.addOption("p", "prefix", false, "Messages prefix.");
  
    cmd = parser.parse(options, args);
    
    return cmd;
  }
}
