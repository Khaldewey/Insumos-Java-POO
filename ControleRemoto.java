public class ControleRemoto implements Controlador {
  private int volume;
  private Boolean ligado;
  private Boolean tocando;

  public ControleRemoto() {
    this.ligado = false;
    this.tocando = false;
    this.volume = 50;
  }

  public Boolean getLigado() {
    return ligado;
  }

  public Boolean getTocando() {
    return tocando;
  }

  public int getVolume() {
    return volume;
  }

  public void setLigado(Boolean ligado) {
    this.ligado = ligado;
  }

  public void setTocando(Boolean tocando) {
    this.tocando = tocando;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  @Override
  public void ligar() {
    this.setLigado(true);

  }

  @Override
  public void desligar() {
    this.setLigado(false);

  }

  @Override
  public void abrirMenu() {
    System.out.println("----MENU----");
    System.out.println("Está ligado? " + this.getLigado());
    System.out.println("Está tocando? " + this.getTocando());
    System.out.print("Volume " + this.getVolume());
    for (int i = 0; i <= this.getVolume(); i += 10) {
      System.out.print("|");
    }

  }

  @Override
  public void fecharMenu() {
    System.out.println("Fechando menu");

  }

  @Override
  public void maisVolume() {
    if (this.getLigado()) {
      this.setVolume(this.getVolume() + 1);
    }

  }

  @Override
  public void menosVolume() {
    if (this.getLigado()) {
      this.setVolume(this.getVolume() - 1);
    }
  }

  @Override
  public void ligarMudo() {
    if (getLigado() && getVolume() > 0) {
      this.setVolume(0);
    }

  }

  @Override
  public void desligarMudo() {
    if (getLigado() && getVolume() == 0) {
      this.setVolume(50);
    }

  }

  @Override
  public void play() {
    if (this.getLigado() && !(this.getTocando())) {
      this.setTocando(true);
    }

  }

  @Override
  public void pause() {
    if (this.getLigado() && (this.getTocando())) {
      this.setTocando(false);
    }

  }
}
