public class Mission {
    private static final String DEFAULT_STATE_PROG = "inProgress";
    private static final String DEFAULT_STATE_FIN = "Finished";

    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        this.setState(state);
    }

    private void setState(String state) {
        if (!(DEFAULT_STATE_FIN.equals(state) || DEFAULT_STATE_PROG.equals(state))){
            throw new IllegalArgumentException();
        }
        this.state = state;
    }

    @Override
    public String toString(){
        return String.format("  Code Name: %s State: %s", this.codeName, this.state);
    }
}
