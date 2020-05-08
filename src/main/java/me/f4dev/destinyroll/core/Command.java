package me.f4dev.destinyroll.core;

import java.util.LinkedHashMap;

public class Command {
  String name;
  String shortname;
  String module;
  Module moduleObj;
  String help;
  
  /**
   * ArrayList of arguments (CommandArgument)
   */
  LinkedHashMap<String, CommandArgument> args = new LinkedHashMap<>();
  
  public Command(String name, String shortname, String module,
                 LinkedHashMap<String, CommandArgument> args) {
    this.name = name;
    this.shortname = shortname;
    this.module = module;
    this.args = args;
    
    moduleObj = Module.getModule(module);
    moduleObj.addCommand(this);
  }
  
  public Command(String name, String shortname, String module) {
    this.name = name;
    this.shortname = shortname;
    this.module = module;
  
    moduleObj = Module.getModule(module);
    moduleObj.addCommand(this);
  }
  
  public Command(String name, String shortname) {
    this.name = name;
    this.shortname = shortname;
  }
  
  public Command(String name) {
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
  
  public String getModule() {
    return module;
  }
  
  public void setModule(String module) {
    this.module = module;
  }
  
  public LinkedHashMap<String, CommandArgument> getArgs() {
    return args;
  }
  
  public void setArgs(LinkedHashMap<String, CommandArgument> args) {
    this.args = args;
  }
  
  public void addArg(String name, CommandArgument argument) {
    args.put(name, argument);
  }
  
  public void addArg(CommandArgument argument) {
    this.addArg(argument.getName(), argument);
  }
  
  public CommandArgument getArg(String name) {
    return args.getOrDefault(name, null);
  }
  
  public void removeArg(String name) {
    args.remove(name);
  }
  
  public String getHelp() {
    return help;
  }
  
  public void setHelp(String help) {
    this.help = help;
  }
}
