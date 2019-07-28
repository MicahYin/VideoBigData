package com.guet.dao;

import com.guet.domain.CarSearchInfo;
import com.guet.domain.CarSearchResult;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author MicahYin
 * @date 2019/7/24 16:21
 */
@Repository
public class CarSearchDao {
    /**
     *  在ES中查询符合条件的Car
     * @param info 查询条件封装类
     * @return 查询结果封装在CarSearchResult中并返回list
     */
    public List<CarSearchResult> carSearch(CarSearchInfo info){
        return null;
    }
}
