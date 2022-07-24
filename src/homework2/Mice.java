package homework2;

public class Mice {
    private double weight;
    private String colour;

    public Mice(double weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setColour(String NewColour) {
        this.colour = NewColour;
    }

    public String getColour() {
        return this.colour;
    }
}