package wbcrawler;

public class app {

     public static void main(String[] args) {
        webCrawler crawler = new webCrawler();
        String rootUrl = "http://www.bbc.com";
        crawler.discoverWeb(rootUrl);
    }

}