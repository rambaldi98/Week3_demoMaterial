import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Material[] materials = getMaterials();
        MaterialManager kieuAnh = new MaterialManager(materials);
        kieuAnh.getAllInfor();
        Arrays.sort(materials);
        kieuAnh.getAllInfor();
    }

    private static Material[] getMaterials() {
        CrispyFlour c1= new CrispyFlour(1, "B1", LocalDate.of(2020, 6, 13), 1002, 1);
        CrispyFlour c2= new CrispyFlour(1, "B1", LocalDate.of(2020, 5, 13), 1003, 1);
        CrispyFlour c3= new CrispyFlour(1, "B1", LocalDate.of(2020, 4, 13), 1, 1);
        CrispyFlour c4= new CrispyFlour(1, "B1", LocalDate.of(2020, 3, 13), 4000, 1);
        CrispyFlour c5= new CrispyFlour(1, "B1", LocalDate.of(2020, 2, 13), 90, 1);
        Meat m1 = new Meat(2, "M1", LocalDate.of(2021, 4, 14), 100, 1.2);
//        Meat m2 = new Meat(2, "M1", LocalDate.of(2021, 4, 14), 100, 1.2);
//        Meat m3 = new Meat(2, "M1", LocalDate.of(2021, 4, 14), 100, 1.2);
//        Meat m4 = new Meat(2, "M1", LocalDate.of(2021, 4, 14), 100, 1.2);
//        Meat m5 = new Meat(2, "M1", LocalDate.of(2021, 4, 14), 100, 1.2);
        Material[] materials = {c1, c2, c3, c4, c5, m1};
        return materials;
    }
}
