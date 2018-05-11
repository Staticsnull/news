package cn.bdqn.service;

import cn.bdqn.entity.NewsComment;
import cn.bdqn.entity.NewsDetail;

import java.util.List;

public interface NewsService {
    List<NewsDetail> getNewsList();
    boolean deleteNews(Integer id);
    boolean deleteNewse(String id);
    boolean addComment(NewsComment conment);




}
