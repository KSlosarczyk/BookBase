package kamilslosarczyk.books;


import kamilslosarczyk.books.repo.AuthorDataTransferObject;
import kamilslosarczyk.books.repo.AuthorRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorRestApi {


    private AuthorRepo authorRepo;

    public AuthorRestApi(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @GetMapping("/getAuthorInfo")
    public List<AuthorDataTransferObject> get(){
        return authorRepo.getCategoryCount();
    }
}
