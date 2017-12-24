package com.wuxiao.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.wuxiao.dao.IArticleDao;
import com.wuxiao.model.Article;

@Repository
public class ArticleDao implements IArticleDao{

	@Resource
    private SessionFactory sessionFactory;
	
	public ArticleDao() {
		// TODO Auto-generated constructor stub
	}
	
	public Article getFirst(){
		return (Article) sessionFactory.getCurrentSession().createQuery("from Article").setMaxResults(1).uniqueResult();
	}

}
