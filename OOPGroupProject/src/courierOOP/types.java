public class types {
    public String name;
    public double weight;
    public int distance;
    public int level;
    public double cost;

    public types (String name, Double weight, int distance, int level) {
        this.name = name;
        this.weight = weight;
        this.distance = distance;
        this.level = level;
        this.cost = (double)weight * (double)distance * level;
    }

    public String delivery() {
        return "delivery";
    }

    public String toString() {
        return "Type : " + this.name + "\nWeight (kg) : " + this.weight + "\nDistance (m) : " + this.distance + "\nLevel : " + this.level + "\nCost : " + this.cost + "\n";
    }
}
