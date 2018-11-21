package MusicApp.Instruments;

public abstract class StringedInstrument extends Instrument {

  protected int numberOfStrings;
  protected String sound;

  public abstract String sound ();

  public void play(){
    System.out.println(name + ", a "
        + numberOfStrings
        + "-stringed instrument that goes"
        + sound());
  }

}
