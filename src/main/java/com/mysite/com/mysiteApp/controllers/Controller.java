package com.mysite.com.mysiteApp.controllers;

import com.mysite.com.mysiteApp.entities.Message;
import com.mysite.com.mysiteApp.repositorys.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    MessageRepository messageRepository;
    @RequestMapping("/")
    public void index(HttpServletResponse response) throws IOException {
        response.sendRedirect("index.html");
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String saveMessage(@RequestBody Message message){
       /* messageRepository.save(message).getDate();*/
        message.setDate(new Date());
        System.out.println("hello post is working congrat date is : "+messageRepository.save(message).getDate());
        return "OK";
    }
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Message> getAll(){
        return messageRepository.findAll();
    }
}
