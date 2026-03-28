public class Logica {

    public static void main(String[] args) {

        boolean estudou = true;
        boolean fezExercicios = true;

        if (estudou && fezExercicios) {
            System.out.println("Preparado para a prova!");
        }

        boolean irCinema = false;
        boolean ficarEmCasa = true;

        if (irCinema || ficarEmCasa) {
            System.out.println("Vai fazer alguma coisa!");
        }

        boolean acordouCedo = true;
        boolean pegouOnibus = false;

        if (acordouCedo && pegouOnibus) {
            System.out.println("Chegou no horário");
        } else {
            System.out.println("Pode se atrasar");
        }
    }
}
