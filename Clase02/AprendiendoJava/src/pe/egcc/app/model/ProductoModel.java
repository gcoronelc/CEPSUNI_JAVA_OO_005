package pe.egcc.app.model;

public class ProductoModel {

  private String nombre;
  private double precio;
  private int stock;
  private boolean activo;

  public ProductoModel() {
    //    this.nombre = "Televisor";
    //    this.precio = 4500.0;
    //    this.stock = 100;
    //    this.activo = true;
    this("Refrigeradora", 3578.99, 80, true);
    System.out.println("Objeto creado");
  }

  public ProductoModel(String nombre, double precio, 
          int stock, boolean activo) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
    this.activo = activo;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto");
  }
  
  
  

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

}
