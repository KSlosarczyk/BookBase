package kamilslosarczyk.books.repo;

public interface AuthorDataTransferObject {


    //IMPORTANT
    //NAMES HAVE TO BE THE SAME AS IN AUTHORREPO
    String getAuthor();
    int getCategoryCount();
    String getBookCategory();
}
