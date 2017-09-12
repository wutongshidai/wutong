package com.parasol.common.utils;

import java.io.*;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.DefaultPropertiesPersister;
import org.springframework.util.PropertiesPersister;

/**
 * @description: 属性文件读取工具类
 */
public class PropertiesUtils {

    private static final String DEFAULT_ENCODING = "UTF-8";

    private static Logger logger = Logger.getLogger(PropertiesUtils.class);

    private static PropertiesPersister propertiesPersister = new DefaultPropertiesPersister();
    private static long lastModifiedTime = 0;
    private static String filePath = "config.properties";

    private static Properties entry;

    static {
        entry = loadProperties(filePath);
    }

    public static String getStringValue(String key) {
        if(isFileModified(filePath)){
            entry = loadProperties(filePath);
        }
        return entry.getProperty(key);
    }

    public static int getIntValue(String key) {
        if(isFileModified(filePath)){
            entry = loadProperties(filePath);
        }
        return Integer.parseInt(entry.getProperty(key));
    }

    /**
     * 载入多个properties文件, 相同的属性在最后载入的文件中的值将会覆盖之前的载入.
     * 文件路径使用Spring Resource格式, 文件编码使用UTF-8.
     */
    public static Properties loadProperties(String resourcesPaths) {
        Properties props = new Properties();

        logger.debug("Loading properties file from:" + resourcesPaths);

        File file = new File(PropertiesUtils.class.getResource("/").getPath() + resourcesPaths);
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            lastModifiedTime = file.lastModified();
            propertiesPersister.load(props,
                    new InputStreamReader(is, DEFAULT_ENCODING));
        } catch (IOException ex) {
            logger.info("Could not load properties from classpath:" + resourcesPaths + ": " + ex.getMessage());
        } finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return props;
    }

    private static boolean isFileModified(String path){
        File file = new File(PropertiesUtils.class.getResource("/").getPath() + path);
        if(file == null || file.lastModified() != lastModifiedTime){
            return true;
        }
        return false;
    }
}
