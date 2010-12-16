package org.mongodb.learn;

import java.util.Random;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class Main {

	public static void main(String[] args) throws Exception{
		Mongo mongo = new Mongo("localhost",27017);
		DB db = mongo.getDB("user");
		
		DBCollection collection = db.getCollection("user-stats");
		System.out.println(collection.count());
		long start = System.currentTimeMillis();
		Random random = new Random();
		for (int i = 0; i < 10000000; i++) {
			UserStats userStats = new UserStats();
			userStats.setBestPot(1000);
			userStats.setCredit(9);
			userStats.setXp(random.nextInt(29));
			userStats.setFreeCredits(2000);
			collection.insert(Mapper.toDbObject(userStats));
		}
		System.out.println(String.format("Time to insert %dms",(System.currentTimeMillis()-start)));

		start = System.currentTimeMillis();
		DBCursor cursor = collection.find();
		for(DBObject object : cursor){
//			System.out.println(object);
			UserStats userStats = Mapper.fromDbObject(object, UserStats.class);
		}
		System.out.println(String.format("Time to read %dms",(System.currentTimeMillis()-start)));
	}
}
