package com.guet.dao;

import com.guet.domain.CarSearchInfo;
import com.guet.domain.CarSearchResult;
import com.guet.util.ElasticSearchTool;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
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
        TransportClient client= ElasticSearchTool.getClient();
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch("film2").setTypes("action");
        //查询所有
        SearchResponse response = searchRequestBuilder.setQuery(QueryBuilders.matchQuery("title","战8"))
                .setFetchSource(new String[]{"title","price"},null)
                .execute().actionGet();
        SearchHits hits = response.getHits();
        for(SearchHit hit:hits){
            System.out.println(hit.getSourceAsString());
        }
        return null;
    }
}
