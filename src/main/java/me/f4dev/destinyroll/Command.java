package me.f4dev.destinyroll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Command {
  String name;
  String shortname;
  Module module = null;
  
  /**
   * ArrayList of arguments (CommandArgument)
   */
  LinkedHashMap<String, CommandArgument> args = new LinkedHashMap<>();
  
  public Command(String name, String shortname, Module module, LinkedHashMap<String, CommandArgument> args) {
    this.name = name;
    this.shortname = shortname;
    this.module = module;
    this.args = args;
  }
  
  public Command(String name, String shortname, Module module) {
    this.name = name;
    this.shortname = shortname;
    this.module = module;
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
  
  public Module getModule() {
    return module;
  }
  
  public void setModule(Module module) {
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
}
