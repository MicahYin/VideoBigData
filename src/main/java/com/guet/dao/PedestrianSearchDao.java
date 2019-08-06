package com.guet.dao;

import com.guet.domain.PedestrianSearchInfo;
import com.guet.domain.PedestrianSearchResult;
import com.guet.util.ElasticSearchTool;
import net.sf.json.JSONObject;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author MicahYin
 * @date 2019/8/4 9:18
 */
@Repository
public class PedestrianSearchDao {
    /**
     * 行人搜索
     * @param info 查询条件
     * @param map 包含当前页和页面大小，默认为第一页
     * @return 查询得到的PedestrianSearchResult的List集合
     */
    public List<PedestrianSearchResult> pedestrianSearch(PedestrianSearchInfo info,HashMap<String,Object> map){
        TransportClient client= ElasticSearchTool.getClient();
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch("person").setTypes("personlist");
        //存放查询条件的List
        List<QueryBuilder> queryBuilderList=new ArrayList<QueryBuilder>();
        //dataType为2时为行人
        QueryBuilder queryBuilderData= QueryBuilders.matchPhraseQuery("dataType","2");
        queryBuilderList.add(queryBuilderData);
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
        //riderCode不为Null
        if (!(info.getRiderCode()==null||info.getRiderCode().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("riderCode", info.getRiderCode());
            queryBuilderList.add(queryBuilder);
        }
        //genderCode不为Null
        if (!(info.getGenderCode()==null||info.getGenderCode().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("genderCode", info.getGenderCode());
            queryBuilderList.add(queryBuilder);
        }
        //direction不为Null
        if (!(info.getDirection()==null||info.getDirection().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("direction", info.getDirection());
            queryBuilderList.add(queryBuilder);
        }
        //speed不为Null
        if (!(info.getSpeed()==null||info.getSpeed().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("speed", info.getSpeed());
            queryBuilderList.add(queryBuilder);
        }
        //coatCol不为Null
        if (!(info.getCoatCol()==null||info.getCoatCol().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("coatCol", info.getCoatCol());
            queryBuilderList.add(queryBuilder);
        }
        //查询
        SearchResponse sr=ElasticSearchTool.getSearchResponse(queryBuilderList,searchRequestBuilder,map);
        SearchHits hits=sr.getHits();
        //存放结果的List
        List<PedestrianSearchResult> pedestrianSearchResults=new ArrayList<PedestrianSearchResult>();
        for (SearchHit hit:hits){
            JSONObject json = JSONObject.fromObject(hit.getSourceAsString());
            PedestrianSearchResult pedestrianSearchResult=new PedestrianSearchResult();
            pedestrianSearchResult.setPersonAppearTime(ElasticSearchTool.formatTimeToNomal(json.getString("personAppearTime")));
            pedestrianSearchResult.setTaskIp(json.getString("taskIp"));
            pedestrianSearchResult.setTaskName(json.getString("taskName"));
            pedestrianSearchResult.setDataType(json.getString("dataType"));
            pedestrianSearchResult.setGenderCode(json.getString("genderCode"));
            pedestrianSearchResult.setGlassCode(json.getString("glassCode"));
            pedestrianSearchResult.setAgeGroups(json.getString("ageGroups"));
            pedestrianSearchResult.setBigPicUrl(json.getString("bigPicUrl"));
            pedestrianSearchResult.setPicUrl(json.getString("picUrl"));
            pedestrianSearchResults.add(pedestrianSearchResult);
        }
        return pedestrianSearchResults;
    }

    /**
     * 查询当前条件下所有的记录总数
     * @param info 查询条件
     * @return 记录总数
     */
    public Long selectCount(PedestrianSearchInfo info){
        TransportClient client= ElasticSearchTool.getClient();
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch("person").setTypes("personlist");
        //存放查询条件的List
        List<QueryBuilder> queryBuilderList=new ArrayList<QueryBuilder>();
        //dataType为2时为行人
        QueryBuilder queryBuilderData= QueryBuilders.matchPhraseQuery("dataType","2");
        queryBuilderList.add(queryBuilderData);
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
        //riderCode不为Null
        if (!(info.getRiderCode()==null||info.getRiderCode().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("riderCode", info.getRiderCode());
            queryBuilderList.add(queryBuilder);
        }
        //genderCode不为Null
        if (!(info.getGenderCode()==null||info.getGenderCode().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("genderCode", info.getGenderCode());
            queryBuilderList.add(queryBuilder);
        }
        //direction不为Null
        if (!(info.getDirection()==null||info.getDirection().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("direction", info.getDirection());
            queryBuilderList.add(queryBuilder);
        }
        //speed不为Null
        if (!(info.getSpeed()==null||info.getSpeed().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("speed", info.getSpeed());
            queryBuilderList.add(queryBuilder);
        }
        //coatCol不为Null
        if (!(info.getCoatCol()==null||info.getCoatCol().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("coatCol", info.getCoatCol());
            queryBuilderList.add(queryBuilder);
        }
        HashMap<String,Object> map=new HashMap<>();
        map.put("start",0);
        map.put("size",10);
        //查询
        SearchResponse sr=ElasticSearchTool.getSearchResponse(queryBuilderList,searchRequestBuilder,map);
        SearchHits hits=sr.getHits();
        return hits.totalHits;
    }

    /**
     * 查询按时间排序后（无任何筛选条件），最新的三条数据
     * @return 最新的三条数据
     */
    public List<PedestrianSearchResult> pedestrianNewest(){
        TransportClient client= ElasticSearchTool.getClient();
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch("person").setTypes("personlist");
        //dataType为2时为行人
        QueryBuilder queryBuilder= QueryBuilders.matchPhraseQuery("dataType","2");
        SearchResponse searchResponse=searchRequestBuilder.setQuery(QueryBuilders.boolQuery()
                .must(queryBuilder))
                .setFrom(0).setSize(3)
                .addSort("personAppearTime", SortOrder.DESC)
                .execute()
                .actionGet();
        //存放结果的List
        List<PedestrianSearchResult> pedestrianSearchResults=new ArrayList<PedestrianSearchResult>();
        SearchHits hits=searchResponse.getHits();
        for (SearchHit hit:hits){
            JSONObject json = JSONObject.fromObject(hit.getSourceAsString());
            System.out.println("---------------------------------------------");
            System.out.println(json);
            System.out.println("---------------------------------------------");
            PedestrianSearchResult pedestrianSearchResult=new PedestrianSearchResult();
            pedestrianSearchResult.setPersonAppearTime(ElasticSearchTool.formatTimeToNomal(json.getString("personAppearTime")));
            pedestrianSearchResult.setTaskIp(json.getString("taskIp"));
            pedestrianSearchResult.setTaskName(json.getString("taskName"));
            pedestrianSearchResult.setDataType(json.getString("dataType"));
            pedestrianSearchResult.setGenderCode(json.getString("genderCode"));
            pedestrianSearchResult.setGlassCode(json.getString("glassCode"));
            pedestrianSearchResult.setAgeGroups(json.getString("ageGroups"));
            pedestrianSearchResult.setBigPicUrl(json.getString("bigPicUrl"));
            pedestrianSearchResult.setPicUrl(json.getString("picUrl"));
            pedestrianSearchResults.add(pedestrianSearchResult);
        }
        return pedestrianSearchResults;
    }
}
