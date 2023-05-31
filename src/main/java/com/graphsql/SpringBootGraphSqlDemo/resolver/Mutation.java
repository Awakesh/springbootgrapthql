package com.graphsql.SpringBootGraphSqlDemo.resolver;

import com.graphsql.SpringBootGraphSqlDemo.entity.Blog;
import com.graphsql.SpringBootGraphSqlDemo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Mutation {

    private BlogRepository blogRepository;

    @Autowired
    public Mutation(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public Blog createBlog(String title, String content) {
        Blog blog = new Blog(title,content);
        blogRepository.save(blog);
        return blog;
    }
}
