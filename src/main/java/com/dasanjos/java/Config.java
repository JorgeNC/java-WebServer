

package com.dasanjos.java;

import com.dasanjos.java.config.Data;
import java.io.File;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author julialonso
 */
public class Config {
    
    private static final String PATH = "/config/Config.xml";
    private static final Serializer serializer = new Persister();
    private static final File source = new File(PATH);
    
    static Data data;
    
    public Config(){
        try {
            data =  serializer.read(Data.class, source);
        } catch (Exception ex) {
            
        }
    }
    
    public int NUM_THREADS = data.getNumThreads();
    public String PATH_DOC_ROOT = data.getPathRoot();
    public int PUERTO = data.getPuerto();
    
    
    
    
}
