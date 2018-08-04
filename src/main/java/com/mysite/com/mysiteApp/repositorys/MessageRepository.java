package com.mysite.com.mysiteApp.repositorys;

import com.mysite.com.mysiteApp.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository <Message, Long> {
}
