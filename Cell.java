
package handson3;

public class Cell<T> {

    private T data;

    // Menyimpan nilai
    public void setValue(T data) {
        this.data = data;
    }

    // Mengambil nilai
    public T getValue() {
        return data;
    }

    // Menampilkan tipe data
    public void displayType() {
        if (data != null) {
            System.out.println(
                "Tipe Data: " + data.getClass().getSimpleName()
            );
        } else {
            System.out.println("Tipe Data: Belum diisi");
        }
    }
}
