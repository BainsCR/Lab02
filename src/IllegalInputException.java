
public class IllegalInputException extends CalculatorException{

    public IllegalInputException(String msg) {
        super(msg);
        //TODO Auto-generated constructor stub
    }

    private String illegalType = "Illegal input";


    public String getIllegalType(){
        return illegalType;
    }

}
