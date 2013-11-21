

package com.dasanjos.java.config;

import org.simpleframework.xml.Element;

/**
 *
 * @author julialonso
 */
public class Data {
    
    @Element(name="numThreads")
    private int numThreads;
    
    @Element(name="document_root")
    private String pathRoot;
    
    @Element(name="puerto")
    private int puerto;
    
    
    public int getNumThreads(){
        return this.numThreads;
    }
    
    public int getPuerto(){
        return this.puerto;
    }
    
    public String getPathRoot(){
        return this.pathRoot;
    }
    
}
