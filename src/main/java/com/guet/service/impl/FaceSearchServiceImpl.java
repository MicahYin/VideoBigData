package com.guet.service.impl;

import com.guet.dao.FaceSearchDao;
import com.guet.domain.Page;
import com.guet.domain.FaceSearchInfo;
import com.guet.domain.FaceSearchResult;
import com.guet.service.FaceSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author MicahYin
 * @date 2019/7/24 16:23
 */
@Service
public class FaceSearchServiceImpl implements FaceSearchService{
    @Autowired
    private FaceSearchDao faceSearchDao;
    @Override
    public Page<FaceSearchResult> findFace(FaceSearchInfo info, Integer currentPage) {
        HashMap<String,Object> map = new HashMap<String,Object>();
        Page<FaceSearchResult> page=new Page<FaceSearchResult>();

        page.setPageno(currentPage);
        int pageSize=10;
        page.setPagesize(pageSize);
        Long totalSize=faceSearchDao.selectCount(info);
        page.setTotalsize(totalSize);
        Double num = Math.ceil(totalSize/pageSize);//向上取整
        page.setTotalno(num.intValue());
        map.put("start",(currentPage-1)*pageSize);
        map.put("size", page.getPagesize());
        page.setDatas(faceSearchDao.faceSearch(info,map));
        return page;
    }

    @Override
    public List<FaceSearchResult> findFaceNewest() {
        return faceSearchDao.faceNewest();
    }
}
