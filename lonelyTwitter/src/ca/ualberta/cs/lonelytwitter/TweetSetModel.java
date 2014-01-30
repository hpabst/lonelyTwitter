package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Arrays;

public class TweetSetModel {
	private int count = 0;
	private ArrayList<LonelyTweetModel> tweets = new ArrayList<LonelyTweetModel>();

	public int countTweets() {
		// TODO Auto-generated method stub
		return count;
	}

	public void addTweet(NormalTweetModel normalTweetModel) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		count++;
		tweets.add(normalTweetModel);
		if((count > 1) && (tweets.get(count-1).equals(tweets.get(count-2))))
			throw new IllegalArgumentException();
	}

	public Object[] getTweets() {
		// TODO Auto-generated method stub
		//return  Arrays.copyOf(tweets.toArray(), tweets.toArray().length, LonelyTweetModel.class);
		return tweets.toArray();
	}
	

}
