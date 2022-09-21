package activetech.base.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.ScanParams;

public interface RedisService {

	public void del(byte [] key);
	public void del(String key);
	public void set(byte [] key,byte [] value,int liveTime);
	public void set(String key,String value,int liveTime);
	public void set(String key,String value);
	public void set(byte [] key,byte [] value);
	public String get(String key);
	public byte[] get(byte [] key);
	public Set<String> keys(String pattern);
	public boolean exists(String key);
	public String flushDB();
	public long dbSize();
	public String ping();
	public void hmset(String key,Map<String, String> mapValue);
	public void hmset(String key,Map<String, String> mapValue,int liveTime);
	public void hmset(byte [] key,Map<byte[], byte[]>  mapValue);
	public void hmset(byte [] key,Map<byte[], byte[]>  mapValue,int liveTime);
	public void hmsetObject(String key,Map<String	, Object>  mapValue);
	public void hmsetObject(String key,Map<String	, Object>  mapValue,int liveTime);
	public Map<byte[], byte[]> hmget(String key);
	public Map<String, Object> hmgetObject(String key);
	public void hUpdate(String key,String filename,Object listValue);
	public Map<String, Object> hmgetObject(String key,int cursor,ScanParams params);
	public void hdel(byte[] key,byte[]... fields);
	public void hUpdate(String key,String filename,Object listValue,int liveTime);
	public void hmsetJson(String key,Map<String	, Object>  mapValue);
	public void hmsetJson(String key,Map<String	, Object> mapValue,int liveTime);
	public Map<String, Object> hmgetJson(String key);
	public void hUpdateJson(String key,String filename,Object listValue);
	public String hget(String key,String field);
	public void lSet(String key,long index,String value,int liveTime);
    public void lPush(String key,int liveTime,String... value);
    public List<String> lGet(String key,int start,int end);
}
