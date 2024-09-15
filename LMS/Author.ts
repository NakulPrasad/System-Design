import { BookType } from "./Book";

export interface AuthorType {
  id: number;
  name: string;
}

export class Author {
  private id: number;
  private name: string;
  private booksWritten: Array<BookType>;
  constructor({ id, name }: AuthorType) {
    this.id = id;
    this.name = name;
  }
  getId(): number {
    return this.id;
  }
  getName(): string {
    return this.name;
  }
  getBooksWritten(): Array<BookType> {
    return this.booksWritten;
  }
  addBook(book: BookType): void {
    this.booksWritten.push(book);
  }
}
