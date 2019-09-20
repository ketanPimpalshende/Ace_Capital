package com.pdfgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pdfgenerator.Controller.pdfGenerator;

@SpringBootApplication
public class PdfGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfGeneratorApplication.class, args);
		pdfGenerator pd=new pdfGenerator();
		pd.PdfGenerator();
		
	}

}
