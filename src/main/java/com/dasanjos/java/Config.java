

package com.dasanjos.java;

import com.dasanjos.java.config.Data;
import java.io.File;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author julialonso
 */
public final class Config {
      
    private static final Serializer serializer = new Persister();
    
    private int numThreads;
    private static String docRootPath;
    private int puerto;
    private boolean isConfigOK = false;
    
    static Data data;
    
    public Config(String path){
        
        try {
            File source = new File(path);
            if(!source.exists()){
                this.isConfigOK = false;
            }else{
                data = serializer.read(Data.class, source);
                this.isConfigOK = true;
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        this.numThreads = data.getNumThreads();
        this.puerto = data.getPuerto();
        docRootPath = data.getPathRoot();
        
    }

    public int getNumThreads() {
        return this.numThreads;
    }

    public static final String getDocRootPath() {
        return docRootPath;
    }

    public int getPuerto() {
        return this.puerto;
    }
    
    public boolean isConfigOK(){
        return this.isConfigOK;
    }
    
}
