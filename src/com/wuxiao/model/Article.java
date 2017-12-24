package com.wuxiao.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 诗词表
 * @author ownfi
 *
 */
@Entity
@Table(name="article")
public class Article {

	/**
	 * 编号，自增
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="cat_id")
	private Integer cat_id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="content")
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	private Date add_time;

	@Override
	public String toString() {
		return "Article [id=" + id + ", cat_id=" + cat_id + ", title=" + title + ", content=" + content + ", add_time="
				+ add_time + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCat_id() {
		return cat_id;
	}

	public void setCat_id(Integer cat_id) {
		this.cat_id = cat_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getAdd_time() {
		return add_time;
	}

	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}

}
