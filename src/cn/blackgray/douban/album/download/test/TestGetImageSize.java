package cn.blackgray.douban.album.download.test;

import java.io.File;

import cn.blackgray.douban.album.download.service.image.ImageInfo;
import cn.blackgray.douban.album.download.service.image.ImageUtils;


public class TestGetImageSize {
	
	public static void main(String[] args) {
		ImageInfo rawInfo = ImageUtils.getImageSize("D:/Workspaces/source/¶¹°êÏà²áÏÂÔØÆ÷/bin/Ó°ÈË-ºÂÀÙ Lei Hao Í¼Æ¬"+File.separatorChar+"raw"+File.separatorChar+"p2112306858.jpg");
		System.out.println(rawInfo);
		
		rawInfo = ImageUtils.getImageSize("D:/Workspaces/source/¶¹°êÏà²áÏÂÔØÆ÷/bin/Ó°ÈË-ºÂÀÙ Lei Hao Í¼Æ¬"+File.separatorChar+"raw"+File.separatorChar+"p1553084119.jpg");
		System.out.println(rawInfo);
		
	}

}
