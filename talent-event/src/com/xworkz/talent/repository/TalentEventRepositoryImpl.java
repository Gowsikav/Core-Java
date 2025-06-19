package com.xworkz.talent.repository;

import com.xworkz.talent.constant.JdbcProperties;
import com.xworkz.talent.dto.TalentEventDto;

import java.sql.*;
import java.util.Optional;

public class TalentEventRepositoryImpl implements TalentEventRepository{
    public TalentEventRepositoryImpl()
    {
        System.out.println("TalentEvent Repository implementation constructor");
    }

    @Override
    public boolean persist(TalentEventDto talentEventDto) {
        System.out.println("persist method in TalentEvent Repository implementation");

        String sql="INSERT INTO talent_show_event VALUES(?,?,?,?,?,?,?);";
        try{
            Class.forName(JdbcProperties.DRIVER.getProperty());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try(Connection connection= DriverManager.getConnection(JdbcProperties.URL.getProperty(),
                JdbcProperties.USERNAME.getProperty(), JdbcProperties.SECRET.getProperty());
            PreparedStatement preparedStatement=connection.prepareStatement(sql)) {

            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,talentEventDto.getName());
            preparedStatement.setString(3,talentEventDto.getAge());
            preparedStatement.setString(4, String.valueOf(talentEventDto.getContact()));
            preparedStatement.setString(5,talentEventDto.getTalentType());
            preparedStatement.setString(6, talentEventDto.getDescription());
            preparedStatement.setTimestamp(7,talentEventDto.getCreatedAt());

            int row=preparedStatement.executeUpdate();
            if(row>0)
            {
                System.out.println("Details stored in DB");
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Details not saved in DB");
        return false;
    }

    @Override
    public Optional<TalentEventDto> findById(int eventId) {
        System.out.println("findById in TalentEvent Repository implementation");

        String sql="SELECT * FROM talent_show_event WHERE talent_id=?;";
        try{
            Class.forName(JdbcProperties.DRIVER.getProperty());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try(Connection connection= DriverManager.getConnection(JdbcProperties.URL.getProperty(),
                JdbcProperties.USERNAME.getProperty(), JdbcProperties.SECRET.getProperty());
            PreparedStatement preparedStatement=connection.prepareStatement(sql)) {

            preparedStatement.setInt(1,eventId);
            ResultSet resultSet =preparedStatement.executeQuery();
            TalentEventDto talentEventDto=null;
            while (resultSet.next())
            {
                talentEventDto=new TalentEventDto();
                talentEventDto.setName(resultSet.getString("participant_name"));
                talentEventDto.setAge(resultSet.getString("age"));
                talentEventDto.setContact(Long.parseLong(resultSet.getString("contact")));
                talentEventDto.setTalentType(resultSet.getString("talent_type"));
                talentEventDto.setDescription(resultSet.getString("description"));
                talentEventDto.setCreatedAt(Timestamp.valueOf(resultSet.getString("created_at")));

            }
            if(talentEventDto != null) {
                return Optional.of(talentEventDto);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return Optional.empty();
    }
}
