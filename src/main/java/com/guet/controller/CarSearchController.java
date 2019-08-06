package com.guet.controller;

import com.guet.domain.Page;
import com.guet.domain.CarSearchInfo;
import com.guet.domain.CarSearchResult;
import com.guet.service.CarSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @author MicahYin
 * @date 2019/7/24 16:20
 * 用于处理车辆搜索的Controller
 */
@Controller
@RequestMapping("/carSearch")
public class CarSearchController {

    @Autowired
    private CarSearchService carSearchService;

    private CarSearchInfo info;
    /**
     * 车辆搜索的处理方法
     * @return
     */
    @RequestMapping("/findCar.do")
    public ModelAndView findCar(CarSearchInfo info){
       this.info=info;
       ModelAndView mv=new ModelAndView();
        Page<CarSearchResult> results=carSearchService.findCar(info,1);
        mv.addObject("pageResults",results);
        mv.setViewName("car_search_result");
       return mv;
    }
    @RequestMapping("/pageQuery.do")
    public ModelAndView pageQuery(@RequestParam(value="currentPage",defaultValue="1",required=false)int currentPage){
        //查询
        Date start=new Date();
        ModelAndView mv=new ModelAndView();
        Page<CarSearchResult> results=carSearchService.findCar(info,currentPage);
        mv.addObject("pageResults",results);
        mv.setViewName("car_search_result");
        Date end=new Date();
        System.out.println("CarSearch总耗时:"+(end.getTime()-start.getTime()));
        return mv;
    }
}
