package com.guet.controller;

import com.guet.dao.Page;
import com.guet.domain.FaceSearchInfo;
import com.guet.domain.FaceSearchResult;
import com.guet.service.FaceSearchService;
import com.guet.util.ElasticSearchTool;
import org.elasticsearch.action.search.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * @author MicahYin
 * @date 2019/7/28 10:43
 * 用于处理人脸搜索
 */
@Controller
@RequestMapping("/faceSearch")
public class FaceSearchController {
    @Autowired
    private FaceSearchService faceSearchService;

    private FaceSearchInfo infomation;
    @RequestMapping("/findFace.do")
    public ModelAndView faceSearch(FaceSearchInfo info){
        this.infomation=info;
        ModelAndView mv=new ModelAndView();
        Page<FaceSearchResult> results=faceSearchService.findFace(info,1);
        mv.addObject("pageResults",results);
        mv.setViewName("face_search_result");
        return mv;
    }

    @RequestMapping("/pageQuery.do")
    public ModelAndView pageQuery(@RequestParam(value="currentPage",defaultValue="1",required=false)int currentPage){
        //查询
        Date start=new Date();
        ModelAndView mv=new ModelAndView();
        Page<FaceSearchResult> results=faceSearchService.findFace(infomation,currentPage);
        mv.addObject("pageResults",results);
        mv.setViewName("face_search_result");
        Date end=new Date();
        System.out.println("总耗时:"+(end.getTime()-start.getTime()));
        return mv;
    }
}
