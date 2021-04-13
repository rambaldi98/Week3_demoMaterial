import java.time.LocalDate;

public class CrispyFlour extends Material implements Comparable<CrispyFlour> {
    private int quantity;

    @Override
    public int compareTo(CrispyFlour o) {
        if (this.getCost() > o.getCost()) return 1;
        else if (this.getCost() == o.getCost()) return 0;
        else return -1;
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        LocalDate ex = this.getExpiryDate();
        if (now.isAfter(ex)) return 0;
        else
            if (now.isBefore(ex)&&
                    (now.isAfter(ex.minusMonths(2))
                            ||
                            now.isEqual(ex.minusMonths(2))))
                return getAmount()*0.6;
            else
                if(now.isBefore(ex)&&
                        (now.isAfter(ex.minusMonths(4))
                                ||
                                now.isEqual(ex.minusMonths(4))))
            return getAmount()*0.8;
                else return getAmount()*0.95;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(int id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity*this.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1);
    }

    @Override
    public String toString() {
        return "bot " + getName() + getCost();
    }
}
