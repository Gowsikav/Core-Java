package com.xworkz.rose.runner;

import com.xworkz.rose.dto.CustomerDTO;
import com.xworkz.rose.dto.JobDTO;
import com.xworkz.rose.internal.CustomerDTOList;

import java.util.Comparator;
import java.util.List;

public class CustomerRunner {

    public static void main(String[] args) {

        CustomerDTOList customerDTOList=new CustomerDTOList();
        List<CustomerDTO> customerList =customerDTOList.getCustomerList();
        System.out.println("===========================================");
        System.out.println("Sort the collection by company:name in desc");
        customerList.stream().sorted(Comparator.comparing(CustomerDTO::getName).reversed())
                .forEach(e-> System.out.println(e.getName()));

        System.out.println("===========================================");
        System.out.println("Find a customer by job role");
        customerList.stream().filter(customerDTO -> {
            JobDTO jobDTO=customerDTO.getPassportDTO().getCountryDTO().getPresidentDTO().getDriverDTO().getVehicleDTO().getCompanyDTO().getCeodto().getHouseDTO().getSecurityDTO().getJobDTO();
            return jobDTO.getRole().equalsIgnoreCase("Backend Developer");
        }).forEach(customerDTO -> System.out.println(customerDTO.getName()));

        System.out.println("===========================================");
        System.out.println("Sort by Country:name in desc country list");
        customerList.stream().sorted(Comparator.comparing(
                customerDTO -> customerDTO.getPassportDTO().getCountryDTO().getName(), Comparator.reverseOrder()))
                .forEach(e-> System.out.println(e.getPassportDTO().getCountryDTO().getName()));

        System.out.println("===========================================");
        System.out.println("Sort by education:qualification in asc Degree list");
        customerList.stream().sorted(Comparator.comparing(
                customerDTO -> customerDTO.getPassportDTO().getCountryDTO().getPresidentDTO().getDriverDTO().getVehicleDTO().getCompanyDTO().getCeodto().getHouseDTO().getSecurityDTO().getJobDTO().getDetailDTO().getEducationDTO().getDegree(), Comparator.naturalOrder()))
                .forEach(customerDTO -> System.out.println(customerDTO.getPassportDTO().getCountryDTO().getPresidentDTO().getDriverDTO().getVehicleDTO().getCompanyDTO().getCeodto().getHouseDTO().getSecurityDTO().getJobDTO().getDetailDTO().getEducationDTO().getDegree()));

        System.out.println("============================================ ");
        System.out.println("Collect all unique Country");
        customerList.stream().distinct().
                forEach(customerDTO -> System.out.println(customerDTO.getPassportDTO().getCountryDTO().getName()));
    }
}