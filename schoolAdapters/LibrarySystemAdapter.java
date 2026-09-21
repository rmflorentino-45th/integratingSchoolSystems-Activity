package schoolAdapters;

public class LibrarySystemAdapter implements SchoolManagementApp {
    private LibrarySystem books;

    public LibrarySystemAdapter(LibrarySystem books) {
        this.books = books;
    }

    @Override
    public void integrateSystem() {
        books.manageBooks();
    }

}