package com.fest.watchtogether.thread;

import com.fest.watchtogether.util.MongoDBGridFSUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MongodbDownloadCallable implements Callable<Map<String, Object>> {
	private ObjectId objectId;
	private String saveLocation;
	
	@Override
	public Map<String, Object> call() throws Exception {
		Boolean downLoad = MongoDBGridFSUtils.downLoad(objectId, saveLocation);
		Map<String, Object> data = new HashMap<>();
		data.put("success", downLoad);
		return data;
	}
}
