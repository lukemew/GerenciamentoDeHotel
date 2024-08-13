public class Reserva {
    private int idReserva;
    private Quarto quarto;
    private Inquilino inquilino;
    private String status;
    private int numeroDeNoites;
    private double valorTotal;


    // Construtor da classe
    public Reserva(Quarto quarto, Inquilino inquilino) {
        this.inquilino = inquilino;
        this.quarto = quarto;
        this.status = "Pendente";
    }

    // Método de exibição:
    public void mostrarDetalhes() {
        System.out.println("Exibindo informações sobre a reserva de id: " + this.idReserva);
        System.out.println("Nome do inquilino associado: " + inquilino.getNome());
        System.out.println("Número do quarto associado: " + quarto.getNumero());
        System.out.println("Tipo de quarto: " + quarto.getTipoDeQuarto());
        System.out.println("Valor total: " + getValorTotal(quarto.getValor()));
        System.out.println("Status: " + this.status);
        System.out.println("---");

    }

    public void mostrarTodosOsDetalhes() {
        if (quarto == null || inquilino == null) {
            System.out.println("Não há informações suficiente para essa reserva");
        } else {
            System.out.println("Exibindo informações sobre a reserva de id: " + this.idReserva);
            System.out.println("Nome do inquilino associado: " + inquilino.getNome());
            System.out.println("Número do quarto associado: " + quarto.getNumero());
            System.out.println("Tipo de quarto: " + quarto.getTipoDeQuarto());
            System.out.println("Valor total: " + getValorTotal(quarto.getValor()));
            System.out.println("Status: " + this.status);
            System.out.println("---");

            System.out.println("Exibindo informações sobre o quarto " + quarto.getNumero());
            System.out.println("Valor da diária: " + quarto.getValor());
            System.out.println("Tipo de quarto: " + quarto.getTipoDeQuarto());
            System.out.println("Capacidade do quarto: " + quarto.getCapacidade());
            System.out.println("---");

            System.out.println("Exibindo informações do inquilino");
            System.out.println("Inquilino hospedado: " + inquilino.getNome());
            System.out.println("Profissão: " + inquilino.getProfissao());
            System.out.println("Idade: " + inquilino.getIdade());
            System.out.println("---");
        }
    }


    // Métodos de inserção:
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNumeroDeNoites(int numeroDeNoites){
        this.numeroDeNoites = numeroDeNoites;
    }

    public double getValorTotal(double valorQuarto){
        return this.valorTotal += valorQuarto * this.numeroDeNoites;
    }


}

