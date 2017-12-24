package com.wuxiao.action;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.wuxiao.dao.IArticleDao;
import com.wuxiao.model.Article;

import java.util.List;

import javax.annotation.Resource;

@Controller("TestAction")
public class TestAction extends BaseAction {

	@Autowired
    private IArticleDao ArticleDao;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public String test() throws Exception {
		try {
			Article a = ArticleDao.getFirst();
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return SUCCESS;
	}

}
