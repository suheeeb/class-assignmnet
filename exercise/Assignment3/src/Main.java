public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Rich Dad Poor Dad", "Roobert Kiyosaki", "123456789", 13);
        Book book2 = new Book("48 Laws of Power", "Robert Green", "987654321", 20);
        library.addBook(book1);
        library.addBook(book2);
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");
        library.registerMember(member1);
        library.registerMember(member2);
        library.lendBook("123456789", "M001"); // Alice borrows "Rich Dad Poor Dad"
        library.lendBook("987654321", "M002"); // Bob borrows "48 Laws of Power"
        System.out.println("Books and members have been processed.");
    }
}
