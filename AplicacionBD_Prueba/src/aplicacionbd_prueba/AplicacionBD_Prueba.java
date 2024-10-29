package aplicacionbd_prueba;


public class AplicacionBD_Prueba {

    public static void main(String[] args) {
        crud objeto = new crud();
        objeto.crearUsuario("Pablo", "Acosta",4);
        objeto.leerDatos();
        objeto.actualizarDatos("Luisus", "Ortiz", 50);
        objeto.eliminarDato(2);
    }
    
}
