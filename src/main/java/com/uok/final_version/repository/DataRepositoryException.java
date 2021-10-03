package com.uok.final_version.repository;

public class DataRepositoryException extends Exception {

        public DataRepositoryException(Exception e, String message) {
            super(message,e);
        }


}
