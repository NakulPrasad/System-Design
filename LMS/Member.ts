import { Book } from "./Book";

export interface MemberType {
  id: number;
  name: string;
  fine: number;
  membershipType: membershipEnum;
}

export enum membershipEnum {
  member = "member",
  admin = "admin",
  librarian = "librarian",
}

export class Member {
  private static counter: number = 0;
  private id: number;
  private name: string;
  private fine: number = 0;
  private membershipType: membershipEnum;
  constructor(name: string, membershipType: membershipEnum) {
    this.name = name;
    this.membershipType = membershipType;
    this.id = ++Member.counter;
  }
  getId() {
    return this.id;
  }
  getName() {
    return this.name;
  }
  getFine() {
    return this.fine;
  }

  printMemberInfo(member: MemberType) {
    console.log(
      `${member.name} has ID: ${member.id} and owes a fine of ${member.fine}`
    );
  }
}
