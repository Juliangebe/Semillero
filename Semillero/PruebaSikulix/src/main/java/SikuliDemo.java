import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.chrome.ChromeDriver;

public class SikuliDemo {

    public static void main(String[] args) throws FindFailed {
    	//Como hemos visto Screen es la clase base para utilizar el API de alto nivel del interfaz de usuario
    	//Sikuli utiliza la técnica de reconocimiento de imágenes para reconocer elementos 
    	//en la pantalla Encuentra elementos en pantalla basados unicamente en sus imágenes
    	

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); //  La primera declaración implica configurar la ruta ejecutable del controlador para Chrome.
        String filepath = "C:\\Users\\SBMEDADMIN\\eclipse-workspace\\PruebaSikulix\\imagenes"; // ruta de la caperta donde estàn las imagenes
        String inputFilePath = "C:\\Users\\SBMEDADMIN\\eclipse-workspace\\PruebaSikulix\\imagenes"; // ruta de la caperta donde estàn las imagenes
        Screen s = new Screen(); //creación de objetos para las clases de Pantalla
        Pattern GoogleSearchBar = new Pattern(filepath + "GoogleSearchBar.PNG"); // se hacen capturas de pantalla de la ventan emergente de la barra de busqueda
        Pattern GoogleSearchButton = new Pattern(filepath + "GoogleSearchButton.PNG"); // se hacen capturas de pantalla del boton buscar 
        WebDriver driver; //instancia del webdriver

        // Para abrir el navegador chrome  
        driver = new ChromeDriver();
        driver.get("http:/www.google.com"); // página para abrir por defecto

        
        driver.findElement(By.xpath(".//*[@id='photoimg']")).click(); // clic en el botón elegir archivo usando la siguiente declaración
        s.wait(GoogleSearchBar, 20); // Espera a que aparezca la ventana emergente. El método de espera se utiliza para manejar el retraso asociado con la apertura de ventanas emergentes después de hacer clic en el botón de búsqueda.
        s.type(GoogleSearchBar, inputFilePath + "Test.docx"); // aca va  la ruta del archivo en el cuadro de texto del archivo de entrada y hace clic en el botón Abrir
        s.click(GoogleSearchButton);

        // Cerrar el navegador
        driver.close();

    }

}