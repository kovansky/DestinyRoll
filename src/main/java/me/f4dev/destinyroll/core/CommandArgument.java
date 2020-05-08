package me.f4dev.destinyroll.core;

public class CommandArgument {
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
  
  public CommandArgument(String name, String shortname, String tag, String defaultValue,
                         Boolean required, Boolean tagged, String help) {
    this.name = name;
    this.shortname = shortname;
    this.tag = tag;
    this.defaultValue = defaultValue;
    this.required = required;
    this.tagged = tagged;
    this.help = help;
  }
  
  public CommandArgument(String name, String shortname, String tag, String defaultValue,
                         Boolean required, Boolean tagged) {
    this.name = name;
    this.shortname = shortname;
    this.tag = tag;
    this.defaultValue = defaultValue;
    this.required = required;
    this.tagged = tagged;
  }
  
  public CommandArgument(String name, String shortname, String defaultValue, Boolean required,
                         String help) {
    this.name = name;
    this.shortname = shortname;
    this.defaultValue = defaultValue;
    this.required = required;
    this.help = help;
  }
  
  public CommandArgument(String name, String shortname, String defaultValue, Boolean required) {
    this.name = name;
    this.shortname = shortname;
    this.defaultValue = defaultValue;
    this.required = required;
  }
  
  public CommandArgument(String name, String shortname, String defaultValue, String help) {
    this.name = name;
    this.shortname = shortname;
    this.defaultValue = defaultValue;
    this.help = help;
  }
  
  public CommandArgument(String name, String shortname, String defaultValue) {
    this.name = name;
    this.shortname = shortname;
    this.defaultValue = defaultValue;
  }
  
  public String getHelp() {
    return help;
  }
  
  public void setHelp(String help) {
    this.help = help;
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
  
  public String getTag() {
    return tag;
  }
  
  public void setTag(String tag) {
    this.tag = tag;
  }
  
  public String getDefaultValue() {
    return defaultValue;
  }
  
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }
  
  public Boolean getRequired() {
    return required;
  }
  
  public void setRequired(Boolean required) {
    this.required = required;
  }
  
  public Boolean getTagged() {
    return tagged;
  }
  
  public void setTagged(Boolean tagged) {
    this.tagged = tagged;
  }
}
