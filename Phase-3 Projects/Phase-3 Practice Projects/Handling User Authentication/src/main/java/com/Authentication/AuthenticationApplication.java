package com.Authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({
      AuthenticationController.class,
      UserNotFoundException.class,
      AuthenticationService.class,
      User.class
})
public class AuthenticationApplication 
{

   public static void main(String[] args) 
   {
      SpringApplication.run(AuthenticationApplication.class, args);
   }

}