public class RedCircle extends Circle {

    public RedCircle(float ray, String color) {
        super(ray, "RED");
    }
    
    @Override
    public void draw() {
        System.out.println("Dentro de Circulo " + getColor() + " de raio " + getRay()
                + "no método draw()");
    }
}
