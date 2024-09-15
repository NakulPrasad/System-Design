export interface BookType {
  id: number;
  title: string;
  author: string;
  genre: string;
  publishingDate: string;
  issuedToList: Array<number>;
}

export class Book {
  private static counter: number = 0;
  private id: number;
  private title: string;
  private author: string;
  private genre: string;
  private quantity: number = 5;
  private publishingDate: number;
  constructor(
    title: string,
    author: string,
    genre: string,
    publishingDate: number
  ) {
    this.id = ++Book.counter;
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.publishingDate = publishingDate;
  }
  getId() {
    return this.id;
  }
  decrementQuantity(): void {
    this.quantity -= 1;
  }
}
