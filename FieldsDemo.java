public class FieldsDemo{

  public static void main (String[] args){

    Fields field1 = new Fields();
    Fields field2 = new Fields();

    field1.printFields();
    field2.printFields();

    field1.intField = 10;

    field1.printFields();
    field2.printFields();

    Fields.classVariable = 10;

    field1.printFields();
    field2.printFields();

  }
}

public class Fields{

  //class variable
  public static int classVariable;

  //fields
  public int intField;

  //constructor
  public Fields(){
    this.intField=1;
  }

  //methods
  public void printFields(){
    System.out.println("intField: "+this.intField);
    System.out.println("classVariable: "+classVariable);
  }
}
