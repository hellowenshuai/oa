package com.aynu.oa.desktop.news.handlers;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aynu.oa.commons.beans.NewsLabel;
import com.aynu.oa.commons.vo.Page;
import com.aynu.oa.desktop.news.service.INewsLabelService;

@Controller
@RequestMapping("/desktop/news")
public class NewsLabelHandler {
	
	@Resource(name="newsLabelService")
	private INewsLabelService service;

	public void setService(INewsLabelService service) {
		this.service = service;
	}

	@RequestMapping("/queryNewsLabel.do")
	public String queryNewsLabel(int pageno, HttpSession session) {
		// 查询所有一级栏目
		List<NewsLabel> parents = service.findAllParents();
		// 将查询出的所有一级栏目存放到Session域
		session.setAttribute("parents", parents);
		/*
		for (NewsLabel parent : parents) {
			System.out.println(parent);
		}
		*/
		
		// 查询当前页面信息
		Page<NewsLabel> page = service.findCurrentPage(pageno);
		// 将查询出的页面信息存放到Session域
		session.setAttribute("page", page);
		
		// System.out.println("page = " + page);
		
		return "/html/news/newslabelManager.jsp";
	}

}



















