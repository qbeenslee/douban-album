package cn.blackgray.douban.album.download.model;

import cn.blackgray.douban.album.download.common.Common;

/**
 * Õº∆¨MODEL
 * @author BlackGray
 */
public class BGImage {
	
	private String ownerName;		//’’∆¨À˘”–’ﬂÍ«≥∆
	private String ownerURL;		//’’∆¨À˘”–’ﬂID
	private String desc;			//’’∆¨√Ë ˆ
	private String commentURL;		//’’∆¨∆¿¬€
	private Integer commentTotal;	//’’∆¨∆¿¬€ ˝
	private String url;				//’’∆¨µÿ÷∑
	private String name;			//’’∆¨√˚
	private String number;			//’’∆¨±‡∫≈
	private String id;				//’’∆¨ID - ∂π∞Í’’∆¨ID

	public BGImage() {
		super();
	}
	
	public BGImage(String desc, String url) {
		super();
		this.desc = desc;
		this.url = url;
	}
	
	public BGImage(String number, String url, String desc) {
		super();
		this.desc = desc;
		this.url = url;
		this.number = number;
	}
	
	
	public BGImage(String desc, String url, Integer commentTotal) {
		super();
		this.desc = desc;
		this.commentTotal = commentTotal;
		this.url = url;
	}

	public String getId() {
		String name = this.getName();
		if (name.matches("p\\d+.(" + Common.IMAGE_TYPE + ")")) {
			return name.substring(name.indexOf("p") + 1,name.lastIndexOf("."));
		}else{
			return null;
		}
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}
	public String getOwnerURL() {
		return ownerURL;
	}
	public String getDesc() {
		return desc;
	}
	public String getCommentURLURL() {
		return commentURL;
	}
	public String getUrl() {
		return url;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setOwnerURL(String ownerURL) {
		this.ownerURL = ownerURL;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setCommentURLURL(String commentURL) {
		this.commentURL = commentURL;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return this.url.substring(this.url.lastIndexOf("/") + 1);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getCommentURL() {
		return commentURL;
	}

	public void setCommentURL(String commentURL) {
		this.commentURL = commentURL;
	}

	public Integer getCommentTotal() {
		return commentTotal;
	}

	public void setCommentTotal(Integer commentTotal) {
		this.commentTotal = commentTotal;
	}

	@Override
	public String toString() {
		return "BGImage [ownerName=" + ownerName + ", ownerURL=" + ownerURL
				+ ", desc=" + desc + ", commentURL=" + commentURL
				+ ", commentTotal=" + commentTotal + ", url=" + url + ", name="
				+ name + ", number=" + number + ", id=" + id + "]";
	}


}
