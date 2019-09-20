package com.pdfgenerator.Controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfGenerator 
{
	public void PdfGenerator()
	{
		
		/* Document document = new Document();
	      try
	      {
	         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
	         document.open();
	         document.add(new Paragraph("A Hello World PDF document."));
	         document.close();
	         writer.close();
	      } catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }
	   }*/
	
		
		
		/*Document document = new Document();
		try
		{
		    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("SetAttributeExample.pdf"));
		    document.open();
		    document.add(new Paragraph("Some content here"));
		 
		    //Set attributes here
		    document.addAuthor("Lokesh Gupta");
		    document.addCreationDate();
		    document.addCreator("HowToDoInJava.com");
		    document.addTitle("Set Attribute Example");
		    document.addSubject("An example to show how attributes can be added to pdf files.");
		 
		    document.close();
		    writer.close();
		} catch (Exception e)
		{
		    e.printStackTrace();
		}
		
		
		
	}*/
		
	}
		
		
}
