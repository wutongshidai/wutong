package com.parasol.common.load;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


import org.apache.commons.codec.binary.Base64;
import org.fusesource.hawtbuf.ByteArrayInputStream;

/**
 * 
 * 
 * 前端用H5的fileReader后台接收并保存到服务器
 * 
 * @author 陈龙飚
 *
 */
public class fileUpload {

	/**
	 * 
	 * @param fileData
	 *            fileReader的图片串，后台使用String接收
	 * @return
	 */
	public static String saveImg(String fileData,String path) {
		String flag = "fail";
		try{  	
//			String fileUrl = "/vdb1/docker/webapp2/parasol-controller-0.0.1-SNAPSHOT/imgUpload/" + name +".png";
//			String fileUrl = "/usr/local/tomcat/webapps/parasol-controller-0.0.1-SNAPSHOT/imgl/" + name + ".png";
//			String fileUrl = "E:/cehshi/" + name +".png";
//			String fileUrl = "E:/cehshi/" + name;
//			System.out.println(name);
			System.out.println("-------");
			System.out.println(path);
			File file = new File(path);
//			File file = new File("/usr/local/tomcat/webapps/parasol-controller-0.0.1-SNAPSHOT/filesOut/Upload/20170701003750/ershazi.txt");
//			File file = new File("/usr/local/tomcat/webapps/parasol-controller-0.0.1-SNAPSHOT/imgl/" + name + ".png" );
			flag = writeFile(new ByteArrayInputStream(Base64.decodeBase64(fileData)),file);
			System.out.println(Base64.decodeBase64(fileData).length);
			return flag;
		}catch(Exception e){
			System.out.println("创建写入流失败-------------");
			return flag;
		}
	};

	public static String writeFile(InputStream ins, File file){
		try{
			OutputStream os = new FileOutputStream(file);
			int bytesRead = 0;
			byte[] buffer = new byte[8192];
			while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
				os.write(buffer, 0, bytesRead);
			}
			os.close();
			ins.close();
			return "success";
		}catch(Exception e){			
			e.printStackTrace();
			System.out.println("Io流写入文件失败-----------------");
			return "fail";
		}
	}

}