package MusicApp.Instruments;

public class Violin extends StringedInstrument {


  public Violin() {
    this(4);
  }
  public Violin(int nrOfStrings){
    this.numberOfStrings = nrOfStrings;
    this.name = "Violin";

  }
  public String sound(){
    return "Screech";

  }

}
