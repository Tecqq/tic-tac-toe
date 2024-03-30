public enum WinCause {

    X,
    O,
    DRAW,
    NO_WIN;

    public static WinCause getCause(String name) {

        for (WinCause cause : WinCause.values()) {
            if (cause.name().equalsIgnoreCase(name)) return cause;
        }
        return null;
    }
}
