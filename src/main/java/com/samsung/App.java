package com.samsung;

import com.samsung.domain.Author;
import com.samsung.domain.Book;
import com.samsung.domain.Comment;
import com.samsung.domain.Genre;
import com.samsung.repository.AuthorRepository;

import com.samsung.repository.BookRepository;
import com.samsung.repository.CommentRepository;
import com.samsung.repository.GenreRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.util.List;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        List<Author> authorList = context.getBean(AuthorRepository.class).findAll();
        authorList.stream().forEach(System.out::println);
        List<Genre> genreList = context.getBean(GenreRepository.class).findAll();
        genreList.stream().forEach(System.out::println);
       /* List<Book> bookList = context.getBean(BookRepository.class).findAll();
        bookList.stream().forEach(System.out::println);*/
   /*     List<Comment> commentList = context.getBean(CommentRepository.class).findAll();
        commentList.stream().forEach(System.out::println);*/
      context.close();
        /*try {
            Console.main(args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }*/
    }
}
