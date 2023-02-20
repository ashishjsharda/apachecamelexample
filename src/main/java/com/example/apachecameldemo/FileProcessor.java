package com.example.apachecameldemo;
import org.apache.camel.Processor;

/**
 * Add logic to modify name
 * @author ashish
 */
public class FileProcessor implements Processor {

        @Override
        public void process(org.apache.camel.Exchange exchange) throws Exception {
               String originalFile = exchange.getIn().getBody(String.class);
               String modifiedFile = originalFile.replaceAll("Apache", "Red Hat");
                exchange.getIn().setBody(modifiedFile);
        }
}

