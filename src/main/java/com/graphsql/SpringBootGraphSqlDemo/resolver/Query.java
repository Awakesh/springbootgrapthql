package com.graphsql.SpringBootGraphSqlDemo.resolver;

import com.graphsql.SpringBootGraphSqlDemo.entity.Blog;
import com.graphsql.SpringBootGraphSqlDemo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Query {
    private final BlogRepository blogRepository;

    @Autowired
    public Query(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public List<Blog> allBlogs() {
        return blogRepository.findAll();
    }
}
