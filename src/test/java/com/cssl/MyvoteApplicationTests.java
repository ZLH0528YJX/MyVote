package com.cssl;

import com.cssl.entity.VoteUser;
import com.cssl.mapper.VoteUserMapper;
import com.cssl.service.VoteItemService;
import com.cssl.service.VoteSubjectService;
import com.cssl.service.VoteUserService;
import com.cssl.vo.VoteView;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MyvoteApplicationTests {

    @Resource
    VoteUserService voteUserService;

    @Resource
    VoteSubjectService voteSubjectService;

    @Resource
    VoteItemService voteItemService;


    @Test
    void contextLoads() {
        VoteUser user =new VoteUser();
        user.setVuUserName("admin");
        user.setVuPassword("admin");
        System.out.println("user:"+user);
        VoteUser login = voteUserService.login(user);
        System.out.println("login:"+login);

        Integer admin = voteUserService.checkReName("admin");
        System.out.println(admin);
    }

    @Test
    void selectSubject(){
        Integer integer = voteItemService.addItem(1, 3, 1);
        System.out.println(integer);
    }

}
