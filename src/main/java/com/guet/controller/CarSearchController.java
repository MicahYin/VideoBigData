package com.guet.controller;

import com.guet.domain.CarSearchInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MicahYin
 * @date 2019/7/24 16:20
 * 用于处理车辆搜索的Controller
 */
@Controller
@RequestMapping("/carSearch")
public class CarSearchController {
    /**
     * 车辆搜索的处理方法
     * @return
     */
    @RequestMapping("/findCar.do")
    public void findCar(CarSearchInfo info){
        System.out.println(info.getSpeed());
        System.out.println("ff"+info.getSpeed().isEmpty());
        System.out.println(info.getSpeed().equals(""));
        System.out.println(info);
    }
}
