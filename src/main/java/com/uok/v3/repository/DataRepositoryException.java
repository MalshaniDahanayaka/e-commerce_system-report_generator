package com.uok.v3.repository;

public class DataRepositoryException extends Exception {

        public DataRepositoryException(Exception e, String message) {
            super(message,e);
        }


}
