package com.skillsunion.notification;

import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class NotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
	}

	/*
		TODO:		
		- Create a @PostConstruct method to be executed after spring container has completed configuration.
		- Invite input using Scanner and System.in for value "to" and "message".
		- Set the input to setup(string, string) method in NotificationService.java.
		- Invoke send() method in Notification.java.
	*/

	//Dependency injection
	NotificationService notificationService;
	public NotificationApplication(NotificationService notificationService){
		this.notificationService = notificationService;
	}

	@PostConstruct
	private void postConstruct(){
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		System.out.println("To");
		String to = scanner.nextLine();  // Read user input
		System.out.println("Message");
		String message = scanner.nextLine();  // Read user input

		notificationService.setup(to, message);
		notificationService.send();
	}
	


}
