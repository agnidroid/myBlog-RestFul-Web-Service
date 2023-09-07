package in.stackroute.MyBlog.service;

import in.stackroute.MyBlog.model.Blog;

import java.util.List;

public interface BlogService {
    Blog createBlog(Blog blog);
    List<Blog> getAllBlog();
    void deleteBlogById(int blogId);
    Blog updateBlog(Blog blog);
//    Blog findByBlogTitleAndAuthorNameAndBlogContent(Blog blog);


}
