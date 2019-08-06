package com.guet.controller;

import com.guet.domain.Page;
import com.guet.domain.PedestrianSearchInfo;
import com.guet.domain.PedestrianSearchResult;
import com.guet.service.PedestrianService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author MicahYin
 * @date 2019/7/28 10:45
 * 行人
 */
@Controller
@RequestMapping("/pedestrianSearch")
public class PedestrianSearch {
    @Autowired
    private PedestrianService pedestrianService;
    private PedestrianSearchInfo info;

    @RequestMapping("/findPedestrian.do")
    public ModelAndView findPedestrian(PedestrianSearchInfo info){
        this.info=info;
        ModelAndView mv=new ModelAndView();
        Page<PedestrianSearchResult> results=pedestrianService.findPedestrian(info,1);
        mv.addObject("pageResults",results);
        mv.setViewName("pedestrian_search_result");
        return mv;
    }

    @RequestMapping("/pageQuery.do")
    public ModelAndView pageQuery(@RequestParam(value="currentPage",defaultValue="1",required=false)int currentPage) {
        //查询
        ModelAndView mv=new ModelAndView();
        Page<PedestrianSearchResult> results=pedestrianService.findPedestrian(info,currentPage);
        mv.addObject("pageResults",results);
        mv.setViewName("pedestrian_search_result");
        return mv;
    }

    @RequestMapping("/findPedestrianNewest.do")
    @ResponseBody
    public String findPedestrianNewest(){
        return JSONArray.fromObject(pedestrianService.findPedestrianNewest()).toString();
    }
}
