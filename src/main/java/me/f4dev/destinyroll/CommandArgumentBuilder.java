package me.f4dev.destinyroll;

import me.f4dev.destinyroll.errors.RequiredFieldsEmptyException;

public class CommandArgumentBuilder {
  /**
   * Used in help.
   */
  private String name;
  /**
   * Used in commands.
   */
  private String shortname;
  /**
   * Used in commands as tag (-tag form).
   */
  private String tag = "";
  /**
   * Default value, if argument is not provided in tag.
   */
  private String defaultValue;
  /**
   * If argument is required.
   */
  private Boolean required = false;
  /**
   * If argument should be used in tagged form (-tag)
   */
  private Boolean tagged = false;
  /**
   * Argument description used in help.
   */
  private String help = "";
  
  public CommandArgumentBuilder setName(String name) {
    this.name = name;
    return this;
  }
  
  public CommandArgumentBuilder setShortname(String shortname) {
    this.shortname = shortname;
    return this;
  }
  
  public CommandArgumentBuilder setTag(String tag) {
    this.tag = tag;
    return this;
  }
  
  public CommandArgumentBuilder setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }
  
  public CommandArgumentBuilder setRequired(Boolean required) {
    this.required = required;
    return this;
  }
  
  public CommandArgumentBuilder setTagged(Boolean tagged) {
    this.tagged = tagged;
    return this;
  }
  
  public CommandArgumentBuilder setHelp(String help) {
    this.help = help;
    return this;
  }
  
  public CommandArgument build() throws RequiredFieldsEmptyException {
    if(name != null && shortname != null && defaultValue != null) {
      return new CommandArgument(name, shortname, tag, defaultValue, required, tagged, help);
    } else {
      throw new RequiredFieldsEmptyException();
    }
  }
}
