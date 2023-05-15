package hello.core;

import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(MemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(MemberRepository(), DiscountPolicy());
    }

    private static MemoryMemberRepository MemberRepository() {
        return new MemoryMemberRepository();
    }

    private static RateDiscountPolicy DiscountPolicy() {
        return new RateDiscountPolicy();
    }

}