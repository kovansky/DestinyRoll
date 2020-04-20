package me.f4dev.destinyroll;

import org.apache.commons.cli.*;

public class DestinyRoll {
  public static void main(String[] args) throws ParseException {
    CommandLine cmd = prepareParser(args);
    
    
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
