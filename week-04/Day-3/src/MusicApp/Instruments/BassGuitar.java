package MusicApp.Instruments;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(){
    this(4);

  }
  public BassGuitar(int nrOfStrings){
    this.numberOfStrings = nrOfStrings;
    this.name = "Bass Guitar";

  }
  public String sound(){
    return "Duum-duum-duum";
  }

}
