package money;

public class Dollar {
    private int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    public boolean equals(Object object) {
        // TODO hate this cast
        // TODO allow a null argument
        // TODO allow an another type argument
        Dollar dollar = (Dollar) object;
        return this.amount == dollar.amount;
    }

    // TODO implement hashCode
}
