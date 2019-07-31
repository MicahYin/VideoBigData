package com.guet.util;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

/**
 * @author MicahYin
 * @date 2019/7/28 16:31
 */
public class ElasticSearchTool {

    private static String host="172.25.6.13"; // 服务器地址
    private static int port=9300; // 端口
    private static TransportClient client=null;
    /**
     * 获取链接处可能存在问题......
     * 获取ElasticSearch Client的静态方法
     * @return client
     */
    public static TransportClient getClient(){
        if(client==null){
            Settings settings = Settings.builder().put("cluster.name","guet-application").build();
            try {
                client = new PreBuiltTransportClient(settings)
                        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(host),port));
            } catch (UnknownHostException e) {
                e.printStackTrace();
                throw new RuntimeException("获取client失败...");
            }
        }
        return client;
    }

    /**
     * 将时间转化为可以查询的格式
     * yyyy-MM-dd HH:mm:ss转化为yyyy-MM-dd'T'HH:mm:ss
     * @param beforeDate
     * @return
     */
    public static String formatTime(String beforeDate){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        String afterDate="";
        try {
            afterDate=formatter.format(format.parse(beforeDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return afterDate;
    }

    /**
     *
     * @param before
     * @return
     */
    public static String formatTimeToNomal(String before){
        String after="";
        SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        try {
            after=format1.format(format2.parse(before));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return after;
    }
    public static SearchResponse getSearchResponse(List<QueryBuilder> queryBuilderList,SearchRequestBuilder searchRequestBuilder,HashMap<String,Object> map){
        SearchResponse searchResponse;
        int start= (int) map.get("start");
        int end= (int) map.get("size");
        switch (queryBuilderList.size()){
            case 0:
                searchResponse=searchRequestBuilder.setQuery(QueryBuilders.boolQuery())
                        .setFrom(start).setSize(end)
                        .execute()
                        .actionGet();break;
            case 1:
                searchResponse=searchRequestBuilder.setQuery(QueryBuilders.boolQuery()
                        .must(queryBuilderList.get(0)))
                        .setFrom(start).setSize(end)
                        .execute()
                        .actionGet();break;
            case 2:
                searchResponse=searchRequestBuilder.setQuery(QueryBuilders.boolQuery()
                        .must(queryBuilderList.get(0))
                        .must(queryBuilderList.get(1)))
                        .setFrom(start).setSize(end)
                        .execute()
                        .actionGet();break;
            case 3:
                searchResponse=searchRequestBuilder.setQuery(QueryBuilders.boolQuery()
                        .must(queryBuilderList.get(0))
                        .must(queryBuilderList.get(1))
                        .must(queryBuilderList.get(2)))
                        .setFrom(start).setSize(end)
                        .execute()
                        .actionGet();break;
            case 4:
                searchResponse=searchRequestBuilder.setQuery(QueryBuilders.boolQuery()
                        .must(queryBuilderList.get(0))
                        .must(queryBuilderList.get(1))
                        .must(queryBuilderList.get(2))
                        .must(queryBuilderList.get(3)))
                        .setFrom(start).setSize(end)
                        .execute()
                        .actionGet();break;
            case 5:
                searchResponse=searchRequestBuilder.setQuery(QueryBuilders.boolQuery()
                        .must(queryBuilderList.get(0))
                        .must(queryBuilderList.get(1))
                        .must(queryBuilderList.get(2))
                        .must(queryBuilderList.get(3))
                        .must(queryBuilderList.get(4)))
                        .setFrom(start).setSize(end)
                        .execute()
                        .actionGet();break;
            case 6:
                searchResponse=searchRequestBuilder.setQuery(QueryBuilders.boolQuery()
                        .must(queryBuilderList.get(0))
                        .must(queryBuilderList.get(0))
                        .must(queryBuilderList.get(1))
                        .must(queryBuilderList.get(2))
                        .must(queryBuilderList.get(3))
                        .must(queryBuilderList.get(4))
                        .must(queryBuilderList.get(5)))
                        .setFrom(start).setSize(end)
                        .execute()
                        .actionGet();break;
            default:
                //默认查询全部
                searchResponse=searchRequestBuilder.setQuery(QueryBuilders.boolQuery())
                        .setFrom(start).setSize(end)
                        .execute()
                        .actionGet();break;
        }
        return searchResponse;
    }
    public static void main(String[] args) {
//        System.out.println(formatTimeToNomal("2019-04-15T09:40:18"));
    }
}
