package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("otraaaaa");
	}

	@RequestMapping("/") 	
	public String hola() {
		System.out.println("qpd prueba");
		return "qpd prueba";

	}
	@RequestMapping("/hola")
	public String adios() {
		System.out.println("hola");
		return "hola";
	}

	@RequestMapping("/adios")
	public String adios() {
		System.out.println("adios");
		return "adios";
	}

	
	@RequestMapping("/html")
	public String html() {
		String html = "<html>\n" +
				"<head><title>Mi pagina HTML</title></head>\n" +
				"<body>\n" +
				"<h1>Bienvenido a mi pagina HTML</h1>\n" +
				"<p>Esta es una pagina generada desde un controlador Spring Boot.</p>\n" +
				"</body>\n" +
				"</html>";
		return html;
	}
}
