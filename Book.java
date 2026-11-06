package four;

public class Book {
    private String title;
    private String author;
    private int pages;
    private boolean isRead;

    // 2. Конструктор, принимающий все 4 параметра
    public Book(String title, String author, int pages, boolean isRead) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isRead = isRead;
    }

    // 3. Геттеры для всех полей
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public boolean isRead() {
        return isRead;
    }

    // 4. Сеттер только для isRead
    public void setRead(boolean read) {
        isRead = read;
    }

    // 5. Метод describe()
    public String describe() {
        return "Книга:" + title + " автор " + author + "," + pages + ",стр.прочитанно:" + isRead;
    }

    // 6. Создание 3 объектов и вызов describe() в main
    public static void main(String[] args) {
        Book book1 = new Book("Дюна", "Фрэнк Герберт", 768, true);
        Book book2 = new Book("1984", "Джордж Оруэлл", 328, false);
        Book book3 = new Book("Мастер и Маргарита", "Михаил Булгаков", 480, true);

        System.out.println(book1.describe());
        System.out.println(book2.describe());
        System.out.println(book3.describe());
    }
}
