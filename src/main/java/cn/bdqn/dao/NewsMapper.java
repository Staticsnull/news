package cn.bdqn.dao;

import cn.bdqn.entity.NewsComment;
import cn.bdqn.entity.NewsDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewsMapper {
    List<NewsDetail> getNewsList();
    int deleteNews(Integer id);
    int deleteComment(Integer id);
    int addComment(NewsComment conment);
    int deleteNewse(String id);
    int deleteCommente(String id);

}
