package me.f4dev.destinyroll.core;

import java.util.LinkedHashMap;

public class Module {
  String name;
  String shortname;
  String help;
  
  static LinkedHashMap<String, Module> modules = new LinkedHashMap<>();
   LinkedHashMap<String, Command> commands = new LinkedHashMap<>();
  
  public Module(String name, String shortname, LinkedHashMap<String, Command> commands) {
    this.name = name;
    this.shortname = shortname;
    this.commands = commands;
    
    addModule(this);
  }
  
  public Module(String name, String shortname) {
    this.name = name;
    this.shortname = shortname;
    
    addModule(this);
  }
  
  public Module(String name) {
    this.name = name;
    this.shortname = name;
    
    addModule(this);
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
    addCommand(command.getName(), command);
  }
  
  public Command getCommand(String name) {
    return commands.getOrDefault(name, null);
  }
  
  public void removeCommand(String name) {
    commands.remove(name);
  }
  
  public String getHelp() {
    return help;
  }
  
  public void setHelp(String help) {
    this.help = help;
  }
  
  public static void addModule(String name, Module module) {
    modules.put(name, module);
  }
  
  public static void addModule(Module module) {
    addModule(module.getName(), module);
  }
  
  public static Module getModule(String name) {
    return modules.getOrDefault(name, null);
  }
  
  public static void removeModule(String name) {
    modules.remove(name);
  }
}
