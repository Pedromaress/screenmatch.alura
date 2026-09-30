package alura.filme.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int epsodiosPorTemporadas;
    private boolean ativa;
    private int minutosPorEpsodio;


    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsodiosPorTemporadas() {
        return epsodiosPorTemporadas;
    }

    public void setEpsodiosPorTemporadas(int epsodiosPorTemporadas) {
        this.epsodiosPorTemporadas = epsodiosPorTemporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * epsodiosPorTemporadas * minutosPorEpsodio;
    }
}
