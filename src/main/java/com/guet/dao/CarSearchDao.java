package com.guet.dao;

import com.guet.domain.CarSearchInfo;
import com.guet.domain.CarSearchResult;
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
import java.util.HashMap;
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
     * @param map 分页查询时的开始条数以及查询的条数
     * @return 查询结果封装在CarSearchResult中并返回list
     */
    public List<CarSearchResult> carSearch(CarSearchInfo info, HashMap<String, Object> map){
        TransportClient client= ElasticSearchTool.getClient();
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch("vehicle").setTypes("motorvehiclelist");
        //存放查询条件的List
        List<QueryBuilder> queryBuilderList=new ArrayList<QueryBuilder>();
        //开始时间和结束时间都不为NULL
        if (!info.getStartTime().isEmpty()&&!info.getEndTime().isEmpty()){
            String startTime=ElasticSearchTool.formatTime(info.getStartTime());
            String endTime=ElasticSearchTool.formatTime(info.getEndTime());
            QueryBuilder queryBuilder=QueryBuilders.rangeQuery("appearTime").gt(startTime).lt(endTime);
            queryBuilderList.add(queryBuilder);
        }else if (!info.getStartTime().isEmpty()){
            String startTime=ElasticSearchTool.formatTime(info.getStartTime());
            QueryBuilder queryBuilder=QueryBuilders.rangeQuery("appearTime").gt(startTime);
            queryBuilderList.add(queryBuilder);
        }else if(!info.getEndTime().isEmpty()){
            String endTime=ElasticSearchTool.formatTime(info.getEndTime());
            QueryBuilder queryBuilder=QueryBuilders.rangeQuery("appearTime").lt(endTime);
            queryBuilderList.add(queryBuilder);
        }
        if (!(info.getPlateNo()==null||info.getPlateNo().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("plateNo", info.getPlateNo());
            queryBuilderList.add(queryBuilder);
        }
        if (!(info.getVehicleClass()==null||info.getVehicleClass().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("vehicleClass", info.getVehicleClass());
            queryBuilderList.add(queryBuilder);
        }
        if (!(info.getVehicleBrand()==null||info.getVehicleBrand().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("vehicleBrand", info.getVehicleBrand());
            queryBuilderList.add(queryBuilder);
        }
        if (!(info.getVehicleColor()==null||info.getVehicleColor().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("vehicleColor", info.getVehicleColor());
            queryBuilderList.add(queryBuilder);
        }
        if (!(info.getDirection()==null||info.getDirection().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("direction", info.getDirection());
            queryBuilderList.add(queryBuilder);
        }
        if (!(info.getSpeed()==null||info.getSpeed().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("speed", info.getSpeed());
            queryBuilderList.add(queryBuilder);
        }
        //查询
        SearchResponse sr=ElasticSearchTool.getSearchResponse(queryBuilderList,searchRequestBuilder,map);
        SearchHits hits=sr.getHits();
        //存放结果的List
        List<CarSearchResult> carSearchResults=new ArrayList<CarSearchResult>();
        for (SearchHit hit:hits){
            JSONObject json = JSONObject.fromObject(hit.getSourceAsString());
            CarSearchResult carSearchResult=new CarSearchResult();
            carSearchResult.setAppearTime(ElasticSearchTool.formatTimeToNomal(json.getString("appearTime")));
            carSearchResult.setTaskIp(json.getString("taskIp"));
            carSearchResult.setTaskName(json.getString("taskName"));
            carSearchResult.setVehicleClass(json.getString("vehicleClass"));
            carSearchResult.setVehicleBrand(json.getString("vehicleBrand"));
            carSearchResult.setVehicleModel(json.getString("vehicleModel"));
            carSearchResult.setVehicleColor(json.getString("vehicleColor"));
            carSearchResult.setSpeed(json.getString("speed"));
            carSearchResult.setDirection(json.getString("direction"));
            carSearchResult.setPlateNo(json.getString("plateNo"));
            carSearchResult.setStorageUrl1(json.getString("storageUrl1"));
            carSearchResult.setStorageUrl2(json.getString("storageUrl2"));
            carSearchResults.add(carSearchResult);
        }
        return carSearchResults;
    }

    /**
     * 查询总记录条数
     * @param info 查询条件
     * @return 查询到的记录总条数
     */
    public Long selectCount(CarSearchInfo info) {
        TransportClient client= ElasticSearchTool.getClient();
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch("vehicle").setTypes("motorvehiclelist");
        //存放查询条件的List
        List<QueryBuilder> queryBuilderList=new ArrayList<QueryBuilder>();
        //开始时间和结束时间都不为NULL
        if (!info.getStartTime().isEmpty()&&!info.getEndTime().isEmpty()){
            String startTime=ElasticSearchTool.formatTime(info.getStartTime());
            String endTime=ElasticSearchTool.formatTime(info.getEndTime());
            QueryBuilder queryBuilder=QueryBuilders.rangeQuery("appearTime").gt(startTime).lt(endTime);
            queryBuilderList.add(queryBuilder);
        }else if (!info.getStartTime().isEmpty()){
            String startTime=ElasticSearchTool.formatTime(info.getStartTime());
            QueryBuilder queryBuilder=QueryBuilders.rangeQuery("appearTime").gt(startTime);
            queryBuilderList.add(queryBuilder);
        }else if(!info.getEndTime().isEmpty()){
            String endTime=ElasticSearchTool.formatTime(info.getEndTime());
            QueryBuilder queryBuilder=QueryBuilders.rangeQuery("appearTime").lt(endTime);
            queryBuilderList.add(queryBuilder);
        }
        if (!(info.getVehicleClass()==null||info.getVehicleClass().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("vehicleClass", info.getVehicleClass());
            queryBuilderList.add(queryBuilder);
        }
        if (!(info.getVehicleBrand()==null||info.getVehicleBrand().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("vehicleBrand", info.getVehicleBrand());
            queryBuilderList.add(queryBuilder);
        }
        if (!(info.getVehicleColor()==null||info.getVehicleColor().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("vehicleColor", info.getVehicleColor());
            queryBuilderList.add(queryBuilder);
        }
        if (!(info.getDirection()==null||info.getDirection().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("direction", info.getDirection());
            queryBuilderList.add(queryBuilder);
        }
        if (!(info.getSpeed()==null||info.getSpeed().isEmpty())){
            QueryBuilder queryBuilder=QueryBuilders.matchPhraseQuery("speed", info.getSpeed());
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
}
