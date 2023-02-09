package hello.core;

import hello.core.member.Grade;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.Member;


public class MemberApp {
    //순수 자바 테스트, spring은 하나도 없음

    public static void main(String[] args){
        MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L, "james", Grade.VIP);
        memberService.join(member);

        System.out.println("find member : "+member);
        System.out.println("memberService.findById(1L) = " + memberService.findMember(1L));

    }
}
