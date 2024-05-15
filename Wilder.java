public class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // getters

    public String getFirstname() {
        return this.firstname;
    }
    public String isAware() {
        if (this.aware == true) {
            return "je suis aware";
        } else {
            return "Je ne suis pas aware";
        }
    }

    // setters

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setAware(boolean aware) {
        this.aware = aware;
    }

    // methode

    public String whoAmI() {
        return "Je m'appelle " + this.getFirstname() + " et " + String.valueOf(this.isAware());
    }

}

