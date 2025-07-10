package com.xworkz.rose.internal;

import com.xworkz.rose.dto.DetailDTO;
import com.xworkz.rose.dto.JobDTO;

import java.util.LinkedList;
import java.util.List;

public class JobDTOList {
    public JobDTOList()
    {
        System.out.println("JobDTOList constructor");
    }

    public List<JobDTO> getJobList()
    {
        System.out.println("getJobList method in JobDTOList");

        List<JobDTO> list=new LinkedList<>();
        DetailDTOList detailDTOList=new DetailDTOList();
        List<DetailDTO> detailList=detailDTOList.getDetailDTOList();

        JobDTO jobDTO1 = new JobDTO("Engineer", "Development", 70000, detailList.get(0));
        JobDTO jobDTO2 = new JobDTO("Senior Engineer", "Development", 85000, detailList.get(1));
        JobDTO jobDTO3 = new JobDTO("Analyst", "Business Intelligence", 65000, detailList.get(2));
        JobDTO jobDTO4 = new JobDTO("Data Scientist", "AI/ML", 95000, detailList.get(3));
        JobDTO jobDTO5 = new JobDTO("System Administrator", "IT Support", 60000, detailList.get(4));
        JobDTO jobDTO6 = new JobDTO("Project Manager", "Management", 100000, detailList.get(5));
        JobDTO jobDTO7 = new JobDTO("QA Engineer", "Testing", 68000, detailList.get(6));
        JobDTO jobDTO8 = new JobDTO("DevOps Engineer", "Cloud", 88000, detailList.get(7));
        JobDTO jobDTO9 = new JobDTO("UI/UX Designer", "Design", 72000, detailList.get(8));
        JobDTO jobDTO10 = new JobDTO("Technical Writer", "Documentation", 58000, detailList.get(9));

        JobDTO jobDTO11 = new JobDTO("Backend Developer", "Development", 77000, detailList.get(10));
        JobDTO jobDTO12 = new JobDTO("Frontend Developer", "Development", 75000, detailList.get(11));
        JobDTO jobDTO13 = new JobDTO("IT Consultant", "Consulting", 90000, detailList.get(12));
        JobDTO jobDTO14 = new JobDTO("Business Analyst", "Business", 70000, detailList.get(13));
        JobDTO jobDTO15 = new JobDTO("Network Engineer", "Infrastructure", 68000, detailList.get(14));
        JobDTO jobDTO16 = new JobDTO("Database Administrator", "Database", 79000, detailList.get(15));
        JobDTO jobDTO17 = new JobDTO("Product Manager", "Product", 105000, detailList.get(16));
        JobDTO jobDTO18 = new JobDTO("Security Analyst", "Cybersecurity", 87000, detailList.get(17));
        JobDTO jobDTO19 = new JobDTO("Cloud Architect", "Cloud", 110000, detailList.get(18));
        JobDTO jobDTO20 = new JobDTO("Technical Support", "Support", 54000, detailList.get(19));

        JobDTO jobDTO21 = new JobDTO("HR Specialist", "Human Resources", 60000, detailList.get(20));
        JobDTO jobDTO22 = new JobDTO("Recruiter", "Human Resources", 62000, detailList.get(21));
        JobDTO jobDTO23 = new JobDTO("Operations Manager", "Operations", 95000, detailList.get(22));
        JobDTO jobDTO24 = new JobDTO("Marketing Executive", "Marketing", 65000, detailList.get(23));
        JobDTO jobDTO25 = new JobDTO("Sales Executive", "Sales", 70000, detailList.get(24));
        JobDTO jobDTO26 = new JobDTO("Finance Analyst", "Finance", 74000, detailList.get(25));
        JobDTO jobDTO27 = new JobDTO("Compliance Officer", "Legal", 80000, detailList.get(26));
        JobDTO jobDTO28 = new JobDTO("Content Strategist", "Content", 67000, detailList.get(27));
        JobDTO jobDTO29 = new JobDTO("Scrum Master", "Agile Team", 92000, detailList.get(28));
        JobDTO jobDTO30 = new JobDTO("AI Engineer", "R&D", 115000, detailList.get(29));

        list.add(jobDTO1);
        list.add(jobDTO2);
        list.add(jobDTO3);
        list.add(jobDTO4);
        list.add(jobDTO5);
        list.add(jobDTO6);
        list.add(jobDTO7);
        list.add(jobDTO8);
        list.add(jobDTO9);
        list.add(jobDTO10);
        list.add(jobDTO11);
        list.add(jobDTO12);
        list.add(jobDTO13);
        list.add(jobDTO14);
        list.add(jobDTO15);
        list.add(jobDTO16);
        list.add(jobDTO17);
        list.add(jobDTO18);
        list.add(jobDTO19);
        list.add(jobDTO20);
        list.add(jobDTO21);
        list.add(jobDTO22);
        list.add(jobDTO23);
        list.add(jobDTO24);
        list.add(jobDTO25);
        list.add(jobDTO26);
        list.add(jobDTO27);
        list.add(jobDTO28);
        list.add(jobDTO29);
        list.add(jobDTO30);

        return list;
    }
}
