package activetech.base.dao.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import activetech.base.service.RedisService;
import activetech.util.JacksonUtil;
import activetech.util.ObjectTranscoder;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;


public class RedisMapper  {

	private static Jedis jedis;  
    @Autowired  
    @Qualifier("jedisConnectionFactory")  
    private JedisConnectionFactory jedisConnectionFactory;  
	
	/** 
     * 通过key删除（字节） 
     * @param key 
     */  
    public void del(byte [] key){  
        this.getJedis().del(key);  
    }  
    /** 
     * 通过key删除 
     * @param key 
     */  
    public void del(String key){  
        this.getJedis().del(key);  
    }  
  
    /** 
     * 添加key value 并且设置存活时间(byte) 
     * @param key 
     * @param value 
     * @param liveTime 
     */  
    public void set(byte [] key,byte [] value,int liveTime){  
        this.set(key, value);  
        this.getJedis().expire(key, liveTime);  
    }  
    /** 
     * 添加key value 并且设置存活时间 
     * @param key 
     * @param value 
     * @param liveTime 
     */  
    public void set(String key,String value,int liveTime){  
        this.set(key, value);  
        this.getJedis().expire(key, liveTime);  
    }  
    /** 
     * 添加key value 
     * @param key 
     * @param value 
     */  
    public void set(String key,String value){  
        this.getJedis().set(key, value);  
    }  
    /**添加key value (字节)(序列化) 
     * @param key 
     * @param value 
     */  
    public void set(byte [] key,byte [] value){  
        this.getJedis().set(key, value);  
    }  
    /** 
     * 获取redis value (String) 
     * @param key 
     * @return 
     */  
    public String get(String key){  
        String value = this.getJedis().get(key);  
        return value;  
    }  
    /** 
     * 获取redis value (byte [] )(反序列化) 
     * @param key 
     * @return 
     */  
    public byte[] get(byte [] key){  
        return this.getJedis().get(key);  
    }  
  
    /** 
     * 通过正则匹配keys 
     * @param pattern 
     * @return 
     */  
    public Set<String> keys(String pattern){  
        return this.getJedis().keys(pattern);  
    }  
  
    /** 
     * 检查key是否已经存在 
     * @param key 
     * @return 
     */  
    public boolean exists(String key){  
        return this.getJedis().exists(key);  
    }  
    /** 
     * 清空redis 所有数据 
     * @return 
     */  
    public String flushDB(){  
        return this.getJedis().flushDB();  
    }  
    /** 
     * 查看redis里有多少数据 
     */  
    public long dbSize(){  
        return this.getJedis().dbSize();  
    }  
    /** 
     * 检查是否连接成功 
     * @return 
     */  
    public String ping(){  
        return this.getJedis().ping();  
    }  
    
    /** 
     * 添加key mapValue 
     * @param key 
     * @param mapValue 
     */  
    public void hmset(String key,Map<String, String> mapValue){  
        this.getJedis().hmset(key, mapValue);
    }  
    
    /** 
     * 添加key mapValue 并且设置存活时间(byte) 
     * @param key 
     * @param mapValue 
     * @param liveTime 
     */  
    public void hmset(String key,Map<String, String> mapValue,int liveTime){  
        this.hmset(key, mapValue);  
        this.getJedis().expire(key, liveTime);  
    }  
    
    /**添加key mapValue (字节)(序列化) 
     * @param key 
     * @param mapValue 
     */  
    public void hmsetObject(String key,Map<String	, Object>  mapValue){  
    	Map<byte[], byte[]> mapByte = new HashMap<byte[], byte[]>();
    	Iterator<Map.Entry<String	, Object>> it = mapValue.entrySet().iterator();
    	while (it.hasNext()) {
	    	Map.Entry<String	, Object> entry = it.next();
	    	mapByte.put(entry.getKey().getBytes(), ObjectTranscoder.serialize(entry.getValue()));
    	}
        this.getJedis().hmset(key.getBytes(), mapByte);
    } 
    
    /**添加key mapValue (json字符串) 
     * @param key 
     * @param mapValue 
     */  
    public void hmsetJson(String key,Map<String	, Object>  mapValue){  
    	Map<String, String> mapString = new HashMap<String, String>();
    	Iterator<Map.Entry<String, Object>> it = mapValue.entrySet().iterator();
    	while (it.hasNext()) {
	    	Map.Entry<String, Object> entry = it.next();
	    	mapString.put(entry.getKey(), JacksonUtil.obj2Json(entry.getValue()));
    	}
        this.getJedis().hmset(key, mapString);
    } 
    
    /** 
     * 添加key mapValue 并且设置存活时间(byte) 
     * @param key 
     * @param mapValue 
     * @param liveTime 
     */  
    public void hmsetObject(String key,Map<String	, Object>  mapValue,int liveTime){  
    	this.hmsetObject(key, mapValue);
    	this.getJedis().expire(key.getBytes(), liveTime);
    }
    
    /** 
     * 添加key mapValue 并且设置存活时间(json字符串) 
     * @param key 
     * @param mapValue 
     * @param liveTime 
     */  
    public void hmsetJson(String key,Map<String	, Object> mapValue,int liveTime){  
    	this.hmsetJson(key, mapValue);
    	this.getJedis().expire(key.getBytes(), liveTime);
    }
    
    /** 
     * 获取redis value 
     * @param key 
     * @return 
     */
    public Map<byte[], byte[]> hmget(String key){
		return this.getJedis().hgetAll(key.getBytes());
    }
    
    /** 
     * 获取redis value
     * @param key 
     * @return 
     */
    public Map<String, Object> hmgetObject(String key){
    	Map<String, Object> mapObject = new HashMap<String, Object>();
    	Map<byte[], byte[]> mapByte = this.getJedis().hgetAll(key.getBytes());
    	Iterator<Map.Entry<byte[], byte[]>> it = mapByte.entrySet().iterator();
    	while(it.hasNext()){
    		Map.Entry<byte[], byte[]> entry = it.next();
    		mapObject.put(new String(entry.getKey()), ObjectTranscoder.deserialize(entry.getValue()));
    	}
		return mapObject;
    }
    
    /** 
     * 获取redis value
     * @param key 
     * @return 
     */
    public Map<String, Object> hmgetJson(String key){
    	Map<String, Object> mapObject = new HashMap<String, Object>(100);
    	Map<String, String> mapByte = this.getJedis().hgetAll(key);
    	Iterator<Map.Entry<String, String>> it = mapByte.entrySet().iterator();
    	while(it.hasNext()){
    		Map.Entry<String, String> entry = it.next();
    		mapObject.put(entry.getKey(), 
    				JacksonUtil.json2Obj(entry.getValue(), Object.class));
    	}
		return mapObject;
    }
    
    public void hUpdate(String key,String filename,Object listValue){  
    	this.getJedis().hset(key.getBytes(), filename.getBytes(), ObjectTranscoder.serialize(listValue));
    }
    
    public void hUpdateJson(String key,String filename,Object listValue){  
    	this.getJedis().hset(key, filename, JacksonUtil.obj2Json(listValue));
    }
    
    
    /**添加key mapValue (字节)(序列化) 
     * @param key 
     * @param mapValue 
     */  
    public void hmset(byte [] key,Map<byte[], byte[]>  mapValue){  
        this.getJedis().hmset(key, mapValue);
    }  
    
    /** 
     * 添加key mapValue 并且设置存活时间(byte) 
     * @param key 
     * @param mapValue 
     * @param liveTime 
     */  
    public void hmset(byte [] key,Map<byte[], byte[]>  mapValue,int liveTime){  
        this.hmset(key, mapValue);  
        this.getJedis().expire(key, liveTime);  
    }  
    
    /** 
     * 获取一个jedis 客户端 
     * @return 
     */  
    private Jedis getJedis(){  
        if(jedis == null){ 
        	jedis = jedisConnectionFactory.getShardInfo().createResource();
        	jedis.select(4);
        }  
        return jedis;  
    }
    
    /** 
     * 通过key删除某些feild的值 
     * @param key 
     */  
    public void hdel(byte[] key,byte[]... fields){  
        this.getJedis().hdel(key, fields);
    } 
    
    /** 
     *未完成，扫描redis
     * @param key 
     * @return 
     */
    public Map<String, Object> hmgetObject(String key,int cursor,ScanParams params){
    	List<Map.Entry<byte[], byte[]>>  list =new ArrayList<Map.Entry<byte[],byte[]>>(50);
    	Collection<byte[]> aa = params.getParams();
    	do {
    		ScanResult<Entry<byte[], byte[]>> scanResult =this.getJedis().hscan(key.getBytes(), (cursor+"").getBytes(),params);
    		list.addAll(scanResult.getResult());
    		cursor = scanResult.getCursor();
		} while (cursor > 0);
    	Map.Entry<byte[], byte[]> entry = list.get(0);
		return null;
    }
    
   /* private Jedis getJedis() {  
        if (jedis == null) {  
               jedisConnection = jedisConnectionFactory.getConnection();  
               jedis = jedisConnection.getNativeConnection();  
            return jedis;  
        }  
        return jedis;  
    } */
	
	public void hUpdate(String key, String filename, Object listValue,
			int liveTime) {
		this.hUpdate(key, filename, listValue);
		this.getJedis().expire(key.getBytes(), liveTime);  
	}
    
}
