
package handson3;

public class Main {

    public static void main(String[] args) {

        // Membuat Cell untuk Integer
        Cell<Integer> cellAngka = new Cell<>();

        cellAngka.setValue(100);

        System.out.println("=== CELL INTEGER ===");
        System.out.println("Nilai: " + cellAngka.getValue());
        cellAngka.displayType();

        System.out.println();

        // Membuat Cell untuk String
        Cell<String> cellNama = new Cell<>();

        cellNama.setValue("Belajar Generic Java");

        System.out.println("=== CELL STRING ===");
        System.out.println("Nilai: " + cellNama.getValue());
        cellNama.displayType();

    }
}
