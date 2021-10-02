package readData.operations;

public interface Operation {
    String execute(Double[] numbers) throws  InvalidReportSenderAppOperationException;
}
