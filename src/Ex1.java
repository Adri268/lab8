import java.io.File;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {
        try {
            File fila = new File("filename.txt");
            if  (fila.createNewFile())
            {
                System.out.println("File created:" + fila .getName());
            } else {
                System.out.println("File already exists !");
            }
        }
            catch (IOException e){
            System.out.println("Eroare");
            e.printStackTrace();
        }
    }
}
