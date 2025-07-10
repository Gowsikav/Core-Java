package com.xworkz.rose.internal;

import com.xworkz.rose.dto.DetailDTO;
import com.xworkz.rose.dto.EducationDTO;

import java.util.LinkedList;
import java.util.List;

public class DetailDTOList {

    public DetailDTOList()
    {
        System.out.println("DetailDTOList constructor");
    }

    public List<DetailDTO> getDetailDTOList() {
        System.out.println("getDetailDTOList method in DetailDTOList");

        List<DetailDTO> list = new LinkedList<>();
        EducationDTOList educationDTOList = new EducationDTOList();
        List<EducationDTO> educationList=educationDTOList.getEducationDTOList();

        DetailDTO detailDTO1 = new DetailDTO(1, "Top performer", true, educationList.get(0));
        DetailDTO detailDTO2 = new DetailDTO(2, "Excellent project work", true, educationList.get(1));
        DetailDTO detailDTO3 = new DetailDTO(3, "Consistent learner", true, educationList.get(2));
        DetailDTO detailDTO4 = new DetailDTO(4, "Quick problem solver", false, educationList.get(3));
        DetailDTO detailDTO5 = new DetailDTO(5, "Good communicator", true, educationList.get(4));

        DetailDTO detailDTO6 = new DetailDTO(6, "Team player", true, educationList.get(5));
        DetailDTO detailDTO7 = new DetailDTO(7, "Self-motivated", false, educationList.get(6));
        DetailDTO detailDTO8 = new DetailDTO(8, "Creative thinker", true, educationList.get(7));
        DetailDTO detailDTO9 = new DetailDTO(9, "Disciplined", true, educationList.get(8));
        DetailDTO detailDTO10 = new DetailDTO(10, "Time management skills", true, educationList.get(9));

        DetailDTO detailDTO11 = new DetailDTO(11, "Leadership qualities", true, educationList.get(10));
        DetailDTO detailDTO12 = new DetailDTO(12, "Analytical mindset", false, educationList.get(11));
        DetailDTO detailDTO13 = new DetailDTO(13, "Strong fundamentals", true, educationList.get(12));
        DetailDTO detailDTO14 = new DetailDTO(14, "Goal-oriented", true, educationList.get(13));
        DetailDTO detailDTO15 = new DetailDTO(15, "Takes initiative", true, educationList.get(14));

        DetailDTO detailDTO16 = new DetailDTO(16, "Logical thinker", true, educationList.get(15));
        DetailDTO detailDTO17 = new DetailDTO(17, "Great at collaboration", true, educationList.get(16));
        DetailDTO detailDTO18 = new DetailDTO(18, "Technically sound", true, educationList.get(17));
        DetailDTO detailDTO19 = new DetailDTO(19, "Positive attitude", false, educationList.get(18));
        DetailDTO detailDTO20 = new DetailDTO(20, "Handles pressure well", true, educationList.get(19));

        DetailDTO detailDTO21 = new DetailDTO(21, "Attention to detail", true, educationList.get(20));
        DetailDTO detailDTO22 = new DetailDTO(22, "High integrity", true, educationList.get(21));
        DetailDTO detailDTO23 = new DetailDTO(23, "Good presentation skills", false, educationList.get(22));
        DetailDTO detailDTO24 = new DetailDTO(24, "Excellent in documentation", true, educationList.get(23));
        DetailDTO detailDTO25 = new DetailDTO(25, "Client-focused", true, educationList.get(24));

        DetailDTO detailDTO26 = new DetailDTO(26, "Innovative", true, educationList.get(25));
        DetailDTO detailDTO27 = new DetailDTO(27, "Empathetic leader", false, educationList.get(26));
        DetailDTO detailDTO28 = new DetailDTO(28, "Multitasker", true, educationList.get(27));
        DetailDTO detailDTO29 = new DetailDTO(29, "Driven by excellence", true, educationList.get(28));
        DetailDTO detailDTO30 = new DetailDTO(30, "Quick learner", true, educationList.get(29));

        list.add(detailDTO1);
        list.add(detailDTO2);
        list.add(detailDTO3);
        list.add(detailDTO4);
        list.add(detailDTO5);
        list.add(detailDTO6);
        list.add(detailDTO7);
        list.add(detailDTO8);
        list.add(detailDTO9);
        list.add(detailDTO10);
        list.add(detailDTO11);
        list.add(detailDTO12);
        list.add(detailDTO13);
        list.add(detailDTO14);
        list.add(detailDTO15);
        list.add(detailDTO16);
        list.add(detailDTO17);
        list.add(detailDTO18);
        list.add(detailDTO19);
        list.add(detailDTO20);
        list.add(detailDTO21);
        list.add(detailDTO22);
        list.add(detailDTO23);
        list.add(detailDTO24);
        list.add(detailDTO25);
        list.add(detailDTO26);
        list.add(detailDTO27);
        list.add(detailDTO28);
        list.add(detailDTO29);
        list.add(detailDTO30);

        return list;
    }

}
