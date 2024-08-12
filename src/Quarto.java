public class Quarto {
    private int numero;
    private double valor;
    private Inquilino inquilino;

    public Quarto(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Quarto() {
        this.inquilino = null;
    }

    public void mostrarDetalhes() {
        System.out.println("Exibindo informações sobre o quarto " + numero);
        System.out.println("Valor da diária: " + valor);
        System.out.println("---");
        if (inquilino != null) {
            System.out.println("Exibindo informações do inquilino");
            System.out.println("Inquilino hospedado: " + inquilino.getNome());
            System.out.println("Profissão: " + inquilino.getProfissao());
            System.out.println("Idade: " + inquilino.getIdade());
            System.out.println("---");
        } else {
            System.out.println("Quarto disponível");
            System.out.println("---");
        }
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean setDesconto(double desconto) {
        if(desconto > 0.3) {
            return false;
        }
        this.valor -= this.valor * desconto;
        return true;
    }

}
