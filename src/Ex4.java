import java.io.File;
public class Ex4 {
    public static void main(String[] args) {
        File fila = new File("filename.txt");
        if (fila.delete()) {
            System.out.println("Deleted the file: " + fila.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}