package com.guet.dao;

import com.guet.domain.FaceSearchInfo;
import com.guet.domain.FaceSearchResult;
import com.guet.util.ElasticSearchTool;
import net.sf.json.JSONObject;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


/**
 * @author MicahYin
 * @date 2019/7/29 9:26
 */
@Repository
public class FaceSearchDao {
    /**
     * 查询数据
     * @param info 查询条件
     * @param map 包含当前页和页面大小，默认为第一页
     * @return 查询得到的FaceSearchResult的List集合
     */
    public List<FaceSearchResult> faceSearch(FaceSearchInfo info,HashMap<String,Object> map){

        TransportClient client= ElasticSearchTool.getClient();
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch("person").setTypes("personlist");
        //存放查询条件的List
        List<QueryBuilder> queryBuilderList=new ArrayList<QueryBuilder>();
        //开始时间和结束时间都不为NULL
        if (!info.getStartTime().isEmpty()&&!info.getEndTime().isEmpty()){
            String startTime=ElasticSearchTool.formatTime(info.getStartTime());
            String endTime=ElasticSearchTool.formatTime(info.getEndTime());
            QueryBuilder queryBuilder=QueryBuilders.rangeQuery("personAppearTime").gt(startTime).lt(endTime);
            queryBuilderList.add(queryBuilder);
        }else if (!info.getStartTime().isEmpty()){
            String startTime=ElasticSearchTool.formatTime(info.getStartTime());
            QueryBuilder queryBuilder=QueryBuilders.rangeQuery("personAppearTime").gt(startTime);
            queryBuilderList.add(queryBuilder);
        }else if(!info.getEndTime().isEmpty()){
            String endTime=ElasticSearchTool.formatTime(info.getEndTime());
            QueryBuilder queryBuilder=QueryBuilders.rangeQuery("personAppearTime").lt(endTime);
            queryBuilderList.add(queryBuilder);
        }
        //AgeRange不为Null
        if (!(info.getAgeRange()==null||info.getAgeRange().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("ageGroups", info.getAgeRange());
            queryBuilderList.add(queryBuilder);
        }
        //genderCode不为Null
        if (!(info.getGenderCode()==null||info.getGenderCode().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("genderCode",info.getGenderCode());
            queryBuilderList.add(queryBuilder);
        }
        //glassCode不为Null
        if (!(info.getGlassCode()==null||info.getGlassCode().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("glassCode",info.getGlassCode());
            queryBuilderList.add(queryBuilder);
        }
        //查询
        SearchResponse sr=ElasticSearchTool.getSearchResponse(queryBuilderList,searchRequestBuilder,map);
        SearchHits hits=sr.getHits();
        //存放结果的List
        List<FaceSearchResult> faceSearchResults=new ArrayList<FaceSearchResult>();
        for(SearchHit hit:hits){
            JSONObject json = JSONObject.fromObject(hit.getSourceAsString());
            FaceSearchResult faceSearchResult=new FaceSearchResult();
            faceSearchResult.setPersonAppearTime(ElasticSearchTool.formatTimeToNomal(json.getString("personAppearTime")));
            faceSearchResult.setTaskIp(json.getString("taskIp"));
            faceSearchResult.setTaskName(json.getString("taskName"));
            faceSearchResult.setDataType(json.getString("dataType"));
            faceSearchResult.setGenderCode(json.getString("genderCode"));
            faceSearchResult.setGlassCode(json.getString("glassCode"));
            faceSearchResult.setAgeGroups(json.getString("ageGroups"));
            faceSearchResult.setBigPicUrl(json.getString("bigPicUrl"));
            faceSearchResult.setPicUrl(json.getString("picUrl"));
            faceSearchResults.add(faceSearchResult);
        }
//        client.close();
        return faceSearchResults;
    }
    /**
     * 当前条件下总共有多少数据
     * @param info 查询条件
     * @return 总的数据条数
     */
    public Long selectCount(FaceSearchInfo info){
        TransportClient client= ElasticSearchTool.getClient();
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch("person").setTypes("personlist");
        //存放查询条件的List
        List<QueryBuilder> queryBuilderList=new ArrayList<QueryBuilder>();
        //开始时间和结束时间都不为NULL
        if (!info.getStartTime().isEmpty()&&!info.getEndTime().isEmpty()){
            String startTime=ElasticSearchTool.formatTime(info.getStartTime());
            String endTime=ElasticSearchTool.formatTime(info.getEndTime());
            QueryBuilder queryBuilder=QueryBuilders.rangeQuery("personAppearTime").gt(startTime).lt(endTime);
            queryBuilderList.add(queryBuilder);
        }else if (!info.getStartTime().isEmpty()){
            String startTime=ElasticSearchTool.formatTime(info.getStartTime());
            QueryBuilder queryBuilder=QueryBuilders.rangeQuery("personAppearTime").gt(startTime);
            queryBuilderList.add(queryBuilder);
        }else if(!info.getEndTime().isEmpty()){
            String endTime=ElasticSearchTool.formatTime(info.getEndTime());
            QueryBuilder queryBuilder=QueryBuilders.rangeQuery("personAppearTime").lt(endTime);
            queryBuilderList.add(queryBuilder);
        }
        //AgeRange不为Null
        if (!(info.getAgeRange()==null||info.getAgeRange().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("ageGroups", info.getAgeRange());
            queryBuilderList.add(queryBuilder);
        }
        //genderCode不为Null
        if (!(info.getGenderCode()==null||info.getGenderCode().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("genderCode",info.getGenderCode());
            queryBuilderList.add(queryBuilder);
        }
        //glassCode不为Null
        if (!(info.getGlassCode()==null||info.getGlassCode().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("glassCode",info.getGlassCode());
            queryBuilderList.add(queryBuilder);
        }


        HashMap<String,Object> map=new HashMap<>();
        map.put("start",0);
        map.put("size",10);

        //查询
        SearchResponse sr=ElasticSearchTool.getSearchResponse(queryBuilderList,searchRequestBuilder,map);

        SearchHits hits=sr.getHits();
//        client.close();
        return hits.totalHits;
    }


}
