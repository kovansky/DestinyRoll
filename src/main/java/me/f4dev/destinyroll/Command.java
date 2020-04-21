package me.f4dev.destinyroll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public interface Command {
  String name = "";
  String shortname = "";
  Module module = null;
  
  /**
   * ArrayList of arguments (CommandArgument)
   */
  ArrayList<CommandArgument> args = new ArrayList<>();
}
