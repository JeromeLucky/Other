package com.jerome.shhs.user.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.jerome.shhs.common.RedisBaiseTakes;
import com.jerome.shhs.user.entity.SeeUser;

@Controller
@RequestMapping("test")
public class TestController {

    @Resource(name="seeUserRedisTakes")
    private RedisBaiseTakes seeUserRedisTakes;

    @RequestMapping("/hello.do")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
        System.out.println("hello see");
        seeUserRedisTakes.add("hello1","zxm");
        mv.setViewName("hello");
        return mv;
    }
    @RequestMapping("/hello2.do")
    public ModelAndView hello2(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        SeeUser seeUser = new SeeUser();
        seeUser.setId("1");
        seeUser.setIp("1121");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        seeUser.setSeeTime(simpleDateFormat.format(new Date()));
        seeUser.setSeeCount(1);
        seeUserRedisTakes.addObj("seeUser",seeUser.getId(),seeUser);
        seeUser.setId("2");
        seeUser.setIp("332323");
        seeUser.setSeeTime(simpleDateFormat.format(new Date()));
        seeUser.setSeeCount(2);
        seeUserRedisTakes.addObj("seeUser",seeUser.getId(),seeUser);
        
        
        mv.setViewName("hello");
        return mv;
    }
    @RequestMapping("/hello3.do")
    public ModelAndView hello3(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        SeeUser seeUser = (SeeUser) seeUserRedisTakes.getObj("seeUser","1");
        SeeUser seeUser2 = (SeeUser) seeUserRedisTakes.getObj("seeUser","2");
        if(seeUser!=null){
            System.out.println(seeUser.getId()+"======="+seeUser.getIp()+"======"+seeUser.getSeeTime()+"======="+seeUser.getSeeCount());
            System.out.println(seeUser2.getId()+"======="+seeUser2.getIp()+"======"+seeUser2.getSeeTime()+"======="+seeUser2.getSeeCount());
        }

        mv.setViewName("hello");
        return mv;
    }

}
