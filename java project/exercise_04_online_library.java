

/*
your have to implement a  library using java class library
methods:- add-book,issue-book,return-book,show-available-books
properties:
array to store the available book
array to  store the issue book
 */

class library {
    String[] books=new String[50];// memory assign for add books
    int totalbooks=0;


    // method add-book
    public void add_book(String books) {
        this.books[totalbooks] = books;
        this.totalbooks++;
        System.out.println("add books are: "+books);
    }

    // method for show available books
    public void show_available_books() {
        System.out.println("available books are!");
        for (String books : this.books
        ) {
            if (books == null) {
                continue;
            }
            System.out.println("# " + books);
        }
    }

// method for issue books
    public void issue_books(String books){
        for (int i = 0; i <this.books.length ; i++) {
            if (this.books[i].equals(books)) {
                System.out.println("books has been issued! ");
                this.books[i]=null;
                return;
            }
        }
                System.out.println("books are not available ");


        }

     // method for issue books
       public  void return_books(String book){
        add_book(book);
       }
    }

public class exercise_04_online_library {
    public static void main(String[] args) {
        library books = new library();
        books.add_book("maths");
        books.add_book("physics");
        books.add_book("data stucture");
        books.add_book("java ");
        books.add_book("python");
        books.add_book("networking fundamental");
        books.add_book("ethical hacking ");

       books.show_available_books();

        books.issue_books("python");
        books.return_books("python");
        System.out.println("after return books : ");
        books.show_available_books();

    }
}
