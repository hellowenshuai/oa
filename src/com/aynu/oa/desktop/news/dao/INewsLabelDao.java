package com.aynu.oa.desktop.news.dao;

import java.util.List;
import java.util.Map;

import com.aynu.oa.commons.beans.NewsLabel;

public interface INewsLabelDao {
	// 获取所有一级栏目详情
	List<NewsLabel> selectAllParents();
	// 获取所有栏目数量
	int selectAllCount();
	// 获取当前页所包含的所有栏目详情
	List<NewsLabel> selectCurPageNewsLabels(Map<String, Integer> map);

}
