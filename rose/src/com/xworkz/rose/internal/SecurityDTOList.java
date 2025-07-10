package com.xworkz.rose.internal;

import com.xworkz.rose.dto.JobDTO;
import com.xworkz.rose.dto.SecurityDTO;

import java.util.LinkedList;
import java.util.List;

public class SecurityDTOList {
    public SecurityDTOList()
    {
        System.out.println("SecurityDTOList constructor");
    }

    public List<SecurityDTO> getSecurityList()
    {
        System.out.println("getSecurityList method in SecurityDTOList");
        List<SecurityDTO> list=new LinkedList<>();
        JobDTOList jobDTOList =new JobDTOList();
        List<JobDTO> jobList=jobDTOList.getJobList();

        SecurityDTO securityDTO1 = new SecurityDTO("High", true, "SEC001", jobList.get(0));
        SecurityDTO securityDTO2 = new SecurityDTO("Medium", true, "SEC002", jobList.get(1));
        SecurityDTO securityDTO3 = new SecurityDTO("Low", false, "SEC003", jobList.get(2));
        SecurityDTO securityDTO4 = new SecurityDTO("High", true, "SEC004", jobList.get(3));
        SecurityDTO securityDTO5 = new SecurityDTO("Medium", true, "SEC005", jobList.get(4));

        SecurityDTO securityDTO6 = new SecurityDTO("Low", false, "SEC006", jobList.get(5));
        SecurityDTO securityDTO7 = new SecurityDTO("High", true, "SEC007", jobList.get(6));
        SecurityDTO securityDTO8 = new SecurityDTO("Medium", true, "SEC008", jobList.get(7));
        SecurityDTO securityDTO9 = new SecurityDTO("Low", false, "SEC009", jobList.get(8));
        SecurityDTO securityDTO10 = new SecurityDTO("High", true, "SEC010", jobList.get(9));

        SecurityDTO securityDTO11 = new SecurityDTO("Medium", true, "SEC011", jobList.get(10));
        SecurityDTO securityDTO12 = new SecurityDTO("Low", false, "SEC012", jobList.get(11));
        SecurityDTO securityDTO13 = new SecurityDTO("High", true, "SEC013", jobList.get(12));
        SecurityDTO securityDTO14 = new SecurityDTO("Medium", true, "SEC014", jobList.get(13));
        SecurityDTO securityDTO15 = new SecurityDTO("Low", false, "SEC015", jobList.get(14));

        SecurityDTO securityDTO16 = new SecurityDTO("High", true, "SEC016", jobList.get(15));
        SecurityDTO securityDTO17 = new SecurityDTO("Medium", false, "SEC017", jobList.get(16));
        SecurityDTO securityDTO18 = new SecurityDTO("Low", false, "SEC018", jobList.get(17));
        SecurityDTO securityDTO19 = new SecurityDTO("High", true, "SEC019", jobList.get(18));
        SecurityDTO securityDTO20 = new SecurityDTO("Medium", true, "SEC020", jobList.get(19));

        SecurityDTO securityDTO21 = new SecurityDTO("Low", true, "SEC021", jobList.get(20));
        SecurityDTO securityDTO22 = new SecurityDTO("High", true, "SEC022", jobList.get(21));
        SecurityDTO securityDTO23 = new SecurityDTO("Medium", true, "SEC023", jobList.get(22));
        SecurityDTO securityDTO24 = new SecurityDTO("Low", false, "SEC024", jobList.get(23));
        SecurityDTO securityDTO25 = new SecurityDTO("High", true, "SEC025", jobList.get(24));

        SecurityDTO securityDTO26 = new SecurityDTO("Medium", false, "SEC026", jobList.get(25));
        SecurityDTO securityDTO27 = new SecurityDTO("Low", false, "SEC027", jobList.get(26));
        SecurityDTO securityDTO28 = new SecurityDTO("High", true, "SEC028", jobList.get(27));
        SecurityDTO securityDTO29 = new SecurityDTO("Medium", true, "SEC029", jobList.get(28));
        SecurityDTO securityDTO30 = new SecurityDTO("Low", true, "SEC030", jobList.get(29));

        list.add(securityDTO1);
        list.add(securityDTO2);
        list.add(securityDTO3);
        list.add(securityDTO4);
        list.add(securityDTO5);
        list.add(securityDTO6);
        list.add(securityDTO7);
        list.add(securityDTO8);
        list.add(securityDTO9);
        list.add(securityDTO10);
        list.add(securityDTO11);
        list.add(securityDTO12);
        list.add(securityDTO13);
        list.add(securityDTO14);
        list.add(securityDTO15);
        list.add(securityDTO16);
        list.add(securityDTO17);
        list.add(securityDTO18);
        list.add(securityDTO19);
        list.add(securityDTO20);
        list.add(securityDTO21);
        list.add(securityDTO22);
        list.add(securityDTO23);
        list.add(securityDTO24);
        list.add(securityDTO25);
        list.add(securityDTO26);
        list.add(securityDTO27);
        list.add(securityDTO28);
        list.add(securityDTO29);
        list.add(securityDTO30);

        return list;
    }
}
