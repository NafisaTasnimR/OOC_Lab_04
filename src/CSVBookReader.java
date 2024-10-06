import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVBookReader implements BookReader{
    List<Book> readBooks(String file){
        List<Book> books = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String title = values[0];
                String author = values[1];
                String genre = values[2];
                int pages = Integer.parseInt(values[3]);
                String dateRead = values[4];
                books.add(new Book(title, author, genre, pages, dateRead));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }
}
