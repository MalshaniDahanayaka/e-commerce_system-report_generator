package readData.repository;

public class DataRepositoryException extends Exception {

        public DataRepositoryException(Exception e, String message) {
            super(message,e);
        }


}
