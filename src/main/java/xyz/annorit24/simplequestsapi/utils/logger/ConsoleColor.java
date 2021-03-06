package xyz.annorit24.simplequestsapi.utils.logger;

/**
 * Created by Annorit24 on 19/11/17.
 */
public enum ConsoleColor {

    /**
     * Black color
     */
    BLACK("30","§0"),

    /**
     * Red color
     */
    RED("31","§4"),

    /**
     * Green color
     */
    GREEN("32","§2"),

    /**
     * Gold color
     */
    GOLD("33","§6"),

    /**
     * Blue color
     */
    BLUE("34","§1"),

    /**
     * Magenta color
     */
    MAGENTA("35","§5"),

    /**
     * Cyan color
     */
    CYAN("36","§3"),

    /**
     * White color
     */
    WHITE("37","§f");

    /**
     * The code of the color
     * \033[1;CODEm
     */
    private String linuxCode;

    /**
     * The variables of color
     */
    private String symbol;

    /**
     * ConsoleColor constructor
     * @param linuxCode the code of the color
     * @param symbol the variables of the color
     */
    ConsoleColor(String linuxCode, String symbol) {
        this.linuxCode = linuxCode;
        this.symbol = symbol;
    }

    /**
     * Get the format code
     * @return the format code
     */
    public String getFormatCode(){
        return "\033[1;"+ linuxCode +"m";
    }

    /**
     * Get the simple code
     * @return the simple code
     */
    public String getLinuxCode() {
        return linuxCode;
    }

    /**
     * Get the variables
     * @return the variables
     */
    public String getSymbol() {
        return symbol;
    }
}
