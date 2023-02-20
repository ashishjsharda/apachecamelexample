package com.example.apachecameldemo;

import org.apache.camel.Processor;

public class FileProcessor implements Processor {

        @Override
        public void process(org.apache.camel.Exchange exchange) throws Exception {

                System.out.println("FileProcessor.process()");

        }

}

