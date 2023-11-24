public class main {
    private static String mensajeCodi = "Hola soy de la chapiza";

    public static void main(String[] args) {
        String mensajeDecodi = decodificarMensaje(mensajeCodi);

        System.out.println("Mensaje decodificado top secret: " + mensajeDecodi);
    }

    private static String decodificarMensaje(String mensajeCodi) {
        char[] caracteres = mensajeCodi.toCharArray();
        StringBuilder mensajeDeco = new StringBuilder();

        for (char c : caracteres) {
            char caracter = (char) (c - 1);
            mensajeDeco.append(caracter);
        }

        return mensajeDeco.toString();
    }
}
