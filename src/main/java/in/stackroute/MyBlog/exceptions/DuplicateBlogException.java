package in.stackroute.MyBlog.exceptions;

public class DuplicateBlogException extends  RuntimeException{
    public  DuplicateBlogException(String message){
        super(message);
    }
}
