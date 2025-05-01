
package gcu.jpa.h2.member.controller;

import org.springframework.web.bind.annotation.*;
import gcu.jpa.h2.member.entity.Member;
import gcu.jpa.h2.member.repository.MemberRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    
    private final MemberRepository memberRepository;
    
    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    
    @PostMapping
    public Member create(@RequestBody Member member) {
        return memberRepository.save(member);
    }

    @GetMapping
    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
