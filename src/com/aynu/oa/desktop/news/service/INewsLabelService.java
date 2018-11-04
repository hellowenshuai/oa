package com.aynu.oa.desktop.news.service;

import java.util.List;

import com.aynu.oa.commons.beans.NewsLabel;
import com.aynu.oa.commons.vo.Page;

public interface INewsLabelService {

	List<NewsLabel> findAllParents();

	Page<NewsLabel> findCurrentPage(int pageno);

}
