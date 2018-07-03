public class Spy extends Soldier {
    private String codeNumber;

    public Spy(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d", this.getFirstName(), this.getLastName(), this.getId()))
                .append(System.lineSeparator())
                .append(String.format("Code Number: %s", this.codeNumber));
        return sb.toString();
    }

}
