package br.com.erudio.mapper.custom;

import br.com.erudio.data.vo.v1.BookVO;
import br.com.erudio.model.Book;
import org.springframework.stereotype.Service;

@Service
public class BookMapper {

    public BookVO convertEntityToVo(Book book) {
        BookVO vo = new BookVO();
        vo.setKey(book.getId());
        vo.setTitle(book.getTitle());
        vo.setAuthor(book.getAuthor());
        vo.setLaunchDate(book.getLaunchDate());
        vo.setPrice(book.getPrice());
        return vo;
    }

    public Book convertVoToEntity(BookVO book) {
        Book entity = new Book();
        entity.setId(book.getKey());
        entity.setTitle(book.getTitle());
        entity.setLaunchDate(book.getLaunchDate());
        entity.setPrice(book.getPrice());
        entity.setAuthor(book.getAuthor());
        return entity;
    }
}
