/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebCrawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ankit
 */
public class WebCrawler {
    
    private Queue<String> queue;
    private List<String> discoveredWebsites;

    WebCrawler() {
        this.queue = new LinkedList<>();
        this.discoveredWebsites = new ArrayList<>();
    }

    public void discoverWeb(String root) {
        this.queue.add(root);
        this.discoveredWebsites.add(root);
        
        while(!queue.isEmpty()){
            String currentUrl = this.queue.remove();
            
            /*
            Find URLs in the source HTML returned as rawHtml
            with help of a regular expression.
            */
            String rawHtml = readUrl(currentUrl);
            String regular = "http://(\\w+\\.)*(\\w+)";
            
            Pattern pattern = Pattern.compile(regular);
            Matcher matcher = pattern.matcher(rawHtml);
            
            while(matcher.find()){
                String actualUrl = matcher.group();
                
                if(!discoveredWebsites.contains(actualUrl)){
                    discoveredWebsites.add(actualUrl);
                    
                    System.out.println("URL found: " + actualUrl);
                    queue.add(actualUrl);
                }
            }
        }
    }
    
    private String readUrl(String currentUrl){
        String rawHtml = "";
        
        try {
            URL url = new URL(currentUrl);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine = "";
            
            while((inputLine = reader.readLine()) != null){
                rawHtml += inputLine;
            }
            reader.close();
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(WebCrawler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WebCrawler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rawHtml;
    }
    
}
