import java.util.List;
import java.util.Map;

public class BookTracker {
    private List<Book> books;

    public BookTracker(List<Book> books) {
        this.books = books;
    }

    public int getTotalBooksRead(String currentYear) {
        int totalBooks = 0;

        for (Book book : books) {
            String year = book.getDateFinished().substring(0, 4);
            if (year.equals(currentYear)) {
                totalBooks++;
            }
        }
        return totalBooks;
    }

    public void getBooksReadPerMonth() {
        int[] booksPerMonth = new int[12];

        for (Book book : books) {
            String month = book.getDateFinished().substring(5, 7);
            int monthIndex = Integer.parseInt(month) - 1;
            booksPerMonth[monthIndex]++;
        }

        System.out.println("Books read per month:");
        for (int i = 0; i < 12; i++) {
            System.out.println("Month " + (i + 1) + ": " + booksPerMonth[i]);
        }
    }

    public String getMostReadGenre() {
        String mostReadGenre = "";
        int mostReadCount = 0;

        for (Book currentBook : books) {
            String currentGenre = currentBook.getGenre();
            int genreCount = 0;

            for (Book book : books) {
                if (book.getGenre().equals(currentGenre)) {
                    genreCount++;
                }
            }

            if (genreCount > mostReadCount) {
                mostReadCount = genreCount;
                mostReadGenre = currentGenre;
            }
        }

        return mostReadGenre;
    }
    public double getAveragePages() {
        int totalPages = 0;

        for (Book book : books) {
            totalPages += book.getPages();
        }

        return books.size() == 0 ? 0 : (double) totalPages / books.size();
    }
}
