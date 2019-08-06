package com.guet.service;

import com.guet.domain.Page;
import com.guet.domain.PedestrianSearchInfo;
import com.guet.domain.PedestrianSearchResult;

import java.util.List;

/**
 * @author MicahYin
 * @date 2019/8/4 9:09
 */
public interface PedestrianService {
    /**
     * 查询行人数据以及分页处理
     * @param info  查询条件
     * @param currentPage 当前页码
     * @return 查询得到的结果以Page类返回，数据封装在Page中的Data属性中
     */
    public Page<PedestrianSearchResult> findPedestrian(PedestrianSearchInfo info, Integer currentPage);

    /**
     * 查询最新的三条数据，用于在index页面实时展示
     * @return 查询结果
     */
    public List<PedestrianSearchResult> findPedestrianNewest();
}
