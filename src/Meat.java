import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    @Override
    public double getAmount() {
        return weight*this.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusDays(7);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Meat(int id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        LocalDate ex = this.getExpiryDate();
        if (now.isAfter(ex)) return 0;
        else
        if (now.isBefore(ex)&&
                (now.isAfter(ex.minusDays(3))
                        ||
                        now.isEqual(ex.minusDays(3))))
            return getAmount()*0.5;
        else
        if(now.isBefore(ex)&&
                (now.isAfter(ex.minusDays(5))
                        ||
                        now.isEqual(ex.minusDays(5))))
            return getAmount()*0.7;
        else return getAmount()*0.9;

    }
}
