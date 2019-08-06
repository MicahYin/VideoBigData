package com.guet.service.impl;

import com.guet.dao.CarSearchDao;
import com.guet.domain.Page;
import com.guet.domain.CarSearchInfo;
import com.guet.domain.CarSearchResult;
import com.guet.service.CarSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author MicahYin
 * @date 2019/7/31 14:44
 */
@Service
public class CarSearchServiceImpl implements CarSearchService{
    @Autowired
    private CarSearchDao carSearchDao;
    @Override
    public Page<CarSearchResult> findCar(CarSearchInfo info, Integer currentPage){
        HashMap<String,Object> map = new HashMap<String,Object>();
        Page<CarSearchResult> page=new Page<CarSearchResult>();
        page.setPageno(currentPage);
        int pageSize=10;
        page.setPagesize(pageSize);
        Long totalSize=carSearchDao.selectCount(info);
        page.setTotalsize(totalSize);
        Double num = Math.ceil(totalSize/pageSize);//向上取整
        page.setTotalno(num.intValue());

        map.put("start",(currentPage-1)*pageSize);
        map.put("size", page.getPagesize());

        page.setDatas(carSearchDao.carSearch(info,map));

        return page;
    }
}
