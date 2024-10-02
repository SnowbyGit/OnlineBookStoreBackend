package com.online.bookstore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.online.bookstore.entity.Admin;
import com.online.bookstore.entity.Book;
import com.online.bookstore.entity.Order;
import com.online.bookstore.entity.User;
import com.online.bookstore.service.BookStockService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/bookStock")
public class BookStockController {

    @Autowired
    private BookStockService bookStockService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getAllBooks() throws Exception {
        return new ResponseEntity<>(bookStockService.getAllBooks(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/addBook", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Object> addNewBookToStock(@RequestBody Book book) throws Exception {
        return bookStockService.addNewBookToStock(book);
    }

    @RequestMapping(value = "/isBookExist", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> isBookExist(@RequestBody Book book) throws Exception {
        return bookStockService.isBookExist(book);
    }


    @RequestMapping(value = "/showOrders", method = RequestMethod.GET)
    public ResponseEntity<List<Order>> getAllBooksFromOrdersTable() throws Exception {
        return new ResponseEntity<>(bookStockService.getAllBooksFromOrdersTable(),HttpStatus.OK);
    }

    @RequestMapping(value = "/showAdmins", method = RequestMethod.GET)
    public ResponseEntity<List<Admin>> getAllAdmins() throws Exception {
        return new ResponseEntity<>(bookStockService.getAllAdmins(),HttpStatus.OK);
    }

    @RequestMapping(value = "/showUsers", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUsers() throws Exception {
        return new ResponseEntity<>(bookStockService.getAllUsers(),HttpStatus.OK);
    }

    @RequestMapping(value = "/isAdminExist/adminUserName={adminUserName}", method = RequestMethod.GET)
    public Map<String, Object> isAdminExist(@PathVariable("adminUserName") String adminUserName) throws Exception {
        return bookStockService.isAdminExist(adminUserName);
    }

    @RequestMapping(value = "/isUserExist/userId={userId}", method = RequestMethod.GET)
    public Map<String, Object> isUserExist(@PathVariable("userId") String userId) throws Exception {
        return bookStockService.isUserExist(userId);
    }

   

    @RequestMapping(value = "/isAdminPasswordCorrect", method = RequestMethod.POST)
    public Map<String, Object> isAdminPasswordCorrect(@RequestBody Map<String, String> adminPassword) throws Exception {
        return bookStockService.isAdminPasswordCorrect(adminPassword.get("username"), adminPassword.get("password"));
    }

}
