package com.xworkz.tom.dto;

import com.xworkz.tom.util.AppType;
import com.xworkz.tom.util.Version;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@ToString
@AllArgsConstructor
public class ApplicationInfoDto implements Comparable<ApplicationInfoDto>{
    private String name;
    private Version version;
    private LocalDate createdDate;
    private double size;
    private AppType type;
    private boolean isFree;
    private double chargePerUser;
    private List<OwnerDto> owners;

    @Override
    public int compareTo(ApplicationInfoDto o) {
        return this.name.compareTo(o.name);
    }
}
