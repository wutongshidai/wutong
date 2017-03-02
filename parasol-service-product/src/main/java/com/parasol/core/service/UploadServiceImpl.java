package com.parasol.core.service;

import org.springframework.stereotype.Service;

import com.parasol.common.fdfs.FastDFSUtils;

/**
 * 上传图片
 * @author wuliang
 *
 */
@Service("uploadService")
public class UploadServiceImpl implements UploadService {

	@Override
	public String uploadService(byte[] pic, String name, long size) throws Exception {
		return FastDFSUtils.uploadPic(pic, name, size);
	}

}
