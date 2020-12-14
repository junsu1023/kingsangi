package calculator.enums;

/**
 * <p>{@code Operator} enumeration allows a {@code Calculator} class to calculate using variable operators.</p>
 *
 * @author Seungmin Yang
 */
public enum Operator {
    OPENBR("(", 0),
    CLOSEBR(")", 0),
    ADD("+", 1),
    SUB("-", 1),
    MUL("×", 2),
    DIV("÷", 2),
    POW("^", 4),
    SQRT("\u221A", 3),
    FACT("!", 3),
    SIN("sin", 3),
    COS("cos", 3),
    TAN("tan", 3),
    ASIN("sin\u207b\u00b9", 3),
    ACOS("cos\u207b\u00b9", 3),
    ATAN("tan\u207b\u00b9", 3),
    LOG("log", 3),
    LN("ln", 3),
    PER("%", 3);

    private String display;
    private int priority;

    Operator(String display, int priority) {
        this.display = display;
        this.priority = priority;
    }

    public String getDisplayString() {
        return display;
    }

    public int getPriority() {
        return priority;
    }
}
