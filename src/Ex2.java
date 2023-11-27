import java.io.FileWriter;
import java.io.IOException;

public class Ex2 {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Mi somn !");
            myWriter.close();
            System.out.println("A functionat !");
        }
          catch (IOException e){
            System.out.println("Eroare !");
            e.printStackTrace();
          }
    }
}
