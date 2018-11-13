import twitter4j.*;
import twitter4j.auth.*;
import java.util.Scanner;

public class SentimentA {
    public static void main(String[] args)throws Exception {
		Twitter twitter = TwitterFactory.getSingleton();
		twitter.setOAuthConsumer("[consumer key]", "[consumer secret]");
		AccessToken accessToken = new AccessToken("[token key]",  "[token secret]");
		twitter.setOAuthAccessToken(accessToken);
		Query query = new Query("text to search for");
        QueryResult result = twitter.search(query);
        
		for (Status status : result.getTweets()) {
			System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
		}
    }

    public static String classifyMessage(String message){
        String clasification;
        String[] positive = {"", "", ""};
        String[] negative = {"", "", ""};
        String[] neutral = {"", "", ""};

        message trim 

        for (int i=0 ; i < ; i++){
            if (message){
                clasification = "Positive";
            }else if (){
                clasification = "Negative";
            }else{
                clasification = "Neutral";
            }
        }
        return clasification;
    }

    public static void storeKeyword(String keyword, String classification){

    }


}