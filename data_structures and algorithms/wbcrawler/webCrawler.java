package wbcrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class webCrawler{

    private Queue<String> queue;
    private List<String> discoverWebsitesList;

    public webCrawler(){
        this.queue = new LinkedList<>();
        this.discoverWebsitesList = new ArrayList<>();

    }
    public void discoverWeb(String root){

        this.queue.add(root);
        this.discoverWebsitesList.add(root);

        while( !queue.isEmpty()){
            String v = this.queue.remove();
            String rawHtml = readURL(v);

            String regexp = "http://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(rawHtml);
            while(matcher.find()){
                String actualURL = matcher.group();
                if(!discoverWebsitesList.contains(actualURL)){
                    discoverWebsitesList.add(actualURL);
                    System.out.println("website has been found" + actualURL);
                    queue.add(actualURL);
                }
            }
            
        }

    }

    private String readURL(String v) {
        String rawHtml = "";

        try{
            URL url = new URL(v);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine = "";

            while((inputLine = in.readLine()) != null){
                rawHtml+= inputLine;
            }


        } catch(Exception e){
            e.printStackTrace(); 
        }
        return rawHtml;
    }
    
}