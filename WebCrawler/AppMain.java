/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebCrawler;

/**
 *
 * @author ankit
 */
public class AppMain {
    
    public static void main(String args[]){
        
        WebCrawler crawler = new WebCrawler();
        
        /*
        This is the root URL from which, our algorithm will start crawling.
        */
        crawler.discoverWeb("http://www.msn.com");
    }
}
