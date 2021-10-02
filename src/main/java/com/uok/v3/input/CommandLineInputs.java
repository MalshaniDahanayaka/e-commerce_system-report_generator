package readData.input;

public class CommandLineInputs implements Inputs{

    private final String[] args;

    //Constructor
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }


    public String getOperator() throws InavalidInputException {

        if (args.length == 0) {

            throw new InavalidInputException("Please provie the operation as an argument");
        }
        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            throw new InavalidInputException("please provide the add , sub or mul as the operator argument");

        }
        return operator;

    }



}
