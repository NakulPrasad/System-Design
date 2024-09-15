import { Member, membershipEnum } from "./Member";
import { Book } from "./Book";
export class MemberService {
  private static instance: MemberService;
  private static members: Array<Member> = [];

  static getAllMembers(): Array<Member> {
    return MemberService.members;
  }

  getMemberById(memberId: number) {
    const member = MemberService.members.find((member) => {
      return member.getId() === memberId;
    });
    if (!member) {
      throw new Error("Member not found");
    }
    return member;
  }

  addMember(name: string, membershipType: membershipEnum) {
    const member = new Member(name, membershipType);
    MemberService.members.push(member);
  }
  static getInstance() {
    if (!this.instance) {
      this.instance = new MemberService();
    }
    return this.instance;
  }
}
