package co.com.google.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuscarEnGooglePOM {
	
	static WebDriver robot;
	static String usario= "juliangebe@gmail.com";
	static String contraseña = "pruebasjulian123";
	
	public BuscarEnGooglePOM() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");		//se ubica el controlador para el navegador
		
		 robot = new ChromeDriver(); // se inicializa el objeto 
		
		
	}
	
	
	
	
	public  static void AbrirNavegador(String url) {
		robot.get(url); // se abre el navegador y se le manda la url 
		
		
		
	}
	
	public static void CerrarNavegador() {  // metodo para cerrar el navegador 
		robot.close(); 
		
		
	}
	
	public static void MaximixarVentana() { //metodo para maximizar el navegador
		robot.manage().window().maximize();
		
	}
	
	//digitar texto
public static  void Digitar(String elemento, String letras) {  
	robot.findElement(By.id(elemento)).sendKeys(letras); // luego de identificar el nombre de la barra de busqueda se le manda el texto 
	
	
}

//metodo para hacer clic en el botón buscar
public static void ClicBuscar(String boton) {
	robot.findElement(By.id(boton)).click(); // identifica elemento a  buscar  y se le da clic
	
}

public static void HacerClic(String id) {
	robot.findElement(By.className(id)).click();
	
	
}

public static void PresionarEscape(XPath NombreClase) {  // metodo presionar escape
	robot.findElement(By.xpath("NombreClase")).sendKeys(Keys.ESCAPE);
	
}


		public static void ObtenerUrl() { //Obtiene el valor de tipo String que representa la dirección URL actual que el navegador está mirando
			//String url;
			 robot.getCurrentUrl();
			//System.out.println(url);
			
			
		}
	
		public static void AbrirPestaña(String url) {   //Abre automáticamente una nueva ventana del explorador y busca la página que especifique dentro de sus paréntesis.
														//Hace exactamente lo mismo que el método get().
			robot.navigate().to(url);
			
			
		}
		
		public static void Esperar(int segundos) throws InterruptedException { // merodo para esperar 
			robot.wait(segundos, segundos);
			
		}
		
		
		public static void ActualizarPagina() { //metodo para refrescar la pagina
			robot.navigate().refresh();
			
		}
		
		public static void VerificarTitulo(String titulo) { // metodo para verificar el titulo , recibe el titulo a verificar
			assertEquals(titulo, robot.getTitle());			// compara el titulo esperado con el actual 
			
		} 
		
		public static void VerificarTexto(String texto) { //metodo para verificar si el texto escrito coincide con el que mando 
			String textoEnBarra = robot.findElement(By.id("lst-ib")).getAttribute("name");
			assertEquals(texto, robot.findElement(By.id("lst-ib")).getAttribute(textoEnBarra));
			
			
		}
		
		public static void VerificaUrl(String palabra) { //metodo para verificar la url
			assertTrue(robot.getCurrentUrl().contains(palabra)); //compara la url con una palabra que le demos 
			
			
		}
		
		public static void VerificarCampoNoVacio(String id) {		//metodo para verificar si el campo donde me ubico no està vacio 	
			assertNotNull(robot.findElement(By.id(id)));
			
			
		}
		

}
