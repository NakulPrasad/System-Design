import { Book } from "./Book";
import { Member } from "./Member";
import { MemberService } from "./MemberService";

export class BookService {
  private static instance: BookService;
  private static books: Array<Book> = [];
  private static booksIssued: Map<Member, Book>;

  static getAllBooks(): Array<Book> {
    return BookService.books;
  }

  static getBookById(bookId: number) {
    const book = this.books.find((book) => {
      return book.getId() === bookId;
    });

    if (!book) {
      throw new Error("book not found");
    }
    return book;
  }

  static getAllBooksOfMemberById(memberId: number) {
    // const member = MemberService.getMemberById(memberId);
  }

  addBook(
    title: string,
    author: string,
    genre: string,
    publishingDate: number
  ) {
    const book = new Book(title, author, genre, publishingDate);
    BookService.books.push(book);
    // console.log(BookService.getAllBooks);
  }

  issueBook(memberId: number, bookId: number): void {
    // console.log(this.members);
    const member = MemberService.getMemberById(memberId);
    const book = BookService.getBookById(bookId);

    book.decrementQuantity();
  }

  static getInstance(): BookService {
    if (!BookService.instance) {
      BookService.instance = new BookService();
    }
    return BookService.instance;
  }
}
