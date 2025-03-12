import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


	
	
	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.Test;

	class GestorTiendaTest {
	    static GestorTienda tienda;
	    
	    
	    
	    @BeforeAll
	    static void setUp() {
	        tienda = new GestorTienda(); 
	    }
	    @Test
	    void testCalcularSinDescuento() {
	       
	        
	        assertEquals(0, tienda.calcularDescuento(100, 2));
	    }

	    @Test
	    void testCalcularDescuento5PorCiento() {
	       
	        
	        assertEquals(5, tienda.calcularDescuento(100, 5));
	    }
	    
	    @Test
	    void testCalcularDescuento10PorCiento() {
	       
	        
	        assertEquals(20, tienda.calcularDescuento(200, 11));
	    }

	   
	    
	    @Test
	    void testCategorizarProducto_Economico() {
	      
	        
	       assertEquals("Económico",tienda.categorizarProducto(5));
	    }
	    @Test
	    void testCategorizarProducto_Estandar() {
		      
	        
		       assertEquals("Estándar",tienda.categorizarProducto(30));
		    }
	    
	    @Test
	    void testCategorizarProducto_Premiun() {
		      
	        
		       assertEquals("Premium",tienda.categorizarProducto(100));
		    }

	    @Test
	    void testBuscarProducto_Encontrado() {
	        String[] ninventario = {"PC", "Mouse", "Teclado"};
	        
	       
	        assertNotNull(tienda.buscarProducto(ninventario, "Mouse"));
	    }

	 
	    
	    
	    @Test
	    void testBuscarProducto_CasoInsensible() {
	        String[] ninventario = {"PC", "Mouse", "Teclado"};
	        
	      
	        assertEquals("Mouse", tienda.buscarProducto(ninventario, "mouse"));
	    }


	    @Test
	    void testBuscarProducto_CasoNull() {
	        String[] ninventario = {"PC", "Mouse", "Teclado"};
	        
	    
	        assertNull(tienda.buscarProducto(ninventario, "mouses"));
	    }
	        
}
	
	
	
		

