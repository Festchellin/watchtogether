package com.fest.watchtogether.util;

import com.mongodb.Block;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import com.mongodb.client.gridfs.model.GridFSFile;
import com.mongodb.client.model.Filters;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

@Component
public class MongoDBGridFSUtils {
	private static MongoDbFactory mongoDbFactory;
	private static GridFsTemplate gridFsTemplate;
	@Resource
	private MongoDbFactory dbFactory;
	@Resource
	private GridFsTemplate fsTemplate;
	
	public static Map<String, Object> upload(MultipartFile file) {
		Map<String, Object> data = new HashMap<>();
		boolean isSaved = false;
		if (file.isEmpty()) {
			data.put("msg", "Please select a file to upload");
		} else {
			try {
				ObjectId objectId = gridFsTemplate.store(file.getInputStream(), file.getOriginalFilename());
				data.put("msg", file.getOriginalFilename() + " saved");
				data.put("Id", objectId);
				isSaved = true;
			} catch (IOException e) {
				data.put("msg", e.getMessage());
			}
		}
		data.put("success", isSaved);
		return data;
	}
	
	public static Map<String, Object> saveToMongoDB(InputStream inputStream, String fileName) {
		Map<String, Object> data = new HashMap<>();
		boolean isSaved = false;
		if (inputStream == null) {
			return null;
		} else {
			ObjectId objectId = gridFsTemplate.store(inputStream, fileName);
			data.put("msg", fileName + " saved");
			data.put("Id", objectId);
			isSaved = true;
		}
		data.put("success", isSaved);
		return data;
	}
	
	public static Boolean downLoad(ObjectId objectId, String saveLocation) {
		AtomicReference<Boolean> success = new AtomicReference<>(false);
		long startTime = System.currentTimeMillis();
		MongoDatabase testDB = mongoDbFactory.getDb("test");
		GridFSBucket gridFSBucket = GridFSBuckets.create(testDB);
		File parentDIR = new File(saveLocation);
		if (!parentDIR.exists()) parentDIR.mkdirs();
		gridFSBucket.find(Filters.eq("_id", objectId)).forEach((Block<GridFSFile>) gridFSFile -> {
			File saveFile = new File(parentDIR, gridFSFile.getFilename());
			OutputStream outputStream = null;
			try {
				outputStream = new FileOutputStream(saveFile);
				gridFSBucket.downloadToStream(objectId, outputStream);
				success.set(true);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		return success.get();
	}
	
	@PostConstruct
	public void init() {
		mongoDbFactory = this.dbFactory;
		gridFsTemplate = this.fsTemplate;
	}
}
