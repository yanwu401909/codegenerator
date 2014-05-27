package com.up72.framework.generator.util;

public interface FileFilter {
	
	/**
	 * file 文件处理
	 * @param path
	 * @return
	 */
	public boolean accept(String path);

}
