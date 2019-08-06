package com.guet.service;

import com.guet.domain.Page;
import com.guet.domain.FaceSearchInfo;
import com.guet.domain.FaceSearchResult;

/**
 * @author MicahYin
 * @date 2019/7/29 9:59
 */
public interface FaceSearchService {
    public Page<FaceSearchResult> findFace(FaceSearchInfo info, Integer currentPage);
}
