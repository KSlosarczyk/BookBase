package kamilslosarczyk.books;


import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import kamilslosarczyk.books.repo.AuthorDataTransferObject;
import kamilslosarczyk.books.repo.AuthorRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Route
public class AuthorRestGUI extends VerticalLayout {


    private AuthorRepo authorRepo;

    public AuthorRestGUI(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
        List<AuthorDataTransferObject> authorList = authorRepo.getCategoryCount();

        Grid<AuthorDataTransferObject> grid = new Grid<>(AuthorDataTransferObject.class);
        grid.setItems(authorList);
        add(grid);
    }

}
