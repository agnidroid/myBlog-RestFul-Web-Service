package in.stackroute.MyBlog.service;


import in.stackroute.MyBlog.exceptions.BlogNotFoundException;
import in.stackroute.MyBlog.exceptions.DuplicateBlogException;
import in.stackroute.MyBlog.model.Blog;
import in.stackroute.MyBlog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor

public class BlogServiceImpl implements BlogService{
    private final BlogRepository repository;

    @Override
    public Blog createBlog( Blog blog){
//        Blog existingBlog = repository.findByTitleAuthorAndContent(blog.getBlogTitle(),blog.getAuthorName(),blog.getBlogContent());
//        if(existingBlog!=null){
//            throw new DuplicateBlogException("A blog with the same title, author, and content already exists.");
//        }
        return repository.save(blog);
    }

    @Override
    public List<Blog> getAllBlog(){
        return repository.findAll();
    }



    @Override
    public void deleteBlogById(int blogId){
        if(!repository.existsById(blogId)){
            throw new BlogNotFoundException("A blog not exists.");
        }
        repository.deleteById(blogId);
    }
    @Override
    public Blog updateBlog(Blog blog){
        return repository.save(blog);
    }
}
