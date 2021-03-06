package com.guet.service;

import com.guet.domain.Page;
import com.guet.domain.CarSearchInfo;
import com.guet.domain.CarSearchResult;

import java.util.List;

/**
 * @author MicahYin
 * @date 2019/7/31 14:41
 */
public interface CarSearchService {
    public Page<CarSearchResult> findCar(CarSearchInfo info, Integer currentPage);

    public List<CarSearchResult> findCarNewest();
}
