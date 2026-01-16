public class Car {
    /**
     * Marca del automóvil (por ejemplo, Toyota)
     */
    private String make;

    /**
     * Modelo del automóvil (por ejemplo, Corolla)
     */
    private String model;

    /**
     * Año de fabricación del automovil
     */
    private int year;

    /**
     * Precio del automovil
     */
    private double price;

    /**
     * Crea un nuevo public de Car 
     *
     * @param make  
     * @param model 
     * @param year  
     * @param price 
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Obtiene la marca del automovil
     *
     * @return Marca del automovil
     */
    public String getMake() {
        return make;
    }

    /**
     * Establece la marca del automovil
     *
     * @param make nueva marca
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Obtiene el modelo del automovil
     *
     * @return Modelo del automovil
     */
    public String getModel() {
        return model;
    }

    /**
     * Establece el modelo del automovil
     *
     * @param model Nuevo modelo
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Obtiene el año de fabricación del automovil
     *
     * @return Año de fabricacion
     */
    public int getYear() {
        return year;
    }
}