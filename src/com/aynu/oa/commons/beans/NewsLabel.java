package com.aynu.oa.commons.beans;

import java.io.Serializable;
import java.util.Set;
// 新闻栏目
public class NewsLabel implements Serializable {
	private Integer id;
	private String name;
	private String content;
	// 关联属性：将当前类看作一方（父栏目）， 则该关联属性就是多方（子栏目）
	private Set<NewsLabel> child;
	// 关联属性：将当前类看作多方（子栏目），则该关联属性就是一方（父栏目）
	private NewsLabel parent;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Set<NewsLabel> getChild() {
		return child;
	}

	public void setChild(Set<NewsLabel> child) {
		this.child = child;
	}

	public NewsLabel getParent() {
		return parent;
	}

	public void setParent(NewsLabel parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "NewsLabel [id=" + id + ", name=" + name + ", content=" + content + ", child=" + child + ", parent="
				+ parent + "]";
	}

}
