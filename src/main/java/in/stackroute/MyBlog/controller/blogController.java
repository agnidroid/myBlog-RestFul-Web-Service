package in.stackroute.MyBlog.controller;

import in.stackroute.MyBlog.model.Blog;
import in.stackroute.MyBlog.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/blogs")
public class blogController {
    private final BlogService blogService;

    @PostMapping
    public ResponseEntity<Blog> createBlog( @RequestBody Blog blog){
        var savedBlog=blogService.createBlog(blog);
        return ResponseEntity.status(201).body(savedBlog);
    }

    @GetMapping
    public ResponseEntity<List<Blog>> getBlog(){
        if(blogService.getAllBlog().isEmpty()){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(blogService.getAllBlog());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlog(@PathVariable("id") int blogId){

            blogService.deleteBlogById(blogId);
            return ResponseEntity.status(204).build();

    }

    @PutMapping("/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable("id") int blogId,@RequestBody Blog blog){

         blog.setBlogId(blogId);
         var updatedBlog=blogService.updateBlog(blog);
         return ResponseEntity.status(200).body(updatedBlog);


    }


}
