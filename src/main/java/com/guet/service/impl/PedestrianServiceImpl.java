package com.guet.service.impl;

import com.guet.dao.PedestrianSearchDao;
import com.guet.domain.Page;
import com.guet.domain.PedestrianSearchInfo;
import com.guet.domain.PedestrianSearchResult;
import com.guet.service.PedestrianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * @author MicahYin
 * @date 2019/8/4 9:11
 */
@Service
@Transactional
public class PedestrianServiceImpl implements PedestrianService{
    @Autowired
    private PedestrianSearchDao pedestrianSearchDao;
    @Override
    public Page<PedestrianSearchResult> findPedestrian(PedestrianSearchInfo info, Integer currentPage) {
        HashMap<String,Object> map = new HashMap<String,Object>();
        Page<PedestrianSearchResult> page=new Page<PedestrianSearchResult>();

        page.setPageno(currentPage);
        int pageSize=10;
        page.setPagesize(pageSize);
        Long totalSize=pedestrianSearchDao.selectCount(info);
        page.setTotalsize(totalSize);
        Double num = Math.ceil(totalSize/pageSize);//向上取整
        page.setTotalno(num.intValue());
        map.put("start",(currentPage-1)*pageSize);
        map.put("size", page.getPagesize());
        page.setDatas(pedestrianSearchDao.pedestrianSearch(info,map));
        return page;
    }

    @Override
    public List<PedestrianSearchResult> findPedestrianNewest() {
        return pedestrianSearchDao.pedestrianNewest();
    }
}
