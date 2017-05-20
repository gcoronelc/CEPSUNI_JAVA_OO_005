package pe.egcc.app.prueba;

import pe.egcc.app.model.ProductoModel;

public class Prueba01 {

  public static void main(String[] args) {
    
    ProductoModel model = new ProductoModel();
    
    mostrarObjeto("Valor Iniciales",model);
    
    
    model.setNombre("Naranja");
    model.setPrecio(5.80);
    model.setPrecio(500.0);
    model.setStock(200);
    model.setActivo(true);
    
    mostrarObjeto("Otros Datos", model);
    
    ProductoModel model2 = new ProductoModel("Ventilador", 250, 20, true);
    mostrarObjeto("Ventilador", model2);
  }

  private static void mostrarObjeto(String titulo, ProductoModel model) {
    System.out.println("\n" + titulo);
    System.out.println("Nombre: " + model.getNombre());
    System.out.println("Precio: " + model.getPrecio());
    System.out.println("Stock: " + model.getStock());
    System.out.println("Activo: " + model.isActivo());
  }

  
}
