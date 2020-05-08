package me.f4dev.destinyroll;

import java.util.LinkedHashMap;

public class Module {
  String name;
  String shortname;
  
  LinkedHashMap<String, Command> commands = new LinkedHashMap<>();
  
  public Module(String name, String shortname, LinkedHashMap<String, Command> commands) {
    this.name = name;
    this.shortname = shortname;
    this.commands = commands;
  }
  
  public Module(String name, String shortname) {
    this.name = name;
    this.shortname = shortname;
  }
  
  public Module(String name) {
    this.name = name;
    this.shortname = name;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getShortname() {
    return shortname;
  }
  
  public void setShortname(String shortname) {
    this.shortname = shortname;
  }
  
  public LinkedHashMap<String, Command> getCommands() {
    return commands;
  }
  
  public void setCommands(LinkedHashMap<String, Command> commands) {
    this.commands = commands;
  }
  
  public void addCommand(String name, Command command) {
    commands.put(name, command);
  }
  
  public void addCommand(Command command) {
    this.addCommand(command.getName(), command);
  }
  
  public Command getCommand(String name) {
    return commands.getOrDefault(name, null);
  }
  
  public void removeCommand(String name) {
    commands.remove(name);
  }
}
