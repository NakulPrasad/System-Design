import { BookService } from "./BookService";
import { membershipEnum } from "./Member";
import { MemberService } from "./MemberService";

class Library {
  private static instance: Library;

  printStatus() {
    console.log(
      `Members : ${JSON.stringify(
        MemberService.getAllMembers()
      )} \n  Books :${JSON.stringify(BookService.getAllBooks())}
    `
    );
  }

  static getInstance(): Library {
    if (!this.instance) {
      this.instance = new Library();
    }
    return Library.instance;
  }
}

//main app
console.log("working");
const library = new Library();
const memberService = new MemberService();
const bookService = new BookService();
bookService.addBook("Love", "chetan bhagat", "romantic", Date.now());
memberService.addMember("nakul", membershipEnum.member);
library.printStatus();
// library.printAllBooksOfUserById(1);
