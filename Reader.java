package four;

public class Reader {
        private String name;
        private String favoriteGenre;

        private Book lastBook;

        public Reader(String name, String favoriteGenre) {
            this.name = name;
            this.favoriteGenre = favoriteGenre;
        }

        public String getName() {
            return name;
        }

        public String getFavoriteGenre() {
            return favoriteGenre;
        }

        public void readBook(Book book) {
            this.lastBook = book;
            book.setRead(true);
        }

        public String getLastBookInfo() {
            if (lastBook == null) {
                return "Пока ничего не читал";
            }
            return lastBook.describe();
        }

        public static void main(String[] args) {
            Reader reader1 = new Reader("Алексей", "Фантастика");
            Reader reader2 = new Reader("Мария", "Классика");

            Book book1 = new Book("Дюна", "Фрэнк Герберт", 704, false);
            Book book2 = new Book("Мастер и Маргарита", "Михаил Булгаков", 480, false);
            Book book3 = new Book("1984", "Джордж Оруэлл", 328, false);

            System.out.println(reader1.getName() + " (до чтения): " + reader1.getLastBookInfo());

            reader1.readBook(book1);
            reader2.readBook(book2);
            reader2.readBook(book3);

            System.out.println(reader1.getName() + " -> " + reader1.getLastBookInfo());
            System.out.println(reader2.getName() + " -> " + reader2.getLastBookInfo());
        }
}
