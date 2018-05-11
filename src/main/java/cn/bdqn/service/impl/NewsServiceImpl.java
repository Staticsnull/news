package cn.bdqn.service.impl;

import cn.bdqn.dao.NewsMapper;
import cn.bdqn.entity.NewsComment;
import cn.bdqn.entity.NewsDetail;
import cn.bdqn.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsMapper mapper;
    @Override
    public List<NewsDetail> getNewsList() {
        return mapper.getNewsList();
    }
    public boolean deleteNews(Integer id){
        int count = mapper.deleteNews(id);
        int count1 = mapper.deleteComment(id);
        return  count > 0 && count1 > 0;
    }

    @Override
    public boolean addComment(NewsComment conment) {
        int count = mapper.addComment(conment);
        return count > 0;
    }

    @Override
    public boolean deleteNewse(String id) {
        int count = mapper.deleteNewse(id);
        int count1 = mapper.deleteCommente(id);
        return  count > 0 && count1 > 0;
    }
}
