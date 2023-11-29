public class Smartphone {
    private boolean ligado;

    public Smartphone() {
        this.ligado = false;
    }

    public void tirarFoto() {
        if (ligado) {
            System.out.println("Tirando uma foto com o smartphone.");
        } else {
            System.out.println("Não é possível tirar foto. O smartphone está desligado.");
        }
    }

    public void reproduzirMusica(String musica) {
        if (ligado) {
            System.out.println("Reproduzindo a música: " + musica);
        } else {
            System.out.println("Não é possível reproduzir música. O smartphone está desligado.");
        }
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("O smartphone está ligado.");
            ligado = true;
        } else {
            System.out.println("O smartphone já está ligado.");
        }
    }

    public static void main(String[] args) {
        Smartphone meuSmartphone = new Smartphone();
        meuSmartphone.ligar();
        meuSmartphone.tirarFoto();
        meuSmartphone.reproduzirMusica("Nome da Música");    
        Celular meuCelular = new Celular();
        meuCelular.ligar();
        meuCelular.enviarMensagem("Amigo", "Oi! Como você está?");
    }
}
