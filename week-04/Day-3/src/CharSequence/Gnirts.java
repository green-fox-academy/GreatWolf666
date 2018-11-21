package CharSequence;

public class Gnirts implements CharSequence {
  String whatSoEver;

  Gnirts(String whatSoEver){
    this.whatSoEver = whatSoEver;

  }
  @Override
  public int length(){
    return whatSoEver.length();
  }
  @Override
  public char charAt(int index){
    return whatSoEver.charAt(length() - index -1);
  }
  @Override
  public CharSequence subSequence(int start, int end){
    return null;
  }
}
