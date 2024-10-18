package br.com.erudio.integrationtests.vo.wrappers;

import br.com.erudio.integrationtests.vo.BookVO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BookEmbeddedVO {

    @JsonProperty("bookVOList")
    private List<BookVO> books;

    public BookEmbeddedVO() {
    }

    public List<BookVO> getBooks() {
        return books;
    }

    public void setBooks(List<BookVO> books) {
        this.books = books;
    }
}
