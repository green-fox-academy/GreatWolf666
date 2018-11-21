package CharSequence;

public class Shifter implements CharSequence {

  String something;
  int nrOfShifts;


  Shifter(String something, int nrOfShifts) {
    this.something = something;
    this.nrOfShifts = nrOfShifts;
  }

  @Override
  public int length() {
    return something.length();
  }

  @Override

  public char charAt(int index) {
    return something.charAt(index + nrOfShifts);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

}
