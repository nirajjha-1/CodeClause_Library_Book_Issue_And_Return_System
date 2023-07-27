package JAVA.Internship.CodeClause.LIbrary_Mgmt;

public class Book {
    private String id;
    private String title;
    private String author;
    private String publishyear;
    private String status;

    // CONSTRUCTOR
    public Book(){}

    public Book(String id, String title, String author, String publishyear, String status){
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishyear = publishyear;
        this.status = status;
    }

    public String getId(){return id;}
    public void setId(String id){this.id = id;}
    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}
    public String getAuthor(){return author;}
    public void setAuthor(String author){this.id = author;}
    public String getPublishyear(){return publishyear;}
    public void setPublishyear(String publishyear){this.publishyear = publishyear;}
    public String getStatus(){return status;}
    public void setStatus(String status){this.status = status;}

    public String toString(){
        return "Book Details :\nId : "+id+"\nTitle : "+title+"\nAuthor : "+author+"\nPublish Year : "+publishyear+"\nStatus : "+status;
    }


}
