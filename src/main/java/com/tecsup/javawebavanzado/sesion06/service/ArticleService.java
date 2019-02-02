package com.tecsup.javawebavanzado.sesion06.service;

import java.util.List;

import com.tecsup.javawebavanzado.sesion06.model.Article;

public interface ArticleService {

	public List<Article> getAllArticles();
	 
	 public Article getArticleById(long id);
	 
	 public void saveOrUpdate(Article article);
	 
	 public void deleteArticle(long id);
	
}
