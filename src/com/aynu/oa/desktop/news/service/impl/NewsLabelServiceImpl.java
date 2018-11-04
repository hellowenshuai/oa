package com.aynu.oa.desktop.news.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aynu.oa.commons.beans.NewsLabel;
import com.aynu.oa.commons.vo.Page;
import com.aynu.oa.desktop.news.dao.INewsLabelDao;
import com.aynu.oa.desktop.news.service.INewsLabelService;

public class NewsLabelServiceImpl implements INewsLabelService {
	private INewsLabelDao dao;
	
	public void setDao(INewsLabelDao dao) {
		this.dao = dao;
	}

	@Override
	public List<NewsLabel> findAllParents() {
		return dao.selectAllParents();
	}

	@Override
	public Page<NewsLabel> findCurrentPage(int pageno) {
		Page<NewsLabel> page = new Page<>();
		// 初始化当前页码
		page.setPageno(pageno);
		
		// 初始化totalRows
		int totalRows = dao.selectAllCount();
		page.setTotalRows(totalRows);
		
		// 初始化当前页所包含的栏目具体详情datas
		Map<String, Integer> map = new HashMap<>();
		map.put("pageStartIndex", page.getPageStartIndex());
		map.put("pageSize", page.getPageSize());
		List<NewsLabel> datas = dao.selectCurPageNewsLabels(map);
		page.setDatas(datas);
		
		return page;
	}

}
