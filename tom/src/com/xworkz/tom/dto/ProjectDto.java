package com.xworkz.tom.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@ToString
@AllArgsConstructor
public class ProjectDto {
    private int projectId;
    private String projectName;

    @Override
    public boolean equals(Object o) {
        if (o !=null)
        {
            if (o instanceof ProjectDto)
            {
                ProjectDto casted=(ProjectDto) o;
                return this.projectId == casted.projectId;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId);
    }
}
