package homework2.PersonPet;

public class PetBehavior {
    boolean peeEverywhere;
    boolean bark;

    @Override
    public String toString() {
        return "PetBehavior{" +
                "peeEverywhere=" + peeEverywhere +
                ", bark=" + bark +
                '}';
    }

    public boolean isPeeEverywhere() {
        return peeEverywhere;
    }

    public void setPeeEverywhere(boolean peeEverywhere) {
        this.peeEverywhere = peeEverywhere;
    }

    public boolean isBark() {
        return bark;
    }

    public void setBark(boolean bark) {
        this.bark = bark;
    }

    public PetBehavior() {
    }

    public PetBehavior(boolean peeEverywhere, boolean bark) {
        this.peeEverywhere = peeEverywhere;
        this.bark = bark;
    }
}
