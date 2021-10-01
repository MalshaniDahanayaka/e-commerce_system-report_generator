class ReadDataFromDatabase{

    public String dataFromDatabase(String filetype){

            Connection connection=null;
            DatabaseConnector obj_DB_Connection=new DatabaseConnector();
            connection=obj_DB_Connection.getConnection();
            ResultSet rs=null;

            String query="select * from"+filetype;
            PreparedStatement ps= connection.prepareStatement(query);
            rs=ps.executeQuery();
            return rs;


    

}