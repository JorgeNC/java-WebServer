

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
    
    private static final String PATH = "./src/main/java/com/dasanjos/java/config/Config.xml";
    private static final Serializer serializer = new Persister();
    private static final File source= new File(PATH);
    
    private int numThreads;
    private static String docRootPath;
    private int puerto;
    
    static Data data;
    
    public Config(){
        
        try {
            data = serializer.read(Data.class, source);
            
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
    
}
