package in.stackroute.MyBlog.repository;

import in.stackroute.MyBlog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
//    @Query("SELECT blog FROM Blog b WHERE b.blogTitle = :title AND b.authorName = :author AND b.blogContent = :content")
//    Blog findByTitleAuthorAndContent( String title,  String author,  String content);
}
